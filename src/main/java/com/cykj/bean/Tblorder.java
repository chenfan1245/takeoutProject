package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

@ApiModel("订单类")
public class Tblorder {
  /*订单类*/
  @ApiModelProperty(value = "订单id")
  private long orderid;
  @ApiModelProperty(value = "收获地址id")
  private long addressid;
  @ApiModelProperty(value = "使用的用户红包id")
  private long redpacketid;
  @ApiModelProperty(value = "商家id")
  private long shopid;
  @ApiModelProperty(value = "骑手id")
  private long riderid;
  @ApiModelProperty(value = "订单编号（随机）")
  private String orderno;
  @ApiModelProperty(value = "订单备注")
  private String orderinfo;
  @ApiModelProperty(value = "下单时间")
  private java.sql.Timestamp ordertime;
  @ApiModelProperty(value = "送达时间")
  private java.sql.Timestamp deliverytime;
  @ApiModelProperty(value = "实付款（商品总价格 - 红包金额）")
  private double actualmoney;
  @ApiModelProperty(value = "配送费")
  private double deliveryfee;
  @ApiModelProperty(value = "支付状态（支付中 / 已支付）")
  private String paystate;
  @ApiModelProperty(value = "订单状态（待商家接单 / 待骑手抢单 / 商家备货中 / 待骑手取货 / 待送达 / 已完成 / 已取消 / 退单中 / 已退单）")
  private String orderstate;
  /*商品类*/
  @ApiModelProperty(value = "商品id")
  private long goodsid;
  @ApiModelProperty(value = "类型id")
  private long typeid;
  @ApiModelProperty(value = "商家商品类型分类id")
  private long shopgoodstypeid;
  @ApiModelProperty(value = "商品名称")
  private String goodsname;
  @ApiModelProperty(value = "商品数量")
  private long goodsnum;
  @ApiModelProperty(value = "商品价格")
  private double goodsprice;
  @ApiModelProperty(value = "商品详细介绍")
  private String goodsdescribe;
  @ApiModelProperty(value = "商品图片")
  private String goodsimg;
  @ApiModelProperty(value = "商品状态（上架 / 下架）")
  private String goodsstate;
  @ApiModelProperty(value = "商品的审核状态（未审核 / 审核通过 / 审核未通过）")
  private String auditstate;
  @ApiModelProperty(value = "月销量")
  private long monsales;
  /*店铺类*/
  @ApiModelProperty(value = "角色id")
  private long roleid;
  @ApiModelProperty(value = "店铺名称")
  private String shopname;
  @ApiModelProperty(value = "店铺商标")
  private String brand;
  @ApiModelProperty(value = "商家登录的帐号（手机号）")
  private String shoptel;
  @ApiModelProperty(value = "开始营业时间")
  private java.sql.Time opentime;
  @ApiModelProperty(value = "结束营业时间")
  private java.sql.Time endtime;
  @ApiModelProperty(value = "商家登录密码")
  private String shoppwd;
  @ApiModelProperty(value = "店铺地址")
  private String shopaddress;
  @ApiModelProperty(value = "营业执照")
  private String buslicense;
  @ApiModelProperty(value = "营业许可证")
  private String foodlicense;
  @ApiModelProperty(value = "店铺简介")
  private String shopinfo;
  @ApiModelProperty(value = "店铺状态（营业 / 休息）")
  private String shopstate;
  @ApiModelProperty(value = "余额")
  private double income;
  @ApiModelProperty(value = "店铺评分")
  private double shopscore;
  @ApiModelProperty(value = "法人姓名")
  private String legalpersonname;
  @ApiModelProperty(value = "法人身份证号")
  private String legalpersonid;

  /*状态类*/
  @ApiModelProperty(value = "状态id")
  private long stateid;
  @ApiModelProperty(value = "状态名称")
  private String statename;
  @ApiModelProperty(value = "父级id（例：1用户状态0，2启用1；表示 启用归属于用户状态）")
  private long parentid;
  /*用户收货地址类*/
  @ApiModelProperty(value = "用户id")
  private long userid;
  @ApiModelProperty(value = "收货人手机号")
  private String rectel;
  @ApiModelProperty(value = "收获地址")
  private String recaddress;
  @ApiModelProperty(value = "门牌号")
  private String housenum;
  @ApiModelProperty(value = "收货人姓名")
  private String recname;
  @ApiModelProperty(value = "备注（家 / 公司 / 学校）")
  private String info;
  /*红包类*/
  @ApiModelProperty(value = "红包名称")
  private String redpacketname;
  @ApiModelProperty(value = "门槛金额")
  private double thresholdmoney;
  @ApiModelProperty(value = "红包金额")
  private double redpacketmoney;
  @ApiModelProperty(value = "可领的红包数量")
  private long redpacketnum;
  @ApiModelProperty(value = "时限天数")
  private long limitdays;
  /*骑手类*/
  @ApiModelProperty(value = "骑手姓名")
  private String ridername;
  @ApiModelProperty(value = "骑手帐号（手机号）")
  private String ridertel;
  @ApiModelProperty(value = "骑手密码")
  private String riderpwd;
  @ApiModelProperty(value = "骑手身份证正面")
  private String idcardfront;
  @ApiModelProperty(value = "骑手身份证背面")
  private String idcardback;
  @ApiModelProperty(value = "骑手健康证图片")
  private String healthcard;
  @ApiModelProperty(value = "头像")
  private String riderhead;
  @ApiModelProperty(value = "审核状态（未审核 / 审核通过 / 审核未通过）")
  private String riderstate;
  @ApiModelProperty(value = "余额")
  private double balance;

  public String getShoptel() {
    return shoptel;
  }

  public void setShoptel(String shoptel) {
    this.shoptel = shoptel;
  }

  public Time getOpentime() {
    return opentime;
  }

  public void setOpentime(Time opentime) {
    this.opentime = opentime;
  }

  public Time getEndtime() {
    return endtime;
  }

  public void setEndtime(Time endtime) {
    this.endtime = endtime;
  }

  public String getShoppwd() {
    return shoppwd;
  }

  public void setShoppwd(String shoppwd) {
    this.shoppwd = shoppwd;
  }

  public String getShopaddress() {
    return shopaddress;
  }

  public void setShopaddress(String shopaddress) {
    this.shopaddress = shopaddress;
  }

  public String getBuslicense() {
    return buslicense;
  }

  public void setBuslicense(String buslicense) {
    this.buslicense = buslicense;
  }

  public String getFoodlicense() {
    return foodlicense;
  }

  public void setFoodlicense(String foodlicense) {
    this.foodlicense = foodlicense;
  }

  public String getShopinfo() {
    return shopinfo;
  }

  public void setShopinfo(String shopinfo) {
    this.shopinfo = shopinfo;
  }

  public String getShopstate() {
    return shopstate;
  }

  public void setShopstate(String shopstate) {
    this.shopstate = shopstate;
  }

  public double getIncome() {
    return income;
  }

  public void setIncome(double income) {
    this.income = income;
  }

  public double getShopscore() {
    return shopscore;
  }

  public void setShopscore(double shopscore) {
    this.shopscore = shopscore;
  }

  public String getLegalpersonname() {
    return legalpersonname;
  }

  public void setLegalpersonname(String legalpersonname) {
    this.legalpersonname = legalpersonname;
  }

  public String getLegalpersonid() {
    return legalpersonid;
  }

  public void setLegalpersonid(String legalpersonid) {
    this.legalpersonid = legalpersonid;
  }

  private long goodsNum;//  商品数量
  private double goodsAllprice;//  商品总价格

  private String isComment;//  是否评价

  public String getIsComment() {
    return isComment;
  }

  public void setIsComment(String isComment) {
    this.isComment = isComment;
  }

  public long getGoodsNum() {
    return goodsNum;
  }

  public void setGoodsNum(long goodsNum) {
    this.goodsNum = goodsNum;
  }

  public double getGoodsAllprice() {
    return goodsAllprice;
  }

  public void setGoodsAllprice(double goodsAllprice) {
    this.goodsAllprice = goodsAllprice;
  }

  private List<Tblgoods> goodsList;

  public List<Tblgoods> getGoodsList() {
    return goodsList;
  }

  public void setGoodsList(List<Tblgoods> goodsList) {
    this.goodsList = goodsList;
  }

  public double getDeliveryfee() {
    return deliveryfee;
  }

  public void setDeliveryfee(double deliveryfee) {
    this.deliveryfee = deliveryfee;
  }

  public String getRidername() {
    return ridername;
  }

  public void setRidername(String ridername) {
    this.ridername = ridername;
  }

  public String getRidertel() {
    return ridertel;
  }

  public void setRidertel(String ridertel) {
    this.ridertel = ridertel;
  }

  public String getRiderpwd() {
    return riderpwd;
  }

  public void setRiderpwd(String riderpwd) {
    this.riderpwd = riderpwd;
  }

  public String getIdcardfront() {
    return idcardfront;
  }

  public void setIdcardfront(String idcardfront) {
    this.idcardfront = idcardfront;
  }

  public String getIdcardback() {
    return idcardback;
  }

  public void setIdcardback(String idcardback) {
    this.idcardback = idcardback;
  }

  public String getHealthcard() {
    return healthcard;
  }

  public void setHealthcard(String healthcard) {
    this.healthcard = healthcard;
  }

  public String getRiderhead() {
    return riderhead;
  }

  public void setRiderhead(String riderhead) {
    this.riderhead = riderhead;
  }

  public String getRiderstate() {
    return riderstate;
  }

  public void setRiderstate(String riderstate) {
    this.riderstate = riderstate;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public long getRoleid() {
    return roleid;
  }

  public void setRoleid(long roleid) {
    this.roleid = roleid;
  }

  public String getRedpacketname() {
    return redpacketname;
  }

  public void setRedpacketname(String redpacketname) {
    this.redpacketname = redpacketname;
  }

  public double getThresholdmoney() {
    return thresholdmoney;
  }

  public void setThresholdmoney(double thresholdmoney) {
    this.thresholdmoney = thresholdmoney;
  }

  public double getRedpacketmoney() {
    return redpacketmoney;
  }

  public void setRedpacketmoney(double redpacketmoney) {
    this.redpacketmoney = redpacketmoney;
  }

  public long getRedpacketnum() {
    return redpacketnum;
  }

  public void setRedpacketnum(long redpacketnum) {
    this.redpacketnum = redpacketnum;
  }

  public long getLimitdays() {
    return limitdays;
  }

  public void setLimitdays(long limitdays) {
    this.limitdays = limitdays;
  }

  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }

  public String getRectel() {
    return rectel;
  }

  public void setRectel(String rectel) {
    this.rectel = rectel;
  }

  public String getRecaddress() {
    return recaddress;
  }

  public void setRecaddress(String recaddress) {
    this.recaddress = recaddress;
  }

  public String getHousenum() {
    return housenum;
  }

  public void setHousenum(String housenum) {
    this.housenum = housenum;
  }

  public String getRecname() {
    return recname;
  }

  public void setRecname(String recname) {
    this.recname = recname;
  }

  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public long getStateid() {
    return stateid;
  }

  public void setStateid(long stateid) {
    this.stateid = stateid;
  }

  public String getStatename() {
    return statename;
  }

  public void setStatename(String statename) {
    this.statename = statename;
  }

  public long getParentid() {
    return parentid;
  }

  public void setParentid(long parentid) {
    this.parentid = parentid;
  }

  public Tblorder() {
  }

  public long getGoodsid() {
    return goodsid;
  }

  public void setGoodsid(long goodsid) {
    this.goodsid = goodsid;
  }

  public long getTypeid() {
    return typeid;
  }

  public void setTypeid(long typeid) {
    this.typeid = typeid;
  }

  public long getShopgoodstypeid() {
    return shopgoodstypeid;
  }

  public void setShopgoodstypeid(long shopgoodstypeid) {
    this.shopgoodstypeid = shopgoodstypeid;
  }

  public String getGoodsname() {
    return goodsname;
  }

  public void setGoodsname(String goodsname) {
    this.goodsname = goodsname;
  }

  public long getGoodsnum() {
    return goodsnum;
  }

  public void setGoodsnum(long goodsnum) {
    this.goodsnum = goodsnum;
  }

  public double getGoodsprice() {
    return goodsprice;
  }

  public void setGoodsprice(double goodsprice) {
    this.goodsprice = goodsprice;
  }

  public String getGoodsdescribe() {
    return goodsdescribe;
  }

  public void setGoodsdescribe(String goodsdescribe) {
    this.goodsdescribe = goodsdescribe;
  }

  public String getGoodsimg() {
    return goodsimg;
  }

  public void setGoodsimg(String goodsimg) {
    this.goodsimg = goodsimg;
  }

  public String getGoodsstate() {
    return goodsstate;
  }

  public void setGoodsstate(String goodsstate) {
    this.goodsstate = goodsstate;
  }

  public String getAuditstate() {
    return auditstate;
  }

  public void setAuditstate(String auditstate) {
    this.auditstate = auditstate;
  }

  public long getMonsales() {
    return monsales;
  }

  public void setMonsales(long monsales) {
    this.monsales = monsales;
  }

  public String getShopname() {
    return shopname;
  }

  public void setShopname(String shopname) {
    this.shopname = shopname;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public long getOrderid() {
    return orderid;
  }

  public void setOrderid(long orderid) {
    this.orderid = orderid;
  }

  public long getAddressid() {
    return addressid;
  }

  public void setAddressid(long addressid) {
    this.addressid = addressid;
  }

  public long getRedpacketid() {
    return redpacketid;
  }

  public void setRedpacketid(long redpacketid) {
    this.redpacketid = redpacketid;
  }

  public long getShopid() {
    return shopid;
  }

  public void setShopid(long shopid) {
    this.shopid = shopid;
  }

  public long getRiderid() {
    return riderid;
  }

  public void setRiderid(long riderid) {
    this.riderid = riderid;
  }

  public String getOrderno() {
    return orderno;
  }

  public void setOrderno(String orderno) {
    this.orderno = orderno;
  }

  public String getOrderinfo() {
    return orderinfo;
  }

  public void setOrderinfo(String orderinfo) {
    this.orderinfo = orderinfo;
  }

  public Timestamp getOrdertime() {
    return ordertime;
  }

  public void setOrdertime(Timestamp ordertime) {
    this.ordertime = ordertime;
  }

  public Timestamp getDeliverytime() {
    return deliverytime;
  }

  public void setDeliverytime(Timestamp deliverytime) {
    this.deliverytime = deliverytime;
  }

  public double getActualmoney() {
    return actualmoney;
  }

  public void setActualmoney(double actualmoney) {
    this.actualmoney = actualmoney;
  }

  public String getPaystate() {
    return paystate;
  }

  public void setPaystate(String paystate) {
    this.paystate = paystate;
  }

  public String getOrderstate() {
    return orderstate;
  }

  public void setOrderstate(String orderstate) {
    this.orderstate = orderstate;
  }

  @Override
  public String toString() {
    return "Tblorder{" +
            "orderid=" + orderid +
            ", addressid=" + addressid +
            ", redpacketid=" + redpacketid +
            ", shopid=" + shopid +
            ", riderid=" + riderid +
            ", orderno='" + orderno + '\'' +
            ", orderinfo='" + orderinfo + '\'' +
            ", ordertime=" + ordertime +
            ", deliverytime=" + deliverytime +
            ", actualmoney=" + actualmoney +
            ", deliveryfee=" + deliveryfee +
            ", paystate='" + paystate + '\'' +
            ", orderstate='" + orderstate + '\'' +
            ", goodsid=" + goodsid +
            ", typeid=" + typeid +
            ", shopgoodstypeid=" + shopgoodstypeid +
            ", goodsname='" + goodsname + '\'' +
            ", goodsnum=" + goodsnum +
            ", goodsprice=" + goodsprice +
            ", goodsdescribe='" + goodsdescribe + '\'' +
            ", goodsimg='" + goodsimg + '\'' +
            ", goodsstate='" + goodsstate + '\'' +
            ", auditstate='" + auditstate + '\'' +
            ", monsales=" + monsales +
            ", shopname='" + shopname + '\'' +
            ", brand='" + brand + '\'' +
            ", stateid=" + stateid +
            ", statename='" + statename + '\'' +
            ", parentid=" + parentid +
            ", userid=" + userid +
            ", rectel='" + rectel + '\'' +
            ", recaddress='" + recaddress + '\'' +
            ", housenum='" + housenum + '\'' +
            ", recname='" + recname + '\'' +
            ", info='" + info + '\'' +
            ", redpacketname='" + redpacketname + '\'' +
            ", thresholdmoney=" + thresholdmoney +
            ", redpacketmoney=" + redpacketmoney +
            ", redpacketnum=" + redpacketnum +
            ", limitdays=" + limitdays +
            ", ridername='" + ridername + '\'' +
            ", ridertel='" + ridertel + '\'' +
            ", riderpwd='" + riderpwd + '\'' +
            ", idcardfront='" + idcardfront + '\'' +
            ", idcardback='" + idcardback + '\'' +
            ", healthcard='" + healthcard + '\'' +
            ", riderhead='" + riderhead + '\'' +
            ", riderstate='" + riderstate + '\'' +
            ", balance=" + balance +
            ", roleid=" + roleid +
            ", goodsNum=" + goodsNum +
            ", goodsAllprice=" + goodsAllprice +
            ", isComment=" + isComment +
            ", goodsList=" + goodsList +
            '}';
  }
}
