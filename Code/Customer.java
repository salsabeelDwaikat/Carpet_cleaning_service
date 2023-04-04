package Code;
import java.util.ArrayList;


public class Customer extends User{
	
	
	static ArrayList<Customer> customs= new ArrayList<Customer>();
	
	ArrayList<Product> List;

	public Customer() {
		super();
	
	}

	public Customer(String id, String nme ,String pass, String phne, String adres) {
		super(id,nme,pass,phne,adres);
		setType(1);
		List=new ArrayList<Product>();
	}	

	
		
	}