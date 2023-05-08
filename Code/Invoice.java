package Code;

import java.util.ArrayList;

public class Invoice {
	static ArrayList<Product> p=new ArrayList<Product>();
	static String Price;
	static int x;
	static String Name;
	static int total=0;
	static String service;
	 static String delv;

public static int printInvoice(String username, int pnum,String addres) {
	Adminservice.Addelemnts();	
	delv=Adminservice.deliveryAvaialble(addres);
p=CustomerService.allprod(username);

System.out.println("              ****_____________________________________________________________________________________****    ");
for(int i=0; i<pnum;i++) {
	service=p.get(i).getSpecialTreat();
	Price=getPrice(service);
	System.out.println("      "+i+"   |   "+p.get(i)+"   | "+" Price"+Price+"\n");
	System.out.println(" ____________________________________________________________________________________________     ");
	total=total+Integer.parseInt(Price);

}

System.out.println("          ******* price of all added products= "+total+"***********    "+"\n");
if(delv!=null) {
	System.out.println("Price of Delivery"+delv+"\n");
	total=total+Integer.parseInt(delv);
	System.out.println("Total price including delivery"+total);
}
	
System.out.println("              ****_____________________________________________________________________________________****    ");
System.out.println("\n\n");
return total;
}

public static String getPrice(String serv) {
	
	for(int i=0;i<Adminservice.service.size();i++){
		if(Adminservice.service.get(i).equalsIgnoreCase(serv)) {
			return Adminservice.price.get(i);
			}
	}
	return "75";
}


}
