package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;
import java.util.List;

@ApiModel("评价表")
public class Tblcomment {
  @ApiModelProperty(value = "订单id")
  private long orderid;
  @ApiModelProperty(value = "商家id")
  private long shopid;
  @ApiModelProperty(value = "用户id")
  private long userid;
  @ApiModelProperty(value = "评价id")
  private long commentid;
  @ApiModelProperty(value = "角色id")   // 用于区分该评论是用户评论的还是商家回复的
  private long roleid;
  @ApiModelProperty(value = "评价内容")
  private String commentcontent;
  @ApiModelProperty(value = "评分")
  private long commentscore;
  @ApiModelProperty(value = "商家回复状态")
  private long responsestatus;
  @ApiModelProperty(value = "商家回复")
  private String shopcomment;

  /* 商家 */
  @ApiModelProperty(value = "店铺名称")
  private String shopname;
  @ApiModelProperty(value = "商标图片")
  private String brand;
  @ApiModelProperty(value = "店铺销量")
  private double shopsales;
  @ApiModelProperty(value = "店铺评分")
  private double shopscore;
  /* 商品 */
  @ApiModelProperty(value = "商品id")
  private long goodsid;
  @ApiModelProperty(value = "商品名称")
  private String goodsname;
  @ApiModelProperty(value = "商品价格")
  private double goodsprice;
  @ApiModelProperty(value = "商品图片")
  private String goodsimg;
  @ApiModelProperty(value = "订单中商品的详细信息的id")
  private long id;
  @ApiModelProperty(value = "订单中购买的商品数量")
  private long bugnum;
  /* 订单 */
  @ApiModelProperty(value = "下单时间")
  private String ordertime;
  @ApiModelProperty(value = "送达时间")
  private String deliverytime;
  @ApiModelProperty(value = "实付款（商品总价格 - 红包金额）")
  private double actualmoney;
  @ApiModelProperty(value = "订单状态（待商家接单 / 待骑手抢单 / 商家备货中 / 待骑手取货 / 待送达 / 已完成 / 已取消 / 退单中 / 已退单）")
  private String orderstate;
  /* 订单的商品信息列表 */
  private List<Tblcomment> goodsList;


  public Tblcomment() {
  }

  @Override
  public String toString() {
    return "评价{" +
            "订单id=" + orderid +
            ", 商家id=" + shopid +
            ", 用户id=" + userid +
            ", 评价id=" + commentid +
            ", 角色id=" + roleid +
            ", 评价内容='" + commentcontent + '\'' +
            ", 商家评价='" + shopcomment + '\'' +
            ", 评分=" + commentscore +
            ", 商家回复状态=" + responsestatus +
            ", 店铺名称='" + shopname + '\'' +
            ", 店铺销量=" + shopsales +
            ", 店铺评分=" + shopscore +
            ", 商品id=" + goodsid +
            ", 商品名称='" + goodsname + '\'' +
            ", 商品价格=" + goodsprice +
            ", 商品图片='" + goodsimg + '\'' +
            ", 订单中购买的商品的具体信息类的id=" + id +
            ", 订单中购买的商品数量=" + bugnum +
            ", 下单时间=" + ordertime +
            ", 送达时间=" + deliverytime +
            ", 实付款=" + actualmoney +
            ", 订单状态='" + orderstate + '\'' +
            ", 订单中的商品列表='" + goodsList + '\'' +
            '}' + '\n';
  }

  public long getResponsestatus() {
    return responsestatus;
  }

  public void setResponsestatus(long responsestatus) {
    this.responsestatus = responsestatus;
  }

  public String getShopcomment() {
    return shopcomment;
  }

  public void setShopcomment(String shopcomment) {
    this.shopcomment = shopcomment;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public List<Tblcomment> getGoodsList() {
    return goodsList;
  }

  public void setGoodsList(List<Tblcomment> goodsList) {
    this.goodsList = goodsList;
  }

  public String getShopname() {
    return shopname;
  }

  public void setShopname(String shopname) {
    this.shopname = shopname;
  }

  public double getShopsales() {
    return shopsales;
  }

  public void setShopsales(double shopsales) {
    this.shopsales = shopsales;
  }

  public double getShopscore() {
    return shopscore;
  }

  public void setShopscore(double shopscore) {
    this.shopscore = shopscore;
  }

  public long getGoodsid() {
    return goodsid;
  }

  public void setGoodsid(long goodsid) {
    this.goodsid = goodsid;
  }

  public String getGoodsname() {
    return goodsname;
  }

  public void setGoodsname(String goodsname) {
    this.goodsname = goodsname;
  }

  public double getGoodsprice() {
    return goodsprice;
  }

  public void setGoodsprice(double goodsprice) {
    this.goodsprice = goodsprice;
  }

  public String getGoodsimg() {
    return goodsimg;
  }

  public void setGoodsimg(String goodsimg) {
    this.goodsimg = goodsimg;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getBugnum() {
    return bugnum;
  }

  public void setBugnum(long bugnum) {
    this.bugnum = bugnum;
  }

  public String getOrdertime() {
    return ordertime;
  }

  public void setOrdertime(String ordertime) {
    this.ordertime = ordertime;
  }

  public String getDeliverytime() {
    return deliverytime;
  }

  public void setDeliverytime(String deliverytime) {
    this.deliverytime = deliverytime;
  }

  public double getActualmoney() {
    return actualmoney;
  }

  public void setActualmoney(double actualmoney) {
    this.actualmoney = actualmoney;
  }

  public String getOrderstate() {
    return orderstate;
  }

  public void setOrderstate(String orderstate) {
    this.orderstate = orderstate;
  }

  public long getOrderid() {
    return orderid;
  }

  public void setOrderid(long orderid) {
    this.orderid = orderid;
  }


  public long getShopid() {
    return shopid;
  }

  public void setShopid(long shopid) {
    this.shopid = shopid;
  }


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public long getCommentid() {
    return commentid;
  }

  public void setCommentid(long commentid) {
    this.commentid = commentid;
  }


  public long getRoleid() {
    return roleid;
  }

  public void setRoleid(long roleid) {
    this.roleid = roleid;
  }


  public String getCommentcontent() {
    return commentcontent;
  }

  public void setCommentcontent(String commentcontent) {
    this.commentcontent = commentcontent;
  }


  public long getCommentscore() {
    return commentscore;
  }

  public void setCommentscore(long commentscore) {
    this.commentscore = commentscore;
  }

}
