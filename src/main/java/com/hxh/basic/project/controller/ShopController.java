package com.hxh.basic.project.controller;


import com.hxh.basic.project.form.shop.ShopListForm;
import com.hxh.basic.project.service.IShopService;
import com.hxh.basic.project.utils.ResultVoUtil;
import com.hxh.basic.project.vo.ResultVo;
import com.hxh.basic.project.vo.ShopVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cxq
 * @since 2020-11-01
 */
@RestController
@RequestMapping("/shop")
@Api(tags = "店铺")
@AllArgsConstructor
@Slf4j
public class ShopController {

    private IShopService shopService;

    /**
     * 获取店铺列表
     * @return 店铺列表
     */
    @ApiOperation("获取店铺列表")
    @GetMapping("/listPage")
    @ApiResponses(
            @ApiResponse(code = 200, message = "操作成功", response = ShopVo.class)
    )
    public ResultVo listPage(@Validated ShopListForm shopListForm){
        log.info("获取店铺列表入参：{}",shopListForm);
        return ResultVoUtil.success(shopService.listPage(shopListForm));
    }

    @ApiOperation("获取店铺")
    @GetMapping("/getOne")
    @ApiResponses(
            @ApiResponse(code = 200, message = "操作成功", response = ShopVo.class)
    )
    public ResultVo getOne(Integer id){
        return ResultVoUtil.success(shopService.getById(id));
    }
}
