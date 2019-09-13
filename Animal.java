/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ekocan
 */
 
public class Animal {
    String fname = "Ekin";
    String lname = "Bacik";
    int age = 12;
  public static void main(String[] args) {
      Animal myObj = new Animal();
      System.out.println("Name:" + myObj.fname +" "+myObj.lname);
      System.out.println("Age : "+myObj.age);
      
  }
}