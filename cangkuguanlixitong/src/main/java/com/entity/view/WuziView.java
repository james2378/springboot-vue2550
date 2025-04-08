package com.entity.view;

import com.entity.WuziEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 物资信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("wuzi")
public class WuziView extends WuziEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 物资类型的值
		*/
		private String wuziValue;



		//级联表 cangku
			/**
			* 仓库编号
			*/
			private String cangkuUuidUnmber;
			/**
			* 仓库名称
			*/
			private String cangkuName;
			/**
			* 仓库类型
			*/
			private Integer cangkuTypes;
				/**
				* 仓库类型的值
				*/
				private String cangkuValue;
			/**
			* 所在区域
			*/
			private String cangkuAddress;

	public WuziView() {

	}

	public WuziView(WuziEntity wuziEntity) {
		try {
			BeanUtils.copyProperties(this, wuziEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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




				//级联表的get和set cangku
					/**
					* 获取： 仓库编号
					*/
					public String getCangkuUuidUnmber() {
						return cangkuUuidUnmber;
					}
					/**
					* 设置： 仓库编号
					*/
					public void setCangkuUuidUnmber(String cangkuUuidUnmber) {
						this.cangkuUuidUnmber = cangkuUuidUnmber;
					}
					/**
					* 获取： 仓库名称
					*/
					public String getCangkuName() {
						return cangkuName;
					}
					/**
					* 设置： 仓库名称
					*/
					public void setCangkuName(String cangkuName) {
						this.cangkuName = cangkuName;
					}
					/**
					* 获取： 仓库类型
					*/
					public Integer getCangkuTypes() {
						return cangkuTypes;
					}
					/**
					* 设置： 仓库类型
					*/
					public void setCangkuTypes(Integer cangkuTypes) {
						this.cangkuTypes = cangkuTypes;
					}


						/**
						* 获取： 仓库类型的值
						*/
						public String getCangkuValue() {
							return cangkuValue;
						}
						/**
						* 设置： 仓库类型的值
						*/
						public void setCangkuValue(String cangkuValue) {
							this.cangkuValue = cangkuValue;
						}
					/**
					* 获取： 所在区域
					*/
					public String getCangkuAddress() {
						return cangkuAddress;
					}
					/**
					* 设置： 所在区域
					*/
					public void setCangkuAddress(String cangkuAddress) {
						this.cangkuAddress = cangkuAddress;
					}












}
