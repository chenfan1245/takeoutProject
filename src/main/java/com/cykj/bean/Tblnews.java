package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("在线联系消息类（群聊）")
public class Tblnews {
  @ApiModelProperty(value = "群聊消息id")
  private long newsid;
  @ApiModelProperty(value = "订单id")
  private long orderid;
  @ApiModelProperty(value = "角色id")
  private long roleid;
  @ApiModelProperty(value = "发送时间")
  private java.sql.Timestamp senttime;
  @ApiModelProperty(value = "发送内容")
  private String sentcontent;

  public Tblnews() {
  }

  public long getNewsid() {
    return newsid;
  }

  public void setNewsid(long newsid) {
    this.newsid = newsid;
  }


  public long getOrderid() {
    return orderid;
  }

  public void setOrderid(long orderid) {
    this.orderid = orderid;
  }


  public long getRoleid() {
    return roleid;
  }

  public void setRoleid(long roleid) {
    this.roleid = roleid;
  }


  public java.sql.Timestamp getSenttime() {
    return senttime;
  }

  public void setSenttime(java.sql.Timestamp senttime) {
    this.senttime = senttime;
  }


  public String getSentcontent() {
    return sentcontent;
  }

  public void setSentcontent(String sentcontent) {
    this.sentcontent = sentcontent;
  }

}
