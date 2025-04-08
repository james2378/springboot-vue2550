package com.entity.model;

import com.entity.CangkuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 仓库信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class CangkuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 所在区域
     */
    private String cangkuAddress;


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
	 * 获取：仓库编号
	 */
    public String getCangkuUuidUnmber() {
        return cangkuUuidUnmber;
    }


    /**
	 * 设置：仓库编号
	 */
    public void setCangkuUuidUnmber(String cangkuUuidUnmber) {
        this.cangkuUuidUnmber = cangkuUuidUnmber;
    }
    /**
	 * 获取：仓库名称
	 */
    public String getCangkuName() {
        return cangkuName;
    }


    /**
	 * 设置：仓库名称
	 */
    public void setCangkuName(String cangkuName) {
        this.cangkuName = cangkuName;
    }
    /**
	 * 获取：仓库类型
	 */
    public Integer getCangkuTypes() {
        return cangkuTypes;
    }


    /**
	 * 设置：仓库类型
	 */
    public void setCangkuTypes(Integer cangkuTypes) {
        this.cangkuTypes = cangkuTypes;
    }
    /**
	 * 获取：所在区域
	 */
    public String getCangkuAddress() {
        return cangkuAddress;
    }


    /**
	 * 设置：所在区域
	 */
    public void setCangkuAddress(String cangkuAddress) {
        this.cangkuAddress = cangkuAddress;
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
