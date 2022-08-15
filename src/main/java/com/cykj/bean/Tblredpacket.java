package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

@ApiModel("红包表")
public class Tblredpacket {
  @ApiModelProperty(value = "红包id")
  private long redpacketid;
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

  /* 用户的红包 */
  @ApiModelProperty(value = "用户红包类的id")
  private long id;
  @ApiModelProperty(value = "用户id")
  private long userid;
  @ApiModelProperty(value = "领取红包日期")
  private java.sql.Date receivedate;
  @ApiModelProperty(value = "红包过期的日期")
  private java.sql.Date invaliddate;
  @ApiModelProperty(value = "红包状态（未使用 / 已使用 / 已失效）")
  private String state;
  /* 用户 */
  @ApiModelProperty(value = "角色id")
  private long roleid;
  @ApiModelProperty(value = "用户账号（手机号）")
  private String usertel;

  public Tblredpacket() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }

  public Date getReceivedate() {
    return receivedate;
  }

  public void setReceivedate(Date receivedate) {
    this.receivedate = receivedate;
  }

  public Date getInvaliddate() {
    return invaliddate;
  }

  public void setInvaliddate(Date invaliddate) {
    this.invaliddate = invaliddate;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public long getRoleid() {
    return roleid;
  }

  public void setRoleid(long roleid) {
    this.roleid = roleid;
  }

  public String getUsertel() {
    return usertel;
  }

  public void setUsertel(String usertel) {
    this.usertel = usertel;
  }

  public long getRedpacketid() {
    return redpacketid;
  }

  public void setRedpacketid(long redpacketid) {
    this.redpacketid = redpacketid;
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

  @Override
  public String toString() {
    return "红包{" +
            "红包id=" + redpacketid +
            ", 红包名称='" + redpacketname + '\'' +
            ", 门槛金额=" + thresholdmoney +
            ", 红包金额=" + redpacketmoney +
            ", 红包数量=" + redpacketnum +
            ", 时效天数=" + limitdays +
            ", 用户红包id=" + id +
            ", 用户id=" + userid +
            ", 红包领取日期=" + receivedate +
            ", 红包过期日期=" + invaliddate +
            ", 红包状态='" + state + '\'' +
            ", 角色id=" + roleid +
            ", 用户帐号='" + usertel + '\'' +
            '}' + '\n';
  }
}
