package Code;

import java.util.ArrayList;

public class CustomerService {


	 static ArrayList<Product> snull=new ArrayList<Product>();
	 static ArrayList<Customer> customs= new ArrayList<Customer>();	
	

	public void checkCustomerLogin(String name,String pss) {
	for (int i=0; i<customs.size();i++)
	
		if(customs.get(i).getName().equalsIgnoreCase(name)&&customs.get(i).getPassword().equals(pss)) {

		customs.get(i).setLogin(true);
		}
	
	}
	
	public static void AddUsersFirstTime() {
		Customer c1=new Customer("144","aya","aya123","0598764123","Nablus,aldwar");
		Customer c2=new Customer("176","naser yonis","nas234","0563214698","Nablus,25th street");
		Customer c3=new Customer("123","leen ayman","leenay123","0593587456","rafidya street");
		Product p1= new Product("Carpet","wool","2m","3m","Stain removal");
		Product p2= new Product("Carpet","furr","4.5m","3.2m","children safe cleaning");
		Product p3= new Product("mattress","cotton","200cm","280cm","Stain removal");
		
		customs.add(c1);
		customs.add(c2);
		customs.add(c3);
		customs.get(0).List.add(p1);
		customs.get(1).List.add(p2);
		customs.get(2).List.add(p3);
		
	}
	
	public boolean checkLogin(String loginStatus) {

		for(int i=0;i<customs.size();i++)
		{
			if(customs.get(i).getName().equalsIgnoreCase(loginStatus))
				return true;
		}
		return false;

	}
	
	public static boolean UserList(String username, String type, String special) {
		int y=customerInt(username);
		
				for(int k=0;k<customs.get(y).List.size();k++) {
					if(customs.get(y).List.get(k).getProdType().equalsIgnoreCase(type)) {
					
						if(customs.get(y).List.get(k).getSpecialTreat().equalsIgnoreCase(special))
							return true;}
				}
      return false;
	}
	
	
	public static int customerInt(String username) {
int x = 0;

		for(int i=0;i<customs.size();i++) 
			if(customs.get(i).getName().equalsIgnoreCase(username)) {
			
				x=i;
				break;
			}
		return x;
	}
	
	public static void addnewProductofCustomer(String username, Product p) {
		int u=customerInt(username);
		customs.get(u).List.add(p);
			
	}

	
}

