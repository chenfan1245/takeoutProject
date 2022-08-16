package com.cykj;

import com.cykj.bean.*;
import com.cykj.service.TblcommentService;
import com.cykj.service.TblgoodsService;
import com.cykj.service.TblredpacketService;
import com.cykj.service.TblshoppingcarService;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        specidList.add(30L);
        specidList.add(33L);
        specidList.add(47L);
        specidList.add(50L);

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
        System.out.println("商家列表："+shopNameList);
        System.out.println("-------------------------------------------------------------");
        System.out.println("规格列表："+specnNameList);
        System.out.println("-------------------------------------------------------------");
        System.out.println("商品列表："+goodsList);
        System.out.println("-------------------------------------------------------------");

    }

}
