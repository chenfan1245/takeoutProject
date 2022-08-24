package com.cykj.service.Impl;

import com.cykj.bean.Tblgoodsspec;
import com.cykj.bean.Tblshoppingcard;
import com.cykj.mapper.TblshoppingcarMapper;
import com.cykj.service.TblshoppingcarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TblshoppingcarServiceImpl implements TblshoppingcarService {
    @Autowired
    private TblshoppingcarMapper shoppingcarMapper;

    // 【增】点单：将商品加入到购物车
    @Override
    public boolean addShoppingcar(long shopid, long goodsid, long userid) {
        return shoppingcarMapper.addShoppingcar(shopid, goodsid, userid);
    }

    // 【改】点击加号或减号或输入数值，修改购物车商品数量
    @Override
    public boolean updateShoppingcarNum(long bugnum, long goodsid, long userid) {
        return shoppingcarMapper.updateShoppingcarNum(bugnum, goodsid, userid);
    }

    // 查询商品库存（用于判断加入购物车的购买数量是否大于库存）
    @Override
    public int findGoodsNum(long goodsid) {
        return shoppingcarMapper.findGoodsNum(goodsid);
    }

    @Override
    public List<Tblshoppingcard> findCarShopName(long userid) {
        return shoppingcarMapper.findCarShopName(userid);
    }

    @Override
    public List<Tblshoppingcard> findCarShop(String shopname) {
        return shoppingcarMapper.findCarShop(shopname);
    }


    // 购物车显示内容：商品信息
    @Override
    public List<Tblshoppingcard> findCarGoods(long userid, long shopid) {
        return shoppingcarMapper.findCarGoods(userid, shopid);
    }

    // 购物车显示内容：商品的规格内容
    @Override
    public List<Tblgoodsspec> findCarGoodsSpec(long userid, List<Long> goodsidList, List<Long> specidList) {
        return shoppingcarMapper.findCarGoodsSpec(userid, goodsidList, specidList);
    }

    // 删除购物车选中的商品
    @Override
    public boolean deleteCar(long userid, List<Long> goodsidList) {
        return shoppingcarMapper.deleteCar(userid, goodsidList);
    }
}
