package com.xh._第三部分.other;


/**
 * @author 肖华
 */
public class Time01 {
    
    public static void main(String[] args) {
        User u = new User();
        Address a = new Address();
        u.name = "jack";
        u.age = 18;
        u.addr = a;
        a.city = "北京";
        System.out.println(u.name);
        System.out.println(u.age);
        System.out.println(u.addr.city);
    }

}
