package com.company;

public class Main {

    public static void main(String[] args) {
            calcFeetAndInchesToCentimeters(6,2);
             calcFeetAndInchesToCentimeters(100);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if (feet >= 0 || inches >= 0 && inches <= 12) {
            //1 inch= 2.54cm 1 foot= 12inches

            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + " feet " + inches + " inches " + centimeters + " centimeters");
            return centimeters;
        }
        System.out.println("invalid parameters");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {

         double feet = (int) inches / 12;
         double remainInches = (int) inches % 12;
            System.out.println(inches + "inches is equal to " + feet + "feet and " + remainInches + " inches");
            return calcFeetAndInchesToCentimeters(feet, inches);
        }
        return -1;
    }
}
