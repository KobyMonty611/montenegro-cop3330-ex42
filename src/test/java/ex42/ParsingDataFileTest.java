package ex42;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class ParsingDataFileTest {

    @Test
    void parsingData() throws FileNotFoundException
    {

        File test42 = new File("src/main/java/ex42/exercise42_input.txt");

        Scanner scan = new Scanner(test42);
        String actual = "";

        actual += String.format("%-17s%-17s%-17s\n", "Last", "First", "Salary\n----------------------------------------");

            while (scan.hasNext()) {
                //Used to check for formatting
                java.lang.String check = scan.nextLine();

                //When a comma appears, the output will automatically skip it
                java.lang.String[] attribute = check.split(",");

                //Used to format the amount of space and character (TOGETHER) needed on the left (since it's -)
                actual += String.format("%-17s%-17s%-5s\n", attribute[0], attribute[1], attribute[2]);
            }

            scan.close();

        String expected =
                "Last             First            Salary\n" +
                "----------------------------------------\n" +
                "Ling             Mai              55900\n" +
                "Johnson          Jim              56500\n" +
                "Jones            Aaron            46000\n" +
                "Jones            Chris            34500\n" +
                "Swift            Geoffrey         14200\n" +
                "Xiong            Fong             65000\n" +
                "Zarnecki         Sabrina          51500\n";


        //COMPARISON

        assertEquals(expected, actual);
        }

}
