package Code;
import java.util.ArrayList;


public class Customer extends User{
	
	
	ArrayList<Customer> customs= new ArrayList<Customer>();
	
	ArrayList<Product> List;

	public Customer() {
		super();
		setType(1);
		List=new ArrayList<Product>();
		
	}

	Customer(String id, String nme ,String pass, String phne, String adres) {
		super(id,nme,pass,phne,adres);
		setType(1);
		List=new ArrayList<Product>();
	}	

	
	public void checkCustomerLogin(String name,String pss) {
	for (int i=0; i<customs.size();i++)
	
		if(customs.get(i).getName().equalsIgnoreCase(name)&&customs.get(i).getPassword().equals(pss)) {

		customs.get(i).setLogin(true);
		}
	
	}
	
	
	public void AddUsersFirstTime() {
		Customer c1=new Customer("144","aya","aya123","0598764123","Nablus,aldwar");
		Customer c2=new Customer("176","naser yonis","nas234","0563214698","Nablus,25th street");
		Customer c3=new Customer("123","leen ayman","leenay123","0593587456","rafidya street");
		
		customs.add(c1);
		customs.add(c2);
		customs.add(c3);
	}
	
		
	}
	

