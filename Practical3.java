//This Program is prepared by 21CE118 Shruti Sangani
//Part-4 Practical-3
/*Aim :: Write a program that raises two exceptions. Specify two ‘catch’ clauses for the two
exceptions. Each ‘catch’ block handles a different type of exception. For example the exception
could be ‘ArithmeticException’ and ‘ArrayIndexOutOfBoundsException’. Display a message in
the ‘finally’ block.
 */
public class Practical3 {
    public static void main(String[] args)
    {
        int[] a=new int[2];
        try
        {
            System.out.println("element three of array is :: "+a[3]);//Index not found.ArrayIndexOutOfBoundsException
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception throw ArithmeticException");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception throw ArrayIndexOutOfBoundsException");
        }
        finally//must be called
        {
            a[1]=20;
            System.out.println("Element value: " + a[1]);
            System.out.println("The finally statement is executed");
        }
    }
}
