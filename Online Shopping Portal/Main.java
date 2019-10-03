public class Main {
public static void main(String[] args) {
//write the logic for the main function
Customers cus1 = new Customers();
cus1.displayProf("Saakshi",9000000000L);
Customers cus2 = new Customers();
cus1.displayProf("Rahul",9000000001L);
Suppliers sup1 = new Suppliers();
sup1.displayProf("ABC Traders",8000000000L);
Suppliers sup2 = new Suppliers();
sup2.displayProf("XYZ Enterprises",8000000900L);
cus1.editAddress("Saakshi","Bangalore");
cus2.editAddress("Saakshi","Coimbatore");
sup1.editAddress("ABC Traders","Mumbai");
sup2.editAddress("ABC Traders","Delhi");
cus1.placeOrder();
sup1.increaseStock(10,7,"ABC Traders","XYZ Enterprises");

    }
}

class Users {
//write the logic for the class Users      
}

class Customers extends Users{
//write the logic for the class Customers
long id,mobNo;
String name,shipAddr,dob,gender,orderHist;
public void editAddress(String name,String shipAddr)
{
this.name = name;
this.shipAddr = shipAddr;
System.out.println(name+", "+shipAddr);
}
public void placeOrder()
{
System.out.println("Order placed successfully!");
}
public void displayProf(String name,long mobNo)
{
this.name = name;
this.mobNo = mobNo;
System.out.println(name+", "+mobNo);
}
}

class Suppliers extends Users {
//write the logic for the class Suppliers
long id,mobNo;
String name,billAddr,itemstock,paymentStat,feedBack;
public void editAddress(String name,String billAddr)
{
this.name = name;
this.billAddr = billAddr;
System.out.println(name+", "+billAddr);
}
public void increaseStock(int a,int b,String s1,String s2)
{
int x = a+5;
int y = b+10;
System.out.println(s1+", "+x);
System.out.println(s2+", "+y);
}
public void displayProf(String name,long mobNo)
{
this.name = name;
this.mobNo = mobNo;
System.out.println(name+", "+mobNo);
}
}

