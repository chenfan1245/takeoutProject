package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("商家类")
public class Tblshop {
  @ApiModelProperty(value = "商家id")
  private long shopid;
  @ApiModelProperty(value = "角色id")
  private long roleid;
  @ApiModelProperty(value = "店铺名称")
  private String shopname;
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
  @ApiModelProperty(value = "商家审核情况（未审核 / 审核通过 / 审核未通过）")
  private String auditstate;
  @ApiModelProperty(value = "余额")
  private double income;
  @ApiModelProperty(value = "店铺评分")
  private double shopscore;
  @ApiModelProperty(value = "法人姓名")
  private String legalpersonname;
  @ApiModelProperty(value = "法人身份证号")
  private String legalpersonid;

  public Tblshop() {
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


  public String getShoptel() {
    return shoptel;
  }

  public void setShoptel(String shoptel) {
    this.shoptel = shoptel;
  }


  public java.sql.Time getOpentime() {
    return opentime;
  }

  public void setOpentime(java.sql.Time opentime) {
    this.opentime = opentime;
  }


  public java.sql.Time getEndtime() {
    return endtime;
  }

  public void setEndtime(java.sql.Time endtime) {
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


  public String getAuditstate() {
    return auditstate;
  }

  public void setAuditstate(String auditstate) {
    this.auditstate = auditstate;
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

}
