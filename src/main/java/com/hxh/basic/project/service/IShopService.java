package com.hxh.basic.project.service;

import com.hxh.basic.project.entity.Shop;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hxh.basic.project.form.shop.ShopListForm;
import com.hxh.basic.project.vo.PageVo;
import com.hxh.basic.project.vo.ShopVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cxq
 * @since 2020-11-01
 */
public interface IShopService extends IService<Shop> {

    PageVo<ShopVo> listPage(ShopListForm shopListForm);
}
