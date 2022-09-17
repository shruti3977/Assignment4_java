//This Program is prepared by 21CE118 Shruti Sangani
//Part-4 Practical-2
//Aim :: Write a program to generate user defined exception using “throw” and “throws” keyword.
class Practical2 extends Exception
{
    private static int accno[] = {1001, 1002, 1003, 1004};
    private static String name[] = {"Shruti", "Shubh", "Vruti", "Dhruti", "Akash"};
    private static double bal[] = {10000.00, 12000.00, 5600.0, 999.00, 1100.55};
    Practical2() {}
    Practical2(String str)//constructor
    {
        super(str);
    }
    public static void main(String[] args)
    {
        try
        {
            System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");
            for (int i = 0; i < 5 ; i++)
            {
                System.out.println(accno[i] + "\t" + name[i] + "\t" + bal[i]);
                if (bal[i] < 1000)
                {
                    Practical2 m = new Practical2("Balance is less than 1000");
                    throw m;//throw exception
                }
            }
        }
        catch (Practical2 e)
        {
            e.printStackTrace();
        }
    }
}