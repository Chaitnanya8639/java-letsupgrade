package com.quizapplication;
import java.util.Scanner;
public class Player {
    Scanner sc=new Scanner(System.in);
    String name;
    int score=0;

    public void getDetails(){

        System.out.println("Enter player name");
        name=sc.next();

    }

}
