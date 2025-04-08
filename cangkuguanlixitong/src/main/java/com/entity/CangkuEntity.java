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
 * 仓库信息
 *
 * @author 
 * @email
 */
@TableName("cangku")
public class CangkuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CangkuEntity() {

	}

	public CangkuEntity(T t) {
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
     * 仓库编号
     */
    @TableField(value = "cangku_uuid_unmber")

    private String cangkuUuidUnmber;


    /**
     * 仓库名称
     */
    @TableField(value = "cangku_name")

    private String cangkuName;


    /**
     * 仓库类型
     */
    @TableField(value = "cangku_types")

    private Integer cangkuTypes;


    /**
     * 所在区域
     */
    @TableField(value = "cangku_address")

    private String cangkuAddress;


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
	 * 设置：仓库编号
	 */
    public String getCangkuUuidUnmber() {
        return cangkuUuidUnmber;
    }


    /**
	 * 获取：仓库编号
	 */

    public void setCangkuUuidUnmber(String cangkuUuidUnmber) {
        this.cangkuUuidUnmber = cangkuUuidUnmber;
    }
    /**
	 * 设置：仓库名称
	 */
    public String getCangkuName() {
        return cangkuName;
    }


    /**
	 * 获取：仓库名称
	 */

    public void setCangkuName(String cangkuName) {
        this.cangkuName = cangkuName;
    }
    /**
	 * 设置：仓库类型
	 */
    public Integer getCangkuTypes() {
        return cangkuTypes;
    }


    /**
	 * 获取：仓库类型
	 */

    public void setCangkuTypes(Integer cangkuTypes) {
        this.cangkuTypes = cangkuTypes;
    }
    /**
	 * 设置：所在区域
	 */
    public String getCangkuAddress() {
        return cangkuAddress;
    }


    /**
	 * 获取：所在区域
	 */

    public void setCangkuAddress(String cangkuAddress) {
        this.cangkuAddress = cangkuAddress;
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
        return "Cangku{" +
            "id=" + id +
            ", cangkuUuidUnmber=" + cangkuUuidUnmber +
            ", cangkuName=" + cangkuName +
            ", cangkuTypes=" + cangkuTypes +
            ", cangkuAddress=" + cangkuAddress +
            ", createTime=" + createTime +
        "}";
    }
}
