package Code;

import java.util.ArrayList;

public class Adminservice {

	static ArrayList<String> service=new ArrayList<String>();
	static ArrayList<String> price=new ArrayList<String>();
	static ArrayList<String>address= new ArrayList<String>();
	static ArrayList<String>addPrice= new ArrayList<String>();
	static private ArrayList<Admin> admn=new ArrayList<Admin>();
    static boolean valbol;
	
	
    public static void AddLocationNdPrice() {
    	address.add("Nablus aldwar");
    	address.add("Nablus,25th street");
    	address.add("rafidya street");
    	address.add("AlaaAldeen street");
    	address.add("almakhfi");
    	addPrice.add("20");
    	addPrice.add("25");
    	addPrice.add("15");
    	addPrice.add("10");
    	addPrice.add("20");
    	addPrice.add("12");
    }
    
    public static void Addelemnts() {
    	Adminservice.service.add("Steam Cleaning");
		Adminservice.service.add("Stain removal");
		Adminservice.service.add("Children safe cleaning");
		Adminservice.price.add("50");
		Adminservice.price.add("100");
		Adminservice.price.add("250");
		
    }

	/*public static boolean checkLogin(String u) {

		for(int i=0;i<admn.size();i++)
		{
			if(admn.get(i).getName().equalsIgnoreCase(u))
				return true;
		}
		return false;
	}*/

	public static void addServNDPric(String serv,String pric) {
		valbol=foundServ(serv);
		
			if(valbol==false) {
		           service.add(serv);
		           price.add(pric);
				}
			
			else {
				System.out.printf("service already exists, cannot be added");
	           }


	}
	public static boolean foundServ(String ser) {
	for (int i=0;i<service.size();i++) {
		if(ser.equalsIgnoreCase(service.get(i)))
			return true;
	}
	     return false;	

	}	
public static String deliveryAvaialble(String add) {
	for(int i=0;i<address.size();i++){
		if(address.get(i).equalsIgnoreCase(add)) {
			return addPrice.get(i);
		}
	}

	return null;
}


}