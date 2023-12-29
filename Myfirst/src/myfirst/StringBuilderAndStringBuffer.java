package myfirst;

class Mobile{
	String brand;
	int price;
	static String name;
	
	public void show() {
		System.out.println(brand+" : "+price+ " : "+name);
		
	}
	
	
	public class StringBuilderAndStringBuffer {

		public static void main(String[] args) {
			
			String name="Akhil";
			
			StringBuffer str=new StringBuffer("Akhil");
			
			str.append(" Varma");
			
			System.out.println(str);
			
			System.out.println(str.length());
			
			String str1=str.toString();
			
			Mobile mob1=new Mobile();
			
			Mobile mob2=new Mobile();
			
			mob1.brand="apple";
			mob1.price=1500;
			mob1.name="iphone";
			
			
			mob2.brand="samsung";
			mob2.price=1700;
			mob2.name="note";
			Mobile.name="smart phone";
			
			
			mob1.show();
			mob2.show();
			

		}

	}
	




//static {
//	String name="Smart Phone";
//	System.out.println("in static");
//}







//public Mobile() {
//	String brand="";
//	int price=200;
//	System.out.println("In constructor");
//}
}