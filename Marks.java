

import java.util.*;

class Marks
{
    public static void main(String args[])
    {
        float eng, phy, chem, math, comp;
        double total, avg, percentage;
        Scanner op=new Scanner(System.in);
        System.out.println("Enter marks of five subjects:");
        System.out.print("Enter marks of English subjects:");
        eng=op.nextFloat();
        System.out.print("Enter marks of physics subjects:");
        phy=op.nextFloat();
        System.out.print("Enter marks of chemistry subjects:");
        chem=op.nextFloat();
        System.out.print("Enter marks of maths subjects:");
        math=op.nextFloat();
        System.out.print("Enter marks of computers subjects:");
        comp=op.nextFloat();

        total = eng + phy + chem + math + comp;
        avg = (total / 5.0);
        percentage = (total / 500.0) * 100;

        System.out.println("Total marks ="+total);
        System.out.println("Average marks = "+avg);
        System.out.println("Percentage = "+percentage);
        System.out.print("The student Grade is : ");

        if(avg >=90 && avg <=100){
            System.out.println(" O ");
        }
        else if(avg >=80 && avg <90){
            System.out.println(" S ");
        }
        else if(avg >=70 && avg <80){
            System.out.println(" A ");
        }
        else if(avg >=60 && avg <70){
            System.out.println(" B ");
        }
        else if(avg >=50 && avg <60){
            System.out.println(" C ");
        }
        else if(avg >=40 && avg <50){
            System.out.println(" D ");
        }
        else {
            System.out.println(" F ");
        }

    }
}


