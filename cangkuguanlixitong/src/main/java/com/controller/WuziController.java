
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 物资信息
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/wuzi")
public class WuziController {
    private static final Logger logger = LoggerFactory.getLogger(WuziController.class);

    @Autowired
    private WuziService wuziService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private CangkuService cangkuService;

    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("员工".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = wuziService.queryPage(params);

        //字典表数据转换
        List<WuziView> list =(List<WuziView>)page.getList();
        for(WuziView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        WuziEntity wuzi = wuziService.selectById(id);
        if(wuzi !=null){
            //entity转view
            WuziView view = new WuziView();
            BeanUtils.copyProperties( wuzi , view );//把实体数据重构到view中

                //级联表
                CangkuEntity cangku = cangkuService.selectById(wuzi.getCangkuId());
                if(cangku != null){
                    BeanUtils.copyProperties( cangku , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setCangkuId(cangku.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody WuziEntity wuzi, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,wuzi:{}",this.getClass().getName(),wuzi.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");

        Wrapper<WuziEntity> queryWrapper = new EntityWrapper<WuziEntity>()
            .eq("wuzi_uuid_unmber", wuzi.getWuziUuidUnmber())
            .eq("wuzi_name", wuzi.getWuziName())
            .eq("wuzi_types", wuzi.getWuziTypes())
            .eq("Wuzi_kucun_number", wuzi.getWuziKucunNumber())
            .eq("wuzi_min", wuzi.getWuziMin())
            .eq("wuzi_max", wuzi.getWuziMax())
            .eq("wuzi_danwei", wuzi.getWuziDanwei())
            .eq("wuzi_gongyingshang", wuzi.getWuziGongyingshang())
            .eq("cangku_id", wuzi.getCangkuId())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        WuziEntity wuziEntity = wuziService.selectOne(queryWrapper);
        if(wuziEntity==null){
            wuzi.setCreateTime(new Date());
            wuziService.insert(wuzi);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody WuziEntity wuzi, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,wuzi:{}",this.getClass().getName(),wuzi.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(StringUtil.isEmpty(role))
//            return R.error(511,"权限为空");
        //根据字段查询是否有相同数据
        Wrapper<WuziEntity> queryWrapper = new EntityWrapper<WuziEntity>()
            .notIn("id",wuzi.getId())
            .andNew()
            .eq("wuzi_uuid_unmber", wuzi.getWuziUuidUnmber())
            .eq("wuzi_name", wuzi.getWuziName())
            .eq("wuzi_types", wuzi.getWuziTypes())
            .eq("Wuzi_kucun_number", wuzi.getWuziKucunNumber())
            .eq("wuzi_min", wuzi.getWuziMin())
            .eq("wuzi_max", wuzi.getWuziMax())
            .eq("wuzi_danwei", wuzi.getWuziDanwei())
            .eq("wuzi_gongyingshang", wuzi.getWuziGongyingshang())
            .eq("cangku_id", wuzi.getCangkuId())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        WuziEntity wuziEntity = wuziService.selectOne(queryWrapper);
        if(wuziEntity==null){
            wuziService.updateById(wuzi);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        wuziService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<WuziEntity> wuziList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            WuziEntity wuziEntity = new WuziEntity();
//                            wuziEntity.setWuziUuidUnmber(data.get(0));                    //物资编号 要改的
//                            wuziEntity.setWuziName(data.get(0));                    //物资名称 要改的
//                            wuziEntity.setWuziTypes(Integer.valueOf(data.get(0)));   //物资类型 要改的
//                            wuziEntity.setWuziKucunNumber(Integer.valueOf(data.get(0)));   //物资数量 要改的
//                            wuziEntity.setWuziMin(Integer.valueOf(data.get(0)));   //最低预警值 要改的
//                            wuziEntity.setWuziMax(Integer.valueOf(data.get(0)));   //最高预警值 要改的
//                            wuziEntity.setWuziNewMoney(data.get(0));                    //物资价格 要改的
//                            wuziEntity.setWuziDanwei(data.get(0));                    //物资单位 要改的
//                            wuziEntity.setWuziGongyingshang(data.get(0));                    //供应商 要改的
//                            wuziEntity.setCangkuId(Integer.valueOf(data.get(0)));   //所在仓库 要改的
//                            wuziEntity.setCreateTime(date);//时间
                            wuziList.add(wuziEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        wuziService.insertBatch(wuziList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}
