package com.entity.vo;

import com.entity.WuziEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 物资信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("wuzi")
public class WuziVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 物资编号
     */

    @TableField(value = "wuzi_uuid_unmber")
    private String wuziUuidUnmber;


    /**
     * 物资名称
     */

    @TableField(value = "wuzi_name")
    private String wuziName;


    /**
     * 物资类型
     */

    @TableField(value = "wuzi_types")
    private Integer wuziTypes;


    /**
     * 物资数量
     */

    @TableField(value = "Wuzi_kucun_number")
    private Integer wuziKucunNumber;


    /**
     * 最低预警值
     */

    @TableField(value = "wuzi_min")
    private Integer wuziMin;


    /**
     * 最高预警值
     */

    @TableField(value = "wuzi_max")
    private Integer wuziMax;


    /**
     * 物资价格
     */

    @TableField(value = "wuzi_new_money")
    private Double wuziNewMoney;


    /**
     * 物资单位
     */

    @TableField(value = "wuzi_danwei")
    private String wuziDanwei;


    /**
     * 供应商
     */

    @TableField(value = "wuzi_gongyingshang")
    private String wuziGongyingshang;


    /**
     * 所在仓库
     */

    @TableField(value = "cangku_id")
    private Integer cangkuId;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：物资编号
	 */
    public String getWuziUuidUnmber() {
        return wuziUuidUnmber;
    }


    /**
	 * 获取：物资编号
	 */

    public void setWuziUuidUnmber(String wuziUuidUnmber) {
        this.wuziUuidUnmber = wuziUuidUnmber;
    }
    /**
	 * 设置：物资名称
	 */
    public String getWuziName() {
        return wuziName;
    }


    /**
	 * 获取：物资名称
	 */

    public void setWuziName(String wuziName) {
        this.wuziName = wuziName;
    }
    /**
	 * 设置：物资类型
	 */
    public Integer getWuziTypes() {
        return wuziTypes;
    }


    /**
	 * 获取：物资类型
	 */

    public void setWuziTypes(Integer wuziTypes) {
        this.wuziTypes = wuziTypes;
    }
    /**
	 * 设置：物资数量
	 */
    public Integer getWuziKucunNumber() {
        return wuziKucunNumber;
    }


    /**
	 * 获取：物资数量
	 */

    public void setWuziKucunNumber(Integer wuziKucunNumber) {
        this.wuziKucunNumber = wuziKucunNumber;
    }
    /**
	 * 设置：最低预警值
	 */
    public Integer getWuziMin() {
        return wuziMin;
    }


    /**
	 * 获取：最低预警值
	 */

    public void setWuziMin(Integer wuziMin) {
        this.wuziMin = wuziMin;
    }
    /**
	 * 设置：最高预警值
	 */
    public Integer getWuziMax() {
        return wuziMax;
    }


    /**
	 * 获取：最高预警值
	 */

    public void setWuziMax(Integer wuziMax) {
        this.wuziMax = wuziMax;
    }
    /**
	 * 设置：物资价格
	 */
    public Double getWuziNewMoney() {
        return wuziNewMoney;
    }


    /**
	 * 获取：物资价格
	 */

    public void setWuziNewMoney(Double wuziNewMoney) {
        this.wuziNewMoney = wuziNewMoney;
    }
    /**
	 * 设置：物资单位
	 */
    public String getWuziDanwei() {
        return wuziDanwei;
    }


    /**
	 * 获取：物资单位
	 */

    public void setWuziDanwei(String wuziDanwei) {
        this.wuziDanwei = wuziDanwei;
    }
    /**
	 * 设置：供应商
	 */
    public String getWuziGongyingshang() {
        return wuziGongyingshang;
    }


    /**
	 * 获取：供应商
	 */

    public void setWuziGongyingshang(String wuziGongyingshang) {
        this.wuziGongyingshang = wuziGongyingshang;
    }
    /**
	 * 设置：所在仓库
	 */
    public Integer getCangkuId() {
        return cangkuId;
    }


    /**
	 * 获取：所在仓库
	 */

    public void setCangkuId(Integer cangkuId) {
        this.cangkuId = cangkuId;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
