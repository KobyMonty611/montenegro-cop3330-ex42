/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Koby Montenegro
 */

package ex42;

public class App 
{
    public static void main(String[] args)
    {
        ParsingDataFile employee = new ParsingDataFile();

        //Trying to put this (bottom comment) in employee.printInfo will NOT work
        //File info = new File("src/main/java/ex42/exercise42_input.txt"); DO NOT PUT THIS

        //Heading Format
        System.out.printf("%-17s%-17s%-6s\n", "Last", "First", "Salary");
        System.out.println("----------------------------------------");

        //Actual print of the employee information
        //Will show up in the IDE as there is no outputFile
        //YOU MUST INCLUDE THE FULL DIRECTORY FOR THE TEXT FILE OR ELSE IT WON'T WORK
        employee.printInfo("src/main/java/ex42/exercise42_input.txt");
    }
}
