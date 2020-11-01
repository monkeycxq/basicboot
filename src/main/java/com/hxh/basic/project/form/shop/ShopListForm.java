package com.hxh.basic.project.form.shop;

import com.hxh.basic.project.form.PageForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.Range;

@Data
@ApiModel("获取店铺列表需要的表单数据")
@EqualsAndHashCode(callSuper = false)
public class ShopListForm extends PageForm<ShopListForm> {

    @ApiModelProperty(value = "店铺状态",example = "1",allowableValues = "1,0")
    @Range(min =  0 , max = 1 , message = "店铺状态有误")
    private Integer status;

    @ApiModelProperty(value = "店铺名称",example= "铺")
    private String name;
}
