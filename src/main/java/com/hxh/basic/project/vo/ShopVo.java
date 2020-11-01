package com.hxh.basic.project.vo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author cxq
 * Date:  2020-11-01
 * Description: 店铺视图模型
 */
@Data
@ApiModel("店铺视图模型")
public class ShopVo{

    @ApiModelProperty("店铺主键")
    private Integer id;

    @ApiModelProperty("店铺名称")
    private String name;

    @ApiModelProperty("店铺编码")
    private String code;

    @ApiModelProperty("联系电话")
    private String phone;
    @ApiModelProperty("店铺地址")
    private String address;
    @ApiModelProperty("店铺状态")
    private Integer status;



}
