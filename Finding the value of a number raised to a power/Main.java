import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {

		
int a,b;
int mul=1;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
for(int i=1;i<=b;i++)
{
	mul = mul*a;
}
System.out.println(mul);
sc.close();	}

}
//Try your logic here
    
