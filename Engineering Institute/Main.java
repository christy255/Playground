/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;//import required packages

class Faculty
{
    int salary;
  public void salary(int salary)
  {
 //write your Faculty class statements
 System.out.println("Base Salary: "+salary);
  }
}
class CSE extends Faculty
{
  public void salary(int salary)
  {
    salary=salary+3000; //write your CSE class statements
    System.out.println("CSE Faculty: "+salary);
  }
}
class IT extends CSE
{
  public void salary(int salary)
  {
     salary=salary+5000;//write your IT class statements
     System.out.println("IT Faculty: "+salary);
  }
}
class ECE extends IT
{
  public void salary(int salary)
  {
    salary=salary+4500; //write your ECE class statements
    System.out.println("ECE Faculty: "+salary);
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
   int salary=s.nextInt();
   Faculty obj1=new Faculty();
   obj1.salary(salary);
   CSE obj2=new CSE();
   obj2.salary(salary);
   IT obj3=new IT();
   obj3.salary(salary);
    ECE obj = new ECE();
   obj.salary(salary); //implement your required concept here
  }
}