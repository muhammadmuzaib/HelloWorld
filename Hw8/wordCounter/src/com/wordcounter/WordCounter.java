/*
Name: wordCounter
Author: Muhammad Muzaib
Description: Program reads input from a file line by line and figures out how many words are in the file.
 */

package com.wordcounter;

import java.io.File;
import java.util.Scanner;

public class WordCounter
{
    //Function takes in a file, reads its contents and returns the word count.
    public static int calculateWordCount(Scanner inputFile)
    {
        String word;
        int wordCount = 0;
        while(inputFile.hasNextLine())
        {
            word = inputFile.nextLine();
            String[] storeWord = word.trim().split("\\s+");
            wordCount += storeWord.length;
        }
        inputFile.close();
        return wordCount;
    }

    public static void main(String[] args) throws Exception
    {
        Scanner inputFile = new Scanner(new File("readFile.txt"));
        int wordCount = calculateWordCount(inputFile);
        System.out.println("The word count in the file is: " + wordCount);

    }
}
