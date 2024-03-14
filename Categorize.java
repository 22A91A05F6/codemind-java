import java.util.Scanner;
public class Vij{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float  a=sc.nextFloat();
        if(a<150)
        {
            System.out.println("Person is Dwarf.");
        }
        else if(a>150 && a<=165)
        {
            System.out.println("Person is average heighted.");
        }
        else if(a>165 && a<=195)
        {
            System.out.println("Person is taller.");
        }
        else
        {
            System.out.println("Abnormal height.");
        }
        
    }
}