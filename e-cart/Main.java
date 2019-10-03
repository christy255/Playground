import java.util.*;//import required packages here

class Item
{
  private int price;
  //create various method to return attribute value(s)
  public void Item()
  {
      
  }
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
}

class Bill
{
  
  public void calculate(int a,int b)
  {
      int sum=a*b;
      System.out.println("Total Price is : "+sum);
  }//implement your logic to calculate total price
}
class Main
{
  public static void main(String[] args)
  {
      Scanner s=new Scanner(System.in);
      String item=s.nextLine();
      int price=s.nextInt();
      int quantity=s.nextInt();
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    obj.calculate(price,quantity);
    //write the logic here
  }
}