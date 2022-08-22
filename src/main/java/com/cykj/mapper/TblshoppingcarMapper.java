package com.cykj.mapper;

import com.cykj.bean.Tblcomment;
import com.cykj.bean.Tblgoodsspec;
import com.cykj.bean.Tblshoppingcard;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TblshoppingcarMapper {
    // 【增】点单：将商品加入到购物车
    boolean addShoppingcar(@Param("shopid")long shopid,
                           @Param("goodsid")long goodsid,
                           @Param("userid")long userid);
    // 【改】点击加号或减号或输入数值，修改购物车商品数量
    boolean updateShoppingcarNum(@Param("bugnum")long bugnum,
                                 @Param("goodsid")long goodsid,
                                 @Param("userid")long userid);
    // 查询商品库存（用于判断加入购物车的购买数量是否大于库存）
    int findGoodsNum (@Param("goodsid")long goodsid);
    // 购物车显示内容：商家名称
    List<Tblshoppingcard> findCarShopName(@Param("userid")long userid);
    // 根据商家名称查到店铺信息
    List<Tblshoppingcard> findCarShop(@Param("shopname")String shopname);
    // 购物车显示内容：商品信息
    List<Tblshoppingcard> findCarGoods(@Param("userid")long userid,
                                       @Param("shopid")long shopid);
    // 购物车显示内容：商品的规格内容
    List<Tblgoodsspec> findCarGoodsSpec(@Param("userid")long userid,
                                        @Param("goodsidList")List<Long> goodsidList,
                                        @Param("specidList")List<Long> specidList);

}
