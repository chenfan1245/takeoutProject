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
        long userid = 1;

        // 测试
        List<Tblshoppingcard> shopsList = tblshoppingcarService.findCarShopName(userid);  // 店铺列表
        for(Tblshoppingcard tblshoppingcard : shopsList) {
            String shopname = tblshoppingcard.getShopname();
            List<Tblshoppingcard> shopList = tblshoppingcarService.findCarShop(shopname);
            for (Tblshoppingcard shop : shopList) {
                tblshoppingcard.setShopid(shop.getShopid());
                tblshoppingcard.setRoleid(shop.getRoleid());
                tblshoppingcard.setOpentime(shop.getOpentime());
                tblshoppingcard.setEndtime(shop.getEndtime());
                tblshoppingcard.setShopaddress(shop.getShopaddress());
                tblshoppingcard.setShopstate(shop.getShopstate());
                tblshoppingcard.setAuditstate(shop.getAuditstate());
            }
            long shopid = tblshoppingcard.getShopid();
            List<Tblshoppingcard> goodsList = tblshoppingcarService.findCarGoods(userid,shopid);
            tblshoppingcard.setCart(goodsList);
        }

        // 打印
        System.out.println("-------------------------------------------------------------");
        System.out.println("购物车列表："+shopsList);
        System.out.println("-------------------------------------------------------------");

    }

}
