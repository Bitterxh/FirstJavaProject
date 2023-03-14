package com.xh._第三部分.other;

public class Administrator extends QQUser{

    //子类自己的构造方法
    private int evl;
    public Administrator(String name, String account, String password, int evl) {
        super(name, account, password);
        this.evl = evl;
    }

    //子类重写了父类方法
    @Override
    public void login(){
        System.out.println("我是"+this.name);
        System.out.println("我的账号是："+this.account);
        System.out.println("我的密码是："+this.password);
        System.out.println("管理员密钥："+this.evl);
        System.out.println("登录成功！");

    }
}
