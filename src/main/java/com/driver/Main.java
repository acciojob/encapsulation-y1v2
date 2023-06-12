package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();
//        rwOnly.name = "yash";  //no access due to access modifiers
//        System.out.println(rwOnly.name);//no access due to access modifiers
        rwOnly.setName("yash");
        String name = rwOnly.getName();
        System.out.println(name);
    }
}