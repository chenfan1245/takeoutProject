package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户红包类")
public class Tbluserredpacket {
  @ApiModelProperty(value = "用户红包类的id")
  private long id;
  @ApiModelProperty(value = "红包id")
  private long redpacketid;
  @ApiModelProperty(value = "用户id")
  private long userid;
  @ApiModelProperty(value = "领取红包日期")
  private java.sql.Date receivedate;
  @ApiModelProperty(value = "红包过期的日期")
  private java.sql.Date invaliddate;
  @ApiModelProperty(value = "红包状态（未使用 / 已使用 / 已失效）")
  private String state;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getRedpacketid() {
    return redpacketid;
  }

  public void setRedpacketid(long redpacketid) {
    this.redpacketid = redpacketid;
  }


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public java.sql.Date getReceivedate() {
    return receivedate;
  }

  public void setReceivedate(java.sql.Date receivedate) {
    this.receivedate = receivedate;
  }


  public java.sql.Date getInvaliddate() {
    return invaliddate;
  }

  public void setInvaliddate(java.sql.Date invaliddate) {
    this.invaliddate = invaliddate;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

}
