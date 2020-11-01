package com.hxh.basic.project.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author cxq
 * @since 2020-11-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Shop implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 店铺名称
     */
    private String name;

    /**
     * 店铺编码
     */
    private String code;

    /**
     * 所属用户
     */
    @TableField("userId")
    private Integer userId;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 店铺地址
     */
    private String address;

    /**
     * 店铺状态（1开业 0停业）
     */
    private Integer status;

    @TableField("createTime")
    private LocalDateTime createTime;

    @TableField("updateTime")
    private LocalDateTime updateTime;


}
