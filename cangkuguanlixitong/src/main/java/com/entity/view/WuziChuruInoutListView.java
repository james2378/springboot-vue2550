package com.entity.view;

import com.entity.WuziChuruInoutListEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 出入库详情
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("wuzi_churu_inout_list")
public class WuziChuruInoutListView extends WuziChuruInoutListEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 wuzi
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
				* 物资类型的值
				*/
				private String wuziValue;
			/**
			* 物资数量
			*/
			private Integer WuziKucunNumber;
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

		//级联表 wuzi_churu_inout
			/**
			* 出入库流水号
			*/
			private String wuziChuruInoutUuidNumber;
			/**
			* 出入库名称
			*/
			private String wuziChuruInoutName;
			/**
			* 出入库类型
			*/
			private Integer wuziChuruInoutTypes;
				/**
				* 出入库类型的值
				*/
				private String wuziChuruInoutValue;
			/**
			* 备注
			*/
			private String wuziChuruInoutContent;

	public WuziChuruInoutListView() {

	}

	public WuziChuruInoutListView(WuziChuruInoutListEntity wuziChuruInoutListEntity) {
		try {
			BeanUtils.copyProperties(this, wuziChuruInoutListEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}














				//级联表的get和set wuzi
					/**
					* 获取： 物资编号
					*/
					public String getWuziUuidUnmber() {
						return wuziUuidUnmber;
					}
					/**
					* 设置： 物资编号
					*/
					public void setWuziUuidUnmber(String wuziUuidUnmber) {
						this.wuziUuidUnmber = wuziUuidUnmber;
					}
					/**
					* 获取： 物资名称
					*/
					public String getWuziName() {
						return wuziName;
					}
					/**
					* 设置： 物资名称
					*/
					public void setWuziName(String wuziName) {
						this.wuziName = wuziName;
					}
					/**
					* 获取： 物资类型
					*/
					public Integer getWuziTypes() {
						return wuziTypes;
					}
					/**
					* 设置： 物资类型
					*/
					public void setWuziTypes(Integer wuziTypes) {
						this.wuziTypes = wuziTypes;
					}


						/**
						* 获取： 物资类型的值
						*/
						public String getWuziValue() {
							return wuziValue;
						}
						/**
						* 设置： 物资类型的值
						*/
						public void setWuziValue(String wuziValue) {
							this.wuziValue = wuziValue;
						}
					/**
					* 获取： 物资数量
					*/
					public Integer getWuziKucunNumber() {
						return WuziKucunNumber;
					}
					/**
					* 设置： 物资数量
					*/
					public void setWuziKucunNumber(Integer WuziKucunNumber) {
						this.WuziKucunNumber = WuziKucunNumber;
					}
					/**
					* 获取： 最低预警值
					*/
					public Integer getWuziMin() {
						return wuziMin;
					}
					/**
					* 设置： 最低预警值
					*/
					public void setWuziMin(Integer wuziMin) {
						this.wuziMin = wuziMin;
					}
					/**
					* 获取： 最高预警值
					*/
					public Integer getWuziMax() {
						return wuziMax;
					}
					/**
					* 设置： 最高预警值
					*/
					public void setWuziMax(Integer wuziMax) {
						this.wuziMax = wuziMax;
					}
					/**
					* 获取： 物资价格
					*/
					public Double getWuziNewMoney() {
						return wuziNewMoney;
					}
					/**
					* 设置： 物资价格
					*/
					public void setWuziNewMoney(Double wuziNewMoney) {
						this.wuziNewMoney = wuziNewMoney;
					}
					/**
					* 获取： 物资单位
					*/
					public String getWuziDanwei() {
						return wuziDanwei;
					}
					/**
					* 设置： 物资单位
					*/
					public void setWuziDanwei(String wuziDanwei) {
						this.wuziDanwei = wuziDanwei;
					}
					/**
					* 获取： 供应商
					*/
					public String getWuziGongyingshang() {
						return wuziGongyingshang;
					}
					/**
					* 设置： 供应商
					*/
					public void setWuziGongyingshang(String wuziGongyingshang) {
						this.wuziGongyingshang = wuziGongyingshang;
					}



				//级联表的get和set wuzi_churu_inout
					/**
					* 获取： 出入库流水号
					*/
					public String getWuziChuruInoutUuidNumber() {
						return wuziChuruInoutUuidNumber;
					}
					/**
					* 设置： 出入库流水号
					*/
					public void setWuziChuruInoutUuidNumber(String wuziChuruInoutUuidNumber) {
						this.wuziChuruInoutUuidNumber = wuziChuruInoutUuidNumber;
					}
					/**
					* 获取： 出入库名称
					*/
					public String getWuziChuruInoutName() {
						return wuziChuruInoutName;
					}
					/**
					* 设置： 出入库名称
					*/
					public void setWuziChuruInoutName(String wuziChuruInoutName) {
						this.wuziChuruInoutName = wuziChuruInoutName;
					}
					/**
					* 获取： 出入库类型
					*/
					public Integer getWuziChuruInoutTypes() {
						return wuziChuruInoutTypes;
					}
					/**
					* 设置： 出入库类型
					*/
					public void setWuziChuruInoutTypes(Integer wuziChuruInoutTypes) {
						this.wuziChuruInoutTypes = wuziChuruInoutTypes;
					}


						/**
						* 获取： 出入库类型的值
						*/
						public String getWuziChuruInoutValue() {
							return wuziChuruInoutValue;
						}
						/**
						* 设置： 出入库类型的值
						*/
						public void setWuziChuruInoutValue(String wuziChuruInoutValue) {
							this.wuziChuruInoutValue = wuziChuruInoutValue;
						}
					/**
					* 获取： 备注
					*/
					public String getWuziChuruInoutContent() {
						return wuziChuruInoutContent;
					}
					/**
					* 设置： 备注
					*/
					public void setWuziChuruInoutContent(String wuziChuruInoutContent) {
						this.wuziChuruInoutContent = wuziChuruInoutContent;
					}










}
