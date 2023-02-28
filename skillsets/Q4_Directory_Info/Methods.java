import java.util.Scanner;

import java.io.File;

public class Methods

{

public static void getRequirements()

{
    System.out.println("Developer: Celina Phal");
    System.out.println("Program lists files and subdirectories of user-specified directory");
}
    public static void directoryInfo()
    {
        String myDir="";
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter directory path: ");
        myDir = sc.nextLine();

        File directoryPath = new File("/Users/CelinaPhal/myProject/tomcat/webapps/lis4368");

        try{
            File[] files = directoryPath.listFiles();

            for (int i = 0; i < files.length; i++)

            {
                System.out.println("Name: " + files[i].getName());
                System.out.println("Path: " + files[i].getAbsolutePath());
                System.out.println("Size (Bytes)" + files[i].length());
                System.out.println("Size (KB)" + files[i].length()/(1024));
                System.out.println("Size(MB)" + files[i].length()/(1024*1024));
            }
        }
catch(Exception e)
{
    System.err.println(e.getMessage());
}
sc.close();
    }
}