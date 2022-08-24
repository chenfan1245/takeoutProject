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

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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

        String d = "2022-1-1 12:36:00";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date dd = df.parse(d);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dd);
            calendar.add(Calendar.MINUTE, 5);//加5分钟
            System.out.println("增加5分钟之后：" + df.format(calendar.getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }


        // 打印
        System.out.println("-------------------------------------------------------------");
//        System.out.println("待评价列表："+noCommentList);
        System.out.println("-------------------------------------------------------------");

    }

}
