package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 物资信息
 *
 * @author 
 * @email
 */
@TableName("wuzi")
public class WuziEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public WuziEntity() {

	}

	public WuziEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Wuzi{" +
            "id=" + id +
            ", wuziUuidUnmber=" + wuziUuidUnmber +
            ", wuziName=" + wuziName +
            ", wuziTypes=" + wuziTypes +
            ", wuziKucunNumber=" + wuziKucunNumber +
            ", wuziMin=" + wuziMin +
            ", wuziMax=" + wuziMax +
            ", wuziNewMoney=" + wuziNewMoney +
            ", wuziDanwei=" + wuziDanwei +
            ", wuziGongyingshang=" + wuziGongyingshang +
            ", cangkuId=" + cangkuId +
            ", createTime=" + createTime +
        "}";
    }
}
