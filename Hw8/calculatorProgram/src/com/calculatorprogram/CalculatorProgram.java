/*
Name : CalculatorProgram
Author: Muhammad Muzaib
Description: Program asks user for an expression as an input. The program then uses that to separate
the sign from the two numbers. Then a function calculate is called to figure out the answer.
 */
package com.calculatorprogram;

import java.util.Scanner;

public class CalculatorProgram {

    //Function performs calculations ont the expression.
    public static Double calculate(Double variable1, String sign, Double variable2){
        switch (sign){
            case "+":
                return variable1 + variable2;
            case "-":
                return variable1 - variable2;
            case "/":
                return variable1 / variable2;
            case "*":
                return variable1 * variable2;
            case "%":
                return  variable1 % variable2;
            default:
                System.out.println("Invalid Statement");
                break;
        }
        return null;
    }
    public static void main(String[] args){
        //Declerations
        Double variable1;
        Double variable2;
        Double answer;
        String sign;
        Scanner keyBoard = new Scanner(System.in);
        System.out.print("Enter an expression to calculate separated by spaces: ");
        String input = keyBoard.nextLine();
        Scanner sc = new Scanner(input);
        variable1 = sc.nextDouble();
        sign = sc.next();
        variable2 = sc.nextDouble();
        answer = calculate(variable1, sign, variable2);
        if(answer == null){
            System.out.println("Error: Wrong expression. Try again.");
            System.exit(0);
        }

        System.out.println("The answer to " + variable1 + " "
                            + sign + " " + variable2 + " is: " + answer);
        keyBoard.close();
        sc.close();
    }
}
