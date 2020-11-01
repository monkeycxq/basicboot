package com.hxh.basic.project.mapper;

import com.hxh.basic.project.entity.Shop;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hxh.basic.project.form.shop.ShopListForm;
import com.hxh.basic.project.form.user.ListUserForm;
import com.hxh.basic.project.vo.ShopVo;
import com.hxh.basic.project.vo.UserVo;
import org.apache.ibatis.annotations.Select;
import org.apache.velocity.runtime.parser.node.ASTIntegerRange;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author cxq
 * @since 2020-11-01
 */
@Repository
public interface ShopMapper extends BaseMapper<Shop> {

    List<ShopVo> queryPage(ShopListForm shopListForm);

    Integer count(ShopListForm shopListForm);
}
