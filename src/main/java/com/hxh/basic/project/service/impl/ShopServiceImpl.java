package com.hxh.basic.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hxh.basic.project.entity.Shop;
import com.hxh.basic.project.form.shop.ShopListForm;
import com.hxh.basic.project.mapper.ShopMapper;
import com.hxh.basic.project.service.IShopService;
import com.hxh.basic.project.vo.PageVo;
import com.hxh.basic.project.vo.ShopVo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cxq
 * @since 2020-11-01
 */
@Service
@AllArgsConstructor
public class ShopServiceImpl extends ServiceImpl<ShopMapper, Shop> implements IShopService {

    private ShopMapper shopMapper;

    @Override
    public PageVo<ShopVo> listPage(ShopListForm shopListForm) {
        PageVo<ShopVo> pageVo = new PageVo<ShopVo>().setCurrentAndSize(shopListForm);
        pageVo.setTotal(shopMapper.count(shopListForm));
        pageVo.setRecords(shopMapper.queryPage(shopListForm.calcCurrent()));
        return pageVo;
    }


}
