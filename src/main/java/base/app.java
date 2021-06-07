package base;
import java.text.DecimalFormat;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jose Valencia
 */

public class app {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        DecimalFormat numFormat = new DecimalFormat("#.0");

        //Input
        System.out.print("Enter your weight: ");
        double weight = newScan.nextDouble();

        System.out.print("Enter your height: ");
        double height = newScan.nextDouble();

        //Calculate
        double BMI = (weight / (height * height)) * 703;

        //Output
        if(BMI < 18.5) {
            System.out.println("Your BMI is " + numFormat.format(BMI));
            System.out.println("You are underweight. Please consult a doctor.");
        }
        else if(BMI > 25) {
            System.out.println("Your BMI is " + numFormat.format(BMI));
            System.out.println("You are overweight. Please consult a doctor");
        }
        else {
            System.out.println("Your BMI is " + numFormat.format(BMI));
            System.out.println("You are within the ideal weight range.");
        }
    }

}
