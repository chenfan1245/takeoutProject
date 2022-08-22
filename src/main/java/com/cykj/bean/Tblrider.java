package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("骑手类")
public class Tblrider {
  @ApiModelProperty(value = "骑手id")
  private long riderid;
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
  private String auditstate;
  @ApiModelProperty(value = "骑手状态（启用 / 禁用）")
  private String riderstate;
  @ApiModelProperty(value = "余额")
  private double balance;
  @ApiModelProperty(value = "角色id")
  private long roleid;

  public String getRidername() {
    return ridername;
  }

  public void setRidername(String ridername) {
    this.ridername = ridername;
  }

  public long getRiderid() {
    return riderid;
  }

  public void setRiderid(long riderid) {
    this.riderid = riderid;
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


  public String getAuditstate() {
    return auditstate;
  }

  public void setAuditstate(String auditstate) {
    this.auditstate = auditstate;
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

}
