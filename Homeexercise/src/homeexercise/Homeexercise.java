/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeexercise;

import java.util.Scanner;

/**
 *
 * @author Fujitsu
 */
public class Homeexercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int operator;

        do {

            System.out.println("1=Addition");
            System.out.println("2=Substraction");
            System.out.println("3=Multiplication");
            System.out.println("4=Division");
            System.out.println("5=Power");
            System.out.println("6=Sinx");
            System.out.println("7=Cosx");
            System.out.println("8=Log");
            System.out.println("Press -1 to exit");

            System.out.println("Enter a number from 1-7 to run the program"
                    + "or -1 to end the program");

            Scanner sc = new Scanner(System.in);
            operator = (int) sc.nextDouble();

            switch (operator) {
                case (1):
                    System.out.println("Enter two numbers for addition");

                    System.out.print("X= ");
                    Scanner inputX1 = new Scanner(System.in);
                    double x1 = inputX1.nextFloat();
                    System.out.print("Y= ");
                    Scanner inputY1 = new Scanner(System.in);
                    double y1 = inputY1.nextFloat();
                    System.out.print("x + y = \t");
                    System.out.println(x1 + y1);
                    break;
                case (2):
                    System.out.println("Enter two numbers for Substraction");
                    System.out.print("X= ");
                    Scanner inputX2 = new Scanner(System.in);
                    double x2 = inputX2.nextFloat();
                    System.out.print("Y= ");
                    Scanner inputY2 = new Scanner(System.in);
                    double y2 = inputY2.nextFloat();

                    System.out.print("x - y  = \t");
                    System.out.println(x2 - y2);
                    break;

                case (3):
                    System.out.print("Enter two numbers for Multiplication");

                    System.out.print("X= ");
                    Scanner inputX3 = new Scanner(System.in);
                    double x3 = inputX3.nextFloat();
                    System.out.print("Y= ");
                    Scanner inputY3 = new Scanner(System.in);
                    double y3 = inputY3.nextFloat();
                    System.out.print("x * y = \t");
                    System.out.println(x3 * y3);
                    break;

                case (4):
                    System.out.print("Enter two numbers for Division");
                    System.out.print("X= ");
                    Scanner inputX4 = new Scanner(System.in);
                    double x4 = inputX4.nextFloat();
                    System.out.print("Y= ");
                    Scanner inputY4 = new Scanner(System.in);
                    double y4 = inputY4.nextFloat();
                    if (y4 == 0) {

                        System.out.println("Substraction when denominator = 0 does not exist ");
                        System.out.print( "x - y  = Does not exist \t");
                     break;
                    }
                    else{
                        
                    System.out.print("x / y = \t");
                        System.out.println(x4 / y4);
                        break;
                    }

                case 5:
                    System.out.print("Enter number and exponent to find the power ");
                    System.out.print("X= ");
                    Scanner inputX5 = new Scanner(System.in);
                    double x5 = inputX5.nextFloat();
                    System.out.print("y= ");
                    Scanner inputY5 = new Scanner(System.in);
                    double y5 = inputY5.nextFloat();
                    if (y5 == 0) {
 
                 System.out.print( "x^0 = 1 \t");
                     break;
                    }
                    else{
                    System.out.print("X^y = \t");
                    System.out.println(Math.pow(x5, y5));
                    break;
                    }
                case (6):
                    System.out.print("Enter X to find the Sinx ");
                    System.out.print("X= ");
                    Scanner inputX6 = new Scanner(System.in);
                    double x6 = inputX6.nextFloat();
                    System.out.print("sin x = \t");
                    System.out.println(Math.sin(x6));
                    break;

                case (7):
                    System.out.print("Enter X to find the Cosx ");
                    System.out.print("X= ");
                    Scanner inputX7 = new Scanner(System.in);
                    double x7 = inputX7.nextFloat();
                    System.out.print("cos x = \t");
                    System.out.println(Math.cos(x7));
                    break;

                case (8):
                    System.out.print("Enter base and number ");
                    Scanner inputX8 = new Scanner(System.in);
                    double x8 = inputX8.nextFloat();
                     {
                        if (x8 <= 0) {
                            System.out.println("Logb(x) is Undefind for x<=0");
                            break;
                        }
                        Scanner inputY8 = new Scanner(System.in);
                        double y8 = inputY8.nextFloat();
                        if (y8 < 0) {
                            System.out.println("Please enter a positive number");
                            break;
                        } else {

                            System.out.print("Log with base " + x8
                                    + " with number " + y8 + " =  \t");
                            System.out.println(Math.log(y8) / Math.log(x8));
                        }
                    }
                    break;

                case (-1):
                default:
            }

        } while (operator != (-1));

    }
}
