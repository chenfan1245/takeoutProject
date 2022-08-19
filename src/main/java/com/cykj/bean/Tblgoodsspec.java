package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("商品规格表")
public class Tblgoodsspec {
  @ApiModelProperty(value = "商品规格id")
  private long id;
  @ApiModelProperty(value = "商品id")
  private long goodsid;
  @ApiModelProperty(value = "规格id")
  private long specid;

  @ApiModelProperty(value = "用户id")
  private long userid;
  @ApiModelProperty(value = "商品名称")
  private String goodsname;
  @ApiModelProperty(value = "规格内容")
  private String specname;

  public Tblgoodsspec() {
  }

  @Override
  public String toString() {
    return "商品规格{" +
            "id=" + id +
            ", 商品id=" + goodsid +
            ", 规格id=" + specid +
            ", 用户id=" + userid +
            ", 商品名称='" + goodsname + '\'' +
            ", 规格内容='" + specname + '\'' +
            '}' + '\n';
  }

  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }

  public String getGoodsname() {
    return goodsname;
  }

  public void setGoodsname(String goodsname) {
    this.goodsname = goodsname;
  }

  public String getSpecname() {
    return specname;
  }

  public void setSpecname(String specname) {
    this.specname = specname;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getGoodsid() {
    return goodsid;
  }

  public void setGoodsid(long goodsid) {
    this.goodsid = goodsid;
  }


  public long getSpecid() {
    return specid;
  }

  public void setSpecid(long specid) {
    this.specid = specid;
  }

}
