import java.util.Scanner;
public class Vijaya{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Sum:"+(p+b));
        System.out.println("Difference:"+(p-b));
        System.out.println("Product:"+(p*b));
        System.out.println("Quotient:"+(p/b));
        System.out.println("Remainder:"+(p%b));
    }
}