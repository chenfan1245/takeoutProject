package com.cykj;

import com.cykj.bean.*;
import com.cykj.service.TblcommentService;
import com.cykj.service.TblgoodsService;
import com.cykj.service.TblredpacketService;
import com.cykj.service.TblshoppingcarService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class TakeoutUserApplicationTests {
    @Autowired
    TblgoodsService tblgoodsService;
    @Autowired
    TblredpacketService tblredpacketMapper;
    @Autowired
    TblcommentService tblcommentService;
    @Autowired
    TblshoppingcarService tblshoppingcarService;

    @Test
    void contextLoads() {
        // 前端传来的数据
        long userid = 2;
        List<Long> specidList = new ArrayList<>();
        specidList.add(4L);
        specidList.add(11L);

        // 测试
        List<String> shopNameList = tblshoppingcarService.findCarShop(userid);  // 店铺名称列表
        List<Tblgoodsspec> specnNameList = new ArrayList<>(); // 规格内容列表
        List<Tblshoppingcard> goodsList = new ArrayList<>();    // 商品列表
        List<Long> goodsidList = new ArrayList<>();     // 商品id列表
        goodsList = tblshoppingcarService.findCarGoods(userid, shopNameList);
        for (Tblshoppingcard tblshoppingcard : goodsList) {
            goodsidList.add(tblshoppingcard.getGoodsid());
            specnNameList = tblshoppingcarService.findCarGoodsSpec(userid, goodsidList, specidList);
        }

        // 打印
        System.out.println("-------------------------------------------------------------");
        System.out.println("店铺名称列表："+shopNameList);
        System.out.println("-------------------------------------------------------------");
        System.out.println("规格内容列表："+specnNameList);
        System.out.println("-------------------------------------------------------------");
        System.out.println("商品列表："+goodsList);
        System.out.println("-------------------------------------------------------------");
    }

}
