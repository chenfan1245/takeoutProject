package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("商品表")
public class Tblgoods {
  @ApiModelProperty(value = "商品id")
  private long goodsid;
  @ApiModelProperty(value = "商家id")
  private long shopid;
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

  public Tblgoods() {
  }

  public long getGoodsid() {
    return goodsid;
  }

  public void setGoodsid(long goodsid) {
    this.goodsid = goodsid;
  }


  public long getShopid() {
    return shopid;
  }

  public void setShopid(long shopid) {
    this.shopid = shopid;
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

}
