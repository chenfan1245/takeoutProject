package com.cykj.service;

import com.cykj.bean.Tblgoods;
import com.cykj.bean.Tblshop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblgoodsService {
    // 显示所有店铺（根据【店铺名】和【商品名】和【商品类型】模糊查询）（商品状态：上架）
    List<Tblshop> findAllShopGoods(String shopname, String goodsname, long typeid);
    // 查询店铺收到的评分
    List<Double> findScore(long shopid);
    // 修改商家评分（根据收到的评分来算）
    boolean updateScore(double shopscore, long shopid);
    // 查询已完成的订单数量
    long findSales (long shopid);
    // 修改商家的销量
    boolean updateSales(long shopsales, long shopid);

    // 根据店铺id找到该店铺信息
    Tblshop findShop (long shopid);
    // 根据店铺id找到该店铺的招牌菜信息
    List<Tblshop> findSpeciality(long shopid);

    // 根据shopid,查询显示店铺的左侧菜单栏内容
    List<Tblshop> findShopGoodsType(long shopid);

    // 查询店铺内所有商品
    List<Tblgoods> findAllGoods (long shopid);
    // 搜索框搜索商品
    List<Tblgoods> findSearchGoods(long shopid, String goodsname);
    // 根据商品id搜索该商品详细信息
    Tblgoods findGoods (long goodsid);

}
