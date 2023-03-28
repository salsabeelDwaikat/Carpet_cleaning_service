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
	
	/*|Steam Cleaning|50|
|stain removal|100|
|children safe cleaning|250|*/


	public Admin() {
		super();
		setType(0);
		Adminservice.service.add("Steam Cleaning");
		Adminservice.service.add("Stain removal");
		Adminservice.service.add("Children safe cleaning");
		Adminservice.price.add("50");
		Adminservice.price.add("100");
		Adminservice.price.add("250");
		
		
	}

	public Admin(String id, String nme ,String pass, String phne, String adres) {
		super(id,nme,pass,phne,adres);
		setType(0);
		
	}
	private void useless() {
		System.out.print("hi");
	}

	//run code 
	}
	
