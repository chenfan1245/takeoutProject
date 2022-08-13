package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

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

  public Tblredpacket() {
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

}
