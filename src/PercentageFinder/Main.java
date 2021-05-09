package PercentageFinder;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Taking Inputs

        Scanner Obj0 = new Scanner(System.in);
        System.out.print("What's The Value out of: ");
        int Out_of_Value = Obj0.nextInt();

        Scanner Obj1 = new Scanner(System.in);
        System.out.print("Enter EVS Marks: ");
        float EVS = Obj1.nextFloat();

        Scanner Obj2 = new Scanner(System.in);
        System.out.print("Enter Eng Marks: ");
        float Eng = Obj2.nextFloat();

        Scanner Obj3 = new Scanner(System.in);
        System.out.print("Enter Hindi Marks: ");
        float Hindi = Obj3.nextFloat();

        Scanner Obj4 = new Scanner(System.in);
        System.out.print("Enter Maths Marks: ");
        float Maths = Obj4.nextFloat();

//      Processing
        float Total = EVS + Eng + Hindi + Maths;
        float Absolute_Percentage = Total / (Out_of_Value*4) * 100;
//      Printing The Result
        System.out.println(Absolute_Percentage);
    }
}