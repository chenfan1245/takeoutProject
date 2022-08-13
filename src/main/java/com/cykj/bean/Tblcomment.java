package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("评价表")
public class Tblcomment {
  @ApiModelProperty(value = "订单id")
  private long orderid;
  @ApiModelProperty(value = "商家id")
  private long shopid;
  @ApiModelProperty(value = "用户id")
  private long userid;
  @ApiModelProperty(value = "评价id")
  private long commentid;
  @ApiModelProperty(value = "角色id")   // 用于区分该评论是用户评论的还是商家回复的
  private long roleid;
  @ApiModelProperty(value = "评价内容")
  private String commentcontent;
  @ApiModelProperty(value = "评分")
  private long commentscore;

  public Tblcomment() {
  }

  public long getOrderid() {
    return orderid;
  }

  public void setOrderid(long orderid) {
    this.orderid = orderid;
  }


  public long getShopid() {
    return shopid;
  }

  public void setShopid(long shopid) {
    this.shopid = shopid;
  }


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public long getCommentid() {
    return commentid;
  }

  public void setCommentid(long commentid) {
    this.commentid = commentid;
  }


  public long getRoleid() {
    return roleid;
  }

  public void setRoleid(long roleid) {
    this.roleid = roleid;
  }


  public String getCommentcontent() {
    return commentcontent;
  }

  public void setCommentcontent(String commentcontent) {
    this.commentcontent = commentcontent;
  }


  public long getCommentscore() {
    return commentscore;
  }

  public void setCommentscore(long commentscore) {
    this.commentscore = commentscore;
  }

}
