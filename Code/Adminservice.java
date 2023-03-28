package Code;

import java.util.ArrayList;

public class Adminservice {
	
	static ArrayList<String> service=new ArrayList<String>();
	static ArrayList<String> price=new ArrayList<String>();
	 static private ArrayList<Admin> admn=new ArrayList<Admin>();


	
	public static boolean checkLogin(String u) {

		for(int i=0;i<admn.size();i++)
		{
			if(admn.get(i).getName().equalsIgnoreCase(u))
				return true;
		}
		return false;
	}
	
	public static void addServNDPric(String serv,String pric) {
		for (int i=0;i<service.size();i++) 
			if(serv.equalsIgnoreCase(service.get(i)))
				System.out.printf("service already exists");
			else {
	           service.add(serv);
	           price.add(pric);
	           }
		
			
	}
	public static boolean foundServ(String ser) {
	for (int i=0;i<service.size();i++) {
		if(ser.equalsIgnoreCase(service.get(i)))
			return true;
	}
	     return false;	
	
	}	
	
	
	
	
}

