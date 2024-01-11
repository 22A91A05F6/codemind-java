import java.util.Scanner;
public class Vijaya
{
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    float p;
    p=(a*a)+(b*b);
    System.out.printf("%.2f",Math.sqrt(p));
}
}