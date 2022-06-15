package com.gradecalc;

import java.util.Scanner;

public class GradeCalc
{
    public static void main(String[] args)
    {
        float homeWork, codeLab, midTerm1, midTerm2, finalExam, finalScore;

        //Declare thr scanner
        Scanner sc = new Scanner(System.in);

        //Get inputs
        System.out.println("Enter your Home Work score: ");
        homeWork = sc.nextFloat();
        System.out.println("Enter your Code Lab score: ");
        codeLab = sc.nextFloat();
        System.out.println("Enter your MidTerm 1 score: ");
        midTerm1 = sc.nextFloat();
        System.out.println("Enter MidTerm 2 score: ");
        midTerm2 = sc.nextFloat();
        System.out.println("Enter Final Exam score: ");
        finalExam = sc.nextFloat();

        //calc sum
        finalScore = homeWork + codeLab + midTerm1 + midTerm2 + finalExam;

        //Print final score;
        System.out.println("The final score is " + finalScore);



    }
}
