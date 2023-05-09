package Code;
import java.util.ArrayList;


public class Customer extends User{
	static String nametemp;
	
	static ArrayList<Customer> customs= new ArrayList<Customer>();
	
	ArrayList<Product> List;

	public Customer() {
		super();
		List=new ArrayList<Product>();
	
	}

	public Customer(String id, String nme ,String pass, String phne, String adres) {
		super(id,nme,pass,phne,adres);
		setType(1);
		List=new ArrayList<Product>();
	}	

	public static void saveName(String username) {
		nametemp=username;
	}
	
	public static String returnName() {
		return nametemp;
	}
		
	}