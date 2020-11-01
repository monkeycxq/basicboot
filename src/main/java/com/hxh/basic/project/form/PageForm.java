package com.hxh.basic.project.form;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

/**
 * @author huangxunhui
 * Date: Created in 2019-05-22 11:52
 * Utils: Intellij Idea
 * Description: 分页需要的表单数据
 */
@Data
@ApiModel(value = "分页数据", description = "分页需要的表单数据")
public class PageForm<T extends PageForm<?>>{

    /**
     * 页码
     */
    @ApiModelProperty(value = "页码 从第一页开始 1",example = "1")
    @Min(value = 1, message = "页码输入有误")
    private Integer current = 1;

    /**
     * 每页显示的数量
     */
    @ApiModelProperty(value = "每页显示的数量 范围在1~100",example = "10")
    @Range(min = 1, max = 100, message = "每页显示的数量输入有误")
    private Integer size = 10;

    @ApiModelProperty(value = "排序(正序asc，倒序desc)", example = "asc", allowableValues = "asc,desc")
    @Pattern(regexp="asc|desc",message="排序输入有误")
    private String orderBy;

    @ApiModelProperty(value = "排序字段",example = "id")
    @Pattern(regexp="^[A-Za-z0-9_]{0,20}$",message="排序字段输入有误,只能是字母数字或下划线")
    private String orderColumn = "id";

    /**
     * 计算当前页 ,方便mysql 进行分页查询
     * @return 返回 pageForm
     */
    @ApiModelProperty(hidden = true)
    public T calcCurrent(){
        current = (current - 1 ) * size;
        return (T) this;
    }
}

