package com.driver;

public class Main {
  
  public static void main(String args[]){
    
    RWOnly obj = new RWOnly();
    
    // gives error as name has the private access in RWOnly class
    obj.name = "Ramesh";
    System.out.println(obj.name);
    
    obj.setName("Ramesh");
    System.out.println(obj.getName());
  }
}
