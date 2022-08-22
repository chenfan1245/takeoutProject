package com.cykj.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("收获地址类")
public class Tblrecaddress {
  @ApiModelProperty(value = "地址id")
  private long addressid;
  @ApiModelProperty(value = "用户id")
  private long userid;
  @ApiModelProperty(value = "收货人手机号")
  private String rectel;
  @ApiModelProperty(value = "收获地址")
  private String recaddress;
  @ApiModelProperty(value = "门牌号")
  private String housenum;
  @ApiModelProperty(value = "收货人姓名")
  private String recname;
  @ApiModelProperty(value = "备注（家 / 公司 / 学校）")
  private String info;
  @ApiModelProperty(value = "默认地址")
  private String isdefault;

  public String getIsdefault() {
    return isdefault;
  }

  public void setIsdefault(String isdefault) {
    this.isdefault = isdefault;
  }

  public Tblrecaddress() {
  }

  public long getAddressid() {
    return addressid;
  }

  public void setAddressid(long addressid) {
    this.addressid = addressid;
  }


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public String getRectel() {
    return rectel;
  }

  public void setRectel(String rectel) {
    this.rectel = rectel;
  }


  public String getRecaddress() {
    return recaddress;
  }

  public void setRecaddress(String recaddress) {
    this.recaddress = recaddress;
  }


  public String getHousenum() {
    return housenum;
  }

  public void setHousenum(String housenum) {
    this.housenum = housenum;
  }


  public String getRecname() {
    return recname;
  }

  public void setRecname(String recname) {
    this.recname = recname;
  }


  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  @Override
  public String toString() {
    return "Tblrecaddress{" +
            "addressid=" + addressid +
            ", userid=" + userid +
            ", rectel='" + rectel + '\'' +
            ", recaddress='" + recaddress + '\'' +
            ", housenum='" + housenum + '\'' +
            ", recname='" + recname + '\'' +
            ", info='" + info + '\'' +
            ", isdefault='" + isdefault + '\'' +
            '}';
  }
}
