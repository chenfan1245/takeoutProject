package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.sql.Time;
import java.util.List;

@ApiModel("购物车类")
public class Tblshoppingcard {
  @ApiModelProperty(value = "购物车id")
  private long shoppingcardid;
  @ApiModelProperty(value = "商品id")
  private long goodsid;
  @ApiModelProperty(value = "用户id")
  private long userid;
  @ApiModelProperty(value = "商品数量")
  private long bugnum;

  /* 商家 */
  @ApiModelProperty(value = "商家id")
  private long shopid;
  @ApiModelProperty(value = "角色id")
  private long roleid;
  @ApiModelProperty(value = "店铺名称")
  private String shopname;
  /* 商品 */
  @ApiModelProperty(value = "商品名称")
  private String goodsname;
  @ApiModelProperty(value = "商品数量")
  private long goodsnum;
  @ApiModelProperty(value = "商品价格")
  private double goodsprice;
  @ApiModelProperty(value = "商品图片")
  private String goodsimg;
  @ApiModelProperty(value = "开始营业时间")
  private java.sql.Time opentime;
  @ApiModelProperty(value = "结束营业时间")
  private java.sql.Time endtime;
  @ApiModelProperty(value = "店铺地址")
  private String shopaddress;
  @ApiModelProperty(value = "店铺状态（营业 / 休息）")
  private String shopstate;
  @ApiModelProperty(value = "商家审核情况（未审核 / 审核通过 / 审核未通过）")
  private String auditstate;
  /* 商品列表 */
  private List<Tblshoppingcard> cart;

  public Tblshoppingcard() {
  }

  @Override
  public String toString() {
    return "购物车{" +
            "购物车id=" + shoppingcardid +
            ", 商品id=" + goodsid +
            ", 用户id=" + userid +
            ", 购买数量=" + bugnum +
            ", 商家id=" + shopid +
            ", 角色id=" + roleid +
            ", 店铺名称='" + shopname + '\'' +
            ", 商品名称='" + goodsname + '\'' +
            ", 商品库存=" + goodsnum +
            ", 商品价格=" + goodsprice +
            ", 商品图片=" + goodsimg +
            ", 开始营业时间=" + opentime +
            ", 结束营业时间=" + endtime +
            ", 店铺地址=" + shopaddress +
            ", 商品列表=" + cart +
            '}' + '\n';
  }

  public String getShopstate() {
    return shopstate;
  }

  public void setShopstate(String shopstate) {
    this.shopstate = shopstate;
  }

  public String getAuditstate() {
    return auditstate;
  }

  public void setAuditstate(String auditstate) {
    this.auditstate = auditstate;
  }

  public String getShopaddress() {
    return shopaddress;
  }

  public void setShopaddress(String shopaddress) {
    this.shopaddress = shopaddress;
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

  public String getGoodsimg() {
    return goodsimg;
  }

  public void setGoodsimg(String goodsimg) {
    this.goodsimg = goodsimg;
  }

  public List<Tblshoppingcard> getCart() {
    return cart;
  }

  public void setCart(List<Tblshoppingcard> cart) {
    this.cart = cart;
  }

  public long getShopid() {
    return shopid;
  }

  public void setShopid(long shopid) {
    this.shopid = shopid;
  }

  public long getRoleid() {
    return roleid;
  }

  public void setRoleid(long roleid) {
    this.roleid = roleid;
  }

  public String getShopname() {
    return shopname;
  }

  public void setShopname(String shopname) {
    this.shopname = shopname;
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

  public long getShoppingcardid() {
    return shoppingcardid;
  }

  public void setShoppingcardid(long shoppingcardid) {
    this.shoppingcardid = shoppingcardid;
  }


  public long getGoodsid() {
    return goodsid;
  }

  public void setGoodsid(long goodsid) {
    this.goodsid = goodsid;
  }


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public long getBugnum() {
    return bugnum;
  }

  public void setBugnum(long bugnum) {
    this.bugnum = bugnum;
  }

}
