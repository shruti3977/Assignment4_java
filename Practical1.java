//This Program is prepared by 21CE118 Shruti Sangani
//Part-4 Practical-1
//Aim :: Write a program to show the try - catch block to catch the different types of exception.
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Practical1
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println(37/0);//Arithmetic Exception
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
            System.out.println("Arithmetic Exception");
        }
        try
        {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);//ArrayIndex out of bound Exception
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("ArrayIndex out of bound Exception");
        }
        String ptr = null;
        try
        {
            if (ptr.equals("String"))//Null Pointer Exception
                System.out.println("Same");
            else
                System.out.println("Not Same");
        }
        catch(NullPointerException e)
        {
            e.printStackTrace();
            System.out.println("Null Pointer Exception");
        }
        try
        {
            File file = new File("file.txt");
            FileReader f = new FileReader(file);//File not found Exception
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            System.out.println("File does not exist");
        }
        try
        {
            int num = Integer.parseInt ("Hello") ;
            System.out.println(num);//Number format exception
        }
        catch(NumberFormatException e)
        {
            e.printStackTrace();
            System.out.println("Number format exception");
        }
        try{
            Class.forName("Class");//Class Not Found Exception
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
            System.out.println("Class Not Found Exception");
        }
    }
}