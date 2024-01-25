import java.util.Scanner;
public class Add{
public static void main(String[] args)
{
//creating an object12
//classna,e objectname=new class/ame();
//object of scanner class
Scanner n=new Scanner(System.in);
int p=n.nextInt();
int i;
for(i=1;i<=p;i++)
{
    if(p%i==0)
    {
      //System.out.println(i+ " "); 
      System.out.printf("%d ",i);
    }
}

}
}