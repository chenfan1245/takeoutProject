package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

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
  /* 规格 */
  @ApiModelProperty(value = "规格id")
  private long specid;
  @ApiModelProperty(value = "规格名称")
  private String specname;
  @ApiModelProperty(value = "父级id（将子规格归属于父规格，如规格名为“正常冰“归属于规格名为“温度”）")
  private long parentid;
  /* 商品列表 */
  private List<Tblshoppingcard> goodsList;

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
            ", 规格id=" + specid +
            ", 规格内容='" + specname + '\'' +
            ", 规格的父级id=" + parentid +
            '}' + '\n';
  }

  public List<Tblshoppingcard> getGoodsList() {
    return goodsList;
  }

  public void setGoodsList(List<Tblshoppingcard> goodsList) {
    this.goodsList = goodsList;
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

  public long getSpecid() {
    return specid;
  }

  public void setSpecid(long specid) {
    this.specid = specid;
  }

  public String getSpecname() {
    return specname;
  }

  public void setSpecname(String specname) {
    this.specname = specname;
  }

  public long getParentid() {
    return parentid;
  }

  public void setParentid(long parentid) {
    this.parentid = parentid;
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
