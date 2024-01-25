import java.util.Scanner;
 public class Add{
public static void main(String[] args)
{
//creating an object12
//classna,e objectname=new class/ame();
//object of scanner class
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i;
int s=0;
for(i=1;i<=n;i++)
{
    s=s+i;
}
System.out.println(s);
}
}