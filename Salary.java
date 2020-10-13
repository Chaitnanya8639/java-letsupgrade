import java.util.*;
public class Salary {
    public static void main(String[] args){
           String name;
           int age;
          int annsalary;
          int dob;
          int mob;
          int by;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter details:");
        System.out.println("Enter name:");
        name=s.nextLine();
        System.out.println("Enter age:");
        age=s.nextInt();
        System.out.println("Enter annsalary:");
        annsalary=s.nextInt();
        System.out.println("Enter DateofBirth:");
        dob=s.nextInt();
        System.out.println("Enter MonthofBirth:");
        mob=s.nextInt();
        System.out.println("Enter Birthyear:");
        by=s.nextInt();
        System.out.println("tax for annual salary is:");
       if(annsalary<=5){
            System.out.println(" 20% ");
        }
        else if(annsalary<=4){
            System.out.println(" 15% ");
        }
        else if(annsalary<=3){
            System.out.println("10%");
        }
        else if(annsalary<=2){
            System.out.println(" 5% ");
        }
        else {
            System.out.println(" less than ");
        }
        System.out.println("name is: "+name);
        System.out.println("age is: "+ age );
        System.out.println("annual salary is : " + annsalary);

    }
}