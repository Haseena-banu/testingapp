package com.contactapp.testingapp;

public class userinfo {
    String name,phone_no,email;

    public userinfo() {

    }

    public userinfo(String name, String phone_no, String email) {
        this.name = name;
        this.phone_no = phone_no;
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
