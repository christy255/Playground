
import java.util.*;
 class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1,str2;
		int part;
		Scanner sc=new Scanner(System.in);
		str1=sc.nextLine();
		str2=sc.nextLine();
		part=sc.nextInt();
str1=str2;
for(int i=0;i<str1.length();i++)
{
	char c = str1.charAt(i);
	System.out.print(c);
	if(c==' ')
	{
		System.out.println("");
	}
	
}
sc.close();
	}

}
