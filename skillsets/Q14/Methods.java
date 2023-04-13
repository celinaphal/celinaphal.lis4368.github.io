import java.util.Scanner;
import java.io.*;

public class Methods
{
    public static void getRequirements()
    {
        System.out.println("Author: Celina Phal");
        System.out.println("Program Requirements: ");
        System.out.println("Program captures user input, write to and reads from same file, and counts number of words in file.");
        System.out.println("Hint: use hasNext() method to read number of words (tokens).");

        System.out.println();
    }

    public static void getWriteRead()
    {
        String myFile = "filecountwords.txt";

        try{
            File file = new file myFile;

            PrintWriter writer = new PrintWriter(file);

            Scanner input = new Scanner(System.in);

            String str = "";

            System.out.print("Please enter line of text: "); 
            str = input.nextLine();

            writer.write(str);

            System.out.println("Saved to file \"" + myFile + "\"");

            input.close();

            writer.close();

            Scanner read = new Scanner(new FileInputStream(file));
            int count = 0;
            while(read.hasNext())
            {
                read.next();
                count++;
            }
            System.out.println("Number of words: " + count);

            read.close();
        }
    }
}