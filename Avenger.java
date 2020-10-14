import java.util.*;
public class Avenger{
    String name,power,weapon,planet;
    int age;
    Scanner sc =new Scanner(System.in);
    public void getdetails(){
        System.out.println("enter name is :");
        name = sc.nextLine();
        System.out.println("enter age is :");
        age = sc.nextInt();
        System.out.println("enter power :");
        power = sc.next();
        System.out.println("enter weapon :");
        weapon = sc.next();
        System.out.println("enter planet :");
        planet =sc.next();
    }     
    public void displaydetails(){
        System.out.println("the name of avenger is : " +name);
        System.out.println("the age of "+ name + " is : " +age);
        System.out.println("power of "+ name + " is : " +power);
        System.out.println("weapon of "+ name + " is : " + weapon);
        System.out.println("planet of "+name+" is : " + planet);
    }
    public static void main(String args[]) {
        Avenger obj = new Avenger();
        obj.getdetails();
        obj.displaydetails();
    }
}