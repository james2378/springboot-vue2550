package com.entity.model;

import com.entity.WuziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 物资信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class WuziModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 物资编号
     */
    private String wuziUuidUnmber;


    /**
     * 物资名称
     */
    private String wuziName;


    /**
     * 物资类型
     */
    private Integer wuziTypes;


    /**
     * 物资数量
     */
    private Integer wuziKucunNumber;


    /**
     * 最低预警值
     */
    private Integer wuziMin;


    /**
     * 最高预警值
     */
    private Integer wuziMax;


    /**
     * 物资价格
     */
    private Double wuziNewMoney;


    /**
     * 物资单位
     */
    private String wuziDanwei;


    /**
     * 供应商
     */
    private String wuziGongyingshang;


    /**
     * 所在仓库
     */
    private Integer cangkuId;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：物资编号
	 */
    public String getWuziUuidUnmber() {
        return wuziUuidUnmber;
    }


    /**
	 * 设置：物资编号
	 */
    public void setWuziUuidUnmber(String wuziUuidUnmber) {
        this.wuziUuidUnmber = wuziUuidUnmber;
    }
    /**
	 * 获取：物资名称
	 */
    public String getWuziName() {
        return wuziName;
    }


    /**
	 * 设置：物资名称
	 */
    public void setWuziName(String wuziName) {
        this.wuziName = wuziName;
    }
    /**
	 * 获取：物资类型
	 */
    public Integer getWuziTypes() {
        return wuziTypes;
    }


    /**
	 * 设置：物资类型
	 */
    public void setWuziTypes(Integer wuziTypes) {
        this.wuziTypes = wuziTypes;
    }
    /**
	 * 获取：物资数量
	 */
    public Integer getWuziKucunNumber() {
        return wuziKucunNumber;
    }


    /**
	 * 设置：物资数量
	 */
    public void setWuziKucunNumber(Integer wuziKucunNumber) {
        this.wuziKucunNumber = wuziKucunNumber;
    }
    /**
	 * 获取：最低预警值
	 */
    public Integer getWuziMin() {
        return wuziMin;
    }


    /**
	 * 设置：最低预警值
	 */
    public void setWuziMin(Integer wuziMin) {
        this.wuziMin = wuziMin;
    }
    /**
	 * 获取：最高预警值
	 */
    public Integer getWuziMax() {
        return wuziMax;
    }


    /**
	 * 设置：最高预警值
	 */
    public void setWuziMax(Integer wuziMax) {
        this.wuziMax = wuziMax;
    }
    /**
	 * 获取：物资价格
	 */
    public Double getWuziNewMoney() {
        return wuziNewMoney;
    }


    /**
	 * 设置：物资价格
	 */
    public void setWuziNewMoney(Double wuziNewMoney) {
        this.wuziNewMoney = wuziNewMoney;
    }
    /**
	 * 获取：物资单位
	 */
    public String getWuziDanwei() {
        return wuziDanwei;
    }


    /**
	 * 设置：物资单位
	 */
    public void setWuziDanwei(String wuziDanwei) {
        this.wuziDanwei = wuziDanwei;
    }
    /**
	 * 获取：供应商
	 */
    public String getWuziGongyingshang() {
        return wuziGongyingshang;
    }


    /**
	 * 设置：供应商
	 */
    public void setWuziGongyingshang(String wuziGongyingshang) {
        this.wuziGongyingshang = wuziGongyingshang;
    }
    /**
	 * 获取：所在仓库
	 */
    public Integer getCangkuId() {
        return cangkuId;
    }


    /**
	 * 设置：所在仓库
	 */
    public void setCangkuId(Integer cangkuId) {
        this.cangkuId = cangkuId;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
