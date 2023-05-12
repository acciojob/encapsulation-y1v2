package com.driver;

public class RWOnly {
    private String Name;
    
    public void setName(String n){
        this.Name= n;
    }
    public void getName(){
        System.out.println(this.Name);
    }
}
