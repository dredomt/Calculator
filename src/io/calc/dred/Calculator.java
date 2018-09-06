package io.calc.dred;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println(mainMenu());

        int value;
        Scanner scan  = new Scanner(System.in);
        value = scan.nextInt();

        switch(value){
            case 1:
                System.out.println("1. Addition. Enter numbers to calculate. ");
                break;
            case 2:
                System.out.println("2. Subtraction. Enter numbers to calculate. ");
                break;
            case 3:
                System.out.println("3. Multiplication. Enter numbers to calculate ");
                break;
            case 4:
                System.out.println("4. Division. Enter numbers to calculate ");
                break;
            case 13:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Wrong number!");
                break;

        }
    }

    public static String mainMenu(){

        String a = "\033[30m                   Welcome to the 'Calculator v. 0.1' \n ";
        String b = "\033[31mTo start work with app choose the number of operation and press 'Enter'\033[0m \n";
        String c = "1. Addition \n";
        String d = "2. Substraction \n";
        String e = "3. Multiplitcation \n";
        String f = "4. Division \n";
        String g = "13. Exit \n";
        String z = a + b + c + d + e + f + g;

        return z;
    }

}