package com.company;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        /**
         * this program is designed to Convert some general units, for example:
         * cm to feet
         * km to mile
         * kg to pound
         * fahrenheit to celsius
         *
         */
        Scanner input = new Scanner(System.in);

        // write your code heresout
        System.out.println("Welcome to the Easy Converter");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Would you like to convert something ");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("for yes please type (y), for no please type (n) ");
        TimeUnit.SECONDS.sleep(1);
        String choice = input.next();
        while (!(choice.equals("y")||(choice.equals("n")))){
            System.out.println("You can only use (y) or (n) ");
            choice = input.next();
        }

        while (choice.equals("y")) {

            System.out.println(" Can you please choose one or the following values ");
        TimeUnit.SECONDS.sleep(1);
            System.out.println(" For kilogram to pound please type {kg}");
        TimeUnit.SECONDS.sleep(1);
            System.out.println(" For pound to kilogram please type {po}");
        TimeUnit.SECONDS.sleep(1);
            System.out.println(" For kilometer to mile please type {km}");
        TimeUnit.SECONDS.sleep(1);
            System.out.println(" For mile to kilometer please type {mi}");
        TimeUnit.SECONDS.sleep(1);
            System.out.println(" For cm to feet please type {cm}");
        TimeUnit.SECONDS.sleep(1);
            System.out.println(" For feet to cm please type {fe}");
        TimeUnit.SECONDS.sleep(1);
            System.out.println(" For Fahrenheit  to Celsius please type {fh}");
        TimeUnit.SECONDS.sleep(1);
            System.out.println(" For Celsius to Fahrenheit please type {cl}");
        TimeUnit.SECONDS.sleep(1);


            // this will be the welcoming line
            String value = input.next();
            if (value.equals("mi")) {
                System.out.println("Please give me the number of miles:");
                double miles = input.nextDouble();
        TimeUnit.SECONDS.sleep(1);
                System.out.println("It equals : " + Convert.mileToKilometer(miles) + " in kilometers ");
            }
            else if (value.equals("km")) {
                System.out.println("Please give me the number of kilometers: ");
                double km = input.nextDouble();
                System.out.println("It equals : " + Convert.kmToMile(km) + " in miles");
            }
            else if (value.equals("cm")) {
                System.out.println("Please give me the number of centimeters: ");
                double cm = input.nextDouble();
                System.out.println("It equals : " + Convert.cmToFeet(cm) + " in feet");
            }
            else if (value.equals("fe")) {
                System.out.println("Please give me the number of feet: ");
                double feet = input.nextDouble();
                System.out.println("It equals : " + Convert.feetToCm(feet) + " in centimeters");
            }
            else if (value.equals("kg")) {
                System.out.println("Please give me the number of kilograms: ");
                double kg = input.nextDouble();
                System.out.println("It equals : " + Convert.kgToPound(kg) + " in pounds");
            }
            else if (value.equals("po")) {
                System.out.println("Please give me the number of pounds :");
                double pound = input.nextDouble();
                System.out.println("It equals : " + Convert.poundToKg(pound) + " in kilograms");
            }
            else if (value.equals("cl")) {
                System.out.println("Please give me the temperature in celsius :");
                double celsius = input.nextDouble();
                System.out.println("It equals : " + Convert.celsiusToFahrenheit(celsius) + " in fahrenheit");
            }
            else if (value.equals("fh")) {
                System.out.println("Please give me the temperature in fahrenheit :");
                double fahrenheit = input.nextDouble();
                System.out.println("It equals : " + Convert.mileToKilometer(fahrenheit) + " in Celsius");
            }
            else {
                System.out.println(" please enter a valid value");
            }


        TimeUnit.SECONDS.sleep(1);
            System.out.println("Would you like to convert something else ");
        TimeUnit.SECONDS.sleep(1);
            System.out.println("for yes please type (y), for no please type (n) ");
            String confimation = input.next();
            while (!(confimation.equals("y")||(confimation.equals("n")))){
                System.out.println("Please enter (y) or (n)");
                confimation=input.next();
            }


            if (confimation.equals("n")) {
                System.out.println("Thank you for using the easy converter ");
                break;
            }
        }


         if (choice.equals("n")) {
            System.out.println("Thank you for using the easy converter ");


        }


    }
}
