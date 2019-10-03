
import  java.util.*;
 class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,n;
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		switch(n)
		{
		case 1:
			a=sc.nextInt();
			int area1=a*a;
			System.out.println(area1);
			break;
		case 2:
			a=sc.nextInt();
			b=sc.nextInt();
			int area2=a*b;
			System.out.println(area2);
			break;
		case 3:
			a=sc.nextInt();
			b=sc.nextInt();
			int area3=(a*b)/2;
			System.out.println(area3);
			break;
		case 4:
			a=sc.nextInt();
			 double area4=3.1399999999999999*(a*a);
			System.out.println(area4);
			break;
			default:
			break;
			
		}
		sc.close();
	}

}
