package com.cykj.service;

import com.cykj.bean.Tblgoodsspec;
import com.cykj.bean.Tblshoppingcard;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface TblshoppingcarService {
    // 【增】点单：将商品加入到购物车
    boolean addShoppingcar(long shopid, long goodsid, long userid);
    // 【改】点击加号或减号或输入数值，修改购物车商品数量
    boolean updateShoppingcarNum(long bugnum, long goodsid, long userid);
    // 查询商品库存（用于判断加入购物车的购买数量是否大于库存）
    int findGoodsNum (long goodsid);
    // 购物车显示内容：商家名称
    List<String> findCarShop(long userid);
    // 购物车显示内容：商品信息
    List<Tblshoppingcard> findCarGoods(long userid, List<String> shopnameList);
    // 购物车显示内容：商品的规格内容
    List<Tblgoodsspec> findCarGoodsSpec(long userid, List<Long> goodsidList, List<Long> specidList);

}
