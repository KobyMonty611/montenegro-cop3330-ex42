package ex42;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ParsingDataFile
{
    //prints out the information
    //Calls exercise42_input.txt as parameter
    public void printInfo(String employeeFile)
    {
        //Create new file info
        //Scan the file
        try
        {
            File info = new File(employeeFile);
            Scanner scan = new Scanner(info);

            //Checks during the file scanning
            while (scan.hasNext())
            {
                //Used to check for formatting
                String check = scan.nextLine();

                //When a comma appears, the output will automatically skip it
                String[] attribute = check.split(",");

                //Used to format the amount of space and character (TOGETHER) needed on the left (since it's -)
                System.out.printf("%-17s%-17s%-5s\n", attribute[0], attribute[1], attribute[2]);
            }

        }

        //In case something goes wrong
        catch (FileNotFoundException Exception)
        {
            System.out.println("Error: Something has gone wrong with the file or it has been lost.");
        }

    }
}
