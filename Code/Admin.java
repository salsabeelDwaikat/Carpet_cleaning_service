package Code;

import java.util.ArrayList;

//import java.util.ArrayList;

public class Admin extends User {
	//private String id;
	//private String password;
	//private String name;
	//private String phone;
	//private String 
	//private boolean login;
	

	
	
	static ArrayList<String> service=new ArrayList<String>();
	static ArrayList<String> price=new ArrayList<String>();
	

	public Admin() {
		super();
		setType(0);
	}

	public Admin(String id, String nme ,String pass, String phne, String adres) {
		super(id,nme,pass,phne,adres);
		setType(0);
		
	}
	private ArrayList<Admin> admn=new ArrayList<Admin>();

	public static ArrayList<String> getService() {
		return service;
	}

	public static void setService(ArrayList<String> service) {
		Admin.service = service;
	}

	public static ArrayList<String> getPrice() {
		return price;
	}

	public static void setPrice(ArrayList<String> price) {
		Admin.price = price;
	}	
	
	public boolean checkLogin(String u) {

		for(int i=0;i<admn.size();i++)
		{
			if(admn.get(i).getName().equalsIgnoreCase(u))
				return true;
		}
		return false;
	}
	
	public static void addServNDPric(String serv,String pric) {
		for (int i=0;i<service.size();i++) 
			if(serv.equals(service.get(i)))
				System.out.printf("service already exists");
			else {
	           service.add(serv);
	           price.add(pric);
	           }
		
			
	}
	public boolean foundServ(String ser) {
	for (int i=0;i<service.size();i++) {
		if(ser.equals(service.get(i)))
			return true;
	}
	     return false;	
	
	}	
	}
	
