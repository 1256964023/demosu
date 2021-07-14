package com.example.bean;

/**
 * @version 1.0
 * @author: qiqi
 * @date: 2021/7/6 20:43
 * @desc:
 */
public class User {
    private int userID;//id
    private String userAcc;//账号
    private String name;//名字
    private String userPass;//密码
    private String Ident;//证件号码
    private String email;//邮箱
    private String IdentType;//证件类型
    private String guestType;//旅客类型
    private String phone;//手机号码

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserAcc() {
        return userAcc;
    }

    public void setUserAcc(String userAcc) {
        this.userAcc = userAcc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getIdent() {
        return Ident;
    }

    public void setIdent(String ident) {
        Ident = ident;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentType() {
        return IdentType;
    }

    public void setIdentType(String identType) {
        IdentType = identType;
    }

    public String getGuestType() {
        return guestType;
    }

    public void setGuestType(String guestType) {
        this.guestType = guestType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userAcc='" + userAcc + '\'' +
                ", name='" + name + '\'' +
                ", userPass='" + userPass + '\'' +
                ", Ident='" + Ident + '\'' +
                ", email='" + email + '\'' +
                ", IdentType='" + IdentType + '\'' +
                ", guestType='" + guestType + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
