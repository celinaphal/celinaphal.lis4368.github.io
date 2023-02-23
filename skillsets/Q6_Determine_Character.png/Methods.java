import java.util.Scanner;

public class Methods
{

//Create method without returning any value
public static void getRequirements()
{
//display operational messages
System.out.println("Developer: Celina Phal");
System.out.println("Program determines total number of characters in line of text, \nas well as number of times specific character is used. ");
System.out.println("Program displays character\'s ASCII value.");

System.out.println("\nReferences:\n"
        + "ASCII Background: https://en.wikipedia.org/wiki/ASCII\n"
        + "ASCII Character Table: https://www.ascii-code.com/\n"
        + "Lookup Tables: https://www.lookuptables.com/");

System.out.println(); //print blank line

}

public static void characterInfo()
{
//initialize variables
String str = "";
char ch = ' ';
int len = 0;
int num - 0;
Scanner sc = new Scanner(System.in);

//Demo text
System.out.print("please enter line of text: ");
str = sc.nextLine(); //read line of user input
len = str.length();

System.out.print("Please enter character to check: ");
//captures first character from user entered token
ch = sc.next().charAt(0);

for(int i=0;i<len;i++)
{
if(ch == str.charAt(l))
{
++num;
}
}

System.out.println("\nNumber of characters in line of text: " + len);
System.out.println("The character "+ch+ " appears " + num + " time(s) in line of text.");
System.out.println("ASCII value: " + (int)ch);
sc.close();
}
}