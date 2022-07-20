package com.karl.onlinetaxi.account.entity;

import com.karl.onlinetaxi.util.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Objects;

@ApiModel("用户信息")
public class User extends BaseEntity implements Serializable {

    @ApiModelProperty(hidden = true)
    private Integer uid;

    @ApiModelProperty(hidden = true)
    private String userName;

    @ApiModelProperty(hidden = true)
    private Integer sex;

    @ApiModelProperty(value = "手机号", required = true)
    private String userPhone;

    @ApiModelProperty(hidden = true)
    private String userEmail;

    @ApiModelProperty(hidden = true)
    private String usercode;

    @ApiModelProperty(value = "密码", required = true)
    private String password;

    @ApiModelProperty(hidden = true)
    private String avatar;

    @ApiModelProperty(hidden = true)
    private String fullName;

    @ApiModelProperty(hidden = true)
    private String salt;

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return Objects.equals(getUid(), user.getUid()) &&
                Objects.equals(getUserName(), user.getUserName()) &&
                Objects.equals(getSex(), user.getSex()) &&
                Objects.equals(getUserPhone(), user.getUserPhone()) &&
                Objects.equals(getUserEmail(), user.getUserEmail()) &&
                Objects.equals(getUsercode(), user.getUsercode()) &&
                Objects.equals(getPassword(), user.getPassword()) &&
                Objects.equals(getAvatar(), user.getAvatar()) &&
                Objects.equals(getFullName(), user.getFullName()) &&
                Objects.equals(getSalt(), user.getSalt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getUid(), getUserName(), getSex(), getUserPhone(), getUserEmail(), getUsercode(), getPassword(), getAvatar(), getFullName(), getSalt());
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", userPhone='" + userPhone + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", usercode='" + usercode + '\'' +
                ", password='" + password + '\'' +
                ", avatar='" + avatar + '\'' +
                ", fullName='" + fullName + '\'' +
                ", salt='" + salt + '\'' +
                '}';
    }
}

