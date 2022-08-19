package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("系统消息类")
public class Tblnotice {
  @ApiModelProperty(value = "系统消息id")
  private long noticeid;
  @ApiModelProperty(value = "发送者id")
  private long senderid;
  @ApiModelProperty(value = "系统消息的内容")
  private String noticecontent;
  @ApiModelProperty(value = "接收者id")
  private long receiverid;
  @ApiModelProperty(value = "角色id")       // 用于区分接收人是用户还是骑手还是商家
  private long roleid;
  @ApiModelProperty(value = "发送时间")
  private String noticetime;
  @ApiModelProperty(value = "系统消息状态（未读 / 已读）")
  private String noticestate;

  public Tblnotice() {
  }

  public long getNoticeid() {
    return noticeid;
  }

  public void setNoticeid(long noticeid) {
    this.noticeid = noticeid;
  }


  public long getSenderid() {
    return senderid;
  }

  public void setSenderid(long senderid) {
    this.senderid = senderid;
  }


  public String getNoticecontent() {
    return noticecontent;
  }

  public void setNoticecontent(String noticecontent) {
    this.noticecontent = noticecontent;
  }


  public long getReceiverid() {
    return receiverid;
  }

  public void setReceiverid(long receiverid) {
    this.receiverid = receiverid;
  }

  public long getRoleid() {
    return roleid;
  }

  public void setRoleid(long roleid) {
    this.roleid = roleid;
  }

  public String getNoticetime() {
    return noticetime;
  }

  public void setNoticetime(String noticetime) {
    this.noticetime = noticetime;
  }

  public String getNoticestate() {
    return noticestate;
  }

  public void setNoticestate(String noticestate) {
    this.noticestate = noticestate;
  }
}
