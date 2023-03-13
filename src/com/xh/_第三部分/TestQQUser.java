package com.xh._第三部分;

public class TestQQUser {
    public static void main(String[] args) {
        GeneralUser gu = new GeneralUser("普通用户", "111111", "222222");
        gu.login();
        Administrator at = new Administrator("管理员", "123456","666666",1999);
        at.login();
    }
}
