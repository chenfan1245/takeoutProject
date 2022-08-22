package com.cykj.mapper;

import com.cykj.bean.Tblgoods;
import com.cykj.bean.Tblshop;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TblgoodsMapper {
    // 显示所有店铺（根据【店铺名】和【商品名】和【商品类型】模糊查询）（商品状态：上架）
    List<Tblshop> findAllShopGoods(@Param("shopname")String shopname,
                                   @Param("goodsname")String goodsname,
                                   @Param("typeid")long typeid);
    // 查询店铺收到的评分
    List<Double> findScore(@Param("shopid")long shopid);
    // 修改商家评分（根据收到的评分来算）
    boolean updateScore(@Param("shopscore")double shopscore,
                        @Param("shopid")long shopid);
    // 查询已完成的订单数量
    long findSales (@Param("shopid")long shopid);
    // 修改商家的销量
    boolean updateSales(@Param("shopsales")long shopsales,
                        @Param("shopid")long shopid);

    // 根据店铺id找到该店铺信息
    Tblshop findShop (@Param("shopid")long shopid);
    // 根据店铺id找到该店铺的招牌菜信息
    List<Tblshop> findSpeciality(@Param("shopid")long shopid);

    // 根据shopid,查询显示店铺的左侧菜单栏内容
    List<Tblshop> findShopGoodsType(@Param("shopid")long shopid);

    // 查询店铺内所有商品
    List<Tblgoods> findAllGoods (@Param("shopid")long shopid);
    // 搜索框搜索商品
    List<Tblgoods> findSearchGoods(@Param("shopid")long shopid,
                                   @Param("goodsname")String goodsname);
    // 根据商品id搜索该商品详细信息
    Tblgoods findGoods (@Param("goodsid")long goodsid);


}
