package com.xh._第三部分;

public class QQUser{

    public String name;
    public String account;
    public String password;

    public QQUser(String name, String account, String password){
        this.name = name;
        this.account = account;
        this.password = password;
    }

    public void login(){
        System.out.println("我是"+this.name);
        System.out.println("我的账号是："+this.account);
        System.out.println("我的密码是："+this.password);
        System.out.println("登录成功！");
    }
}
