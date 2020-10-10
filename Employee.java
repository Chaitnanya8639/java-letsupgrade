package com.company;
import java.util.*;
public class Employee {
    String name;
    int age;
    String city;
    public void display(){
        System.out.println("the name is "+ name);
        System.out.println("the age is "+ age);
        System.out.println("the city is " + city);
    }
    public static void main(String[] args){
        Employee e = new Employee();
        Employee e1= new Employee();
        e.name="Saurab";
        e.age=23;
        e.city="chennai";
        e.display();
    }
}