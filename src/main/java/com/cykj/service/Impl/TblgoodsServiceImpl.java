package com.cykj.service.Impl;

import com.cykj.bean.Tblgoods;
import com.cykj.bean.Tblshop;
import com.cykj.mapper.TblgoodsMapper;
import com.cykj.service.TblgoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TblgoodsServiceImpl implements TblgoodsService {
    @Autowired
    private TblgoodsMapper goodsMapper;

    // 显示所有店铺（根据【店铺名】和【商品名】和【商品类型】模糊查询）（商品状态：上架）
    @Override
    public List<Tblshop> findAllShopGoods(String shopname, String goodsname, long typeid) {
        return goodsMapper.findAllShopGoods(shopname, goodsname, typeid);
    }

    // 查询店铺收到的评分
    @Override
    public List<Double> findScore(long shopid) {
        return goodsMapper.findScore(shopid);
    }

    // 修改商家评分（根据收到的评分来算）
    @Override
    public boolean updateScore(double shopscore, long shopid) {
        return goodsMapper.updateScore(shopscore, shopid);
    }

    // 查询已完成的订单数量
    @Override
    public long findSales(long shopid) {
        return goodsMapper.findSales(shopid);
    }

    // 修改商家的销量
    @Override
    public boolean updateSales(long shopsales, long shopid) {
        return goodsMapper.updateSales(shopsales, shopid);
    }

    // 根据店铺id找到该店铺信息
    @Override
    public Tblshop findShop(long shopid) {
        return goodsMapper.findShop(shopid);
    }

    // 根据店铺id找到该店铺的招牌菜信息
    @Override
    public List<Tblshop> findSpeciality(long shopid) {
        return goodsMapper.findSpeciality(shopid);
    }

    /* 查询显示店铺的左侧菜单栏内容 */
    // 根据店铺名称找到shopgoodstypeid
    @Override
    public Tblshop findShopgoodstypeid(String name) {
        return goodsMapper.findShopgoodstypeid(name);
    }

    // 根据shopgoodstypeid查询左侧菜单栏内容
    @Override
    public List<Tblshop> findShopGoodsType(long shopgoodstypeid) {
        return goodsMapper.findShopGoodsType(shopgoodstypeid);
    }

    // 查询店铺内所有商品（模糊查询：左侧菜单栏）
    @Override
    public List<Tblgoods> findAllGoods(long shopid, long shopgoodstypeid) {
        return goodsMapper.findAllGoods(shopid, shopgoodstypeid);
    }

    // 搜索框搜索商品
    @Override
    public List<Tblgoods> findSearchGoods(long shopid, String goodsname) {
        return goodsMapper.findSearchGoods(shopid, goodsname);
    }

    // 根据商品id搜索该商品详细信息
    @Override
    public Tblgoods findGoods(long goodsid) {
        return goodsMapper.findGoods(goodsid);
    }

}
