package Code;
import java.util.ArrayList;


public class Customer extends User{
	
	
	static ArrayList<Customer> customs= new ArrayList<Customer>();
	
	ArrayList<Product> List;

	public Customer() {
		super();
		/*setType(1);
		List=new ArrayList<Product>();
		Customer c1=new Customer("144","aya","aya123","0598764123","Nablus,aldwar");
		Customer c2=new Customer("176","naser yonis","nas234","0563214698","Nablus,25th street");
		Customer c3=new Customer("123","leen ayman","leenay123","0593587456","rafidya street");
		Product p1= new Product("Carpet","wool","2m","3m","Stain removal");
		Product p2= new Product("Carpet","furr","4.5m","3.2m","children safe cleaning");
		Product p3= new Product("mattress","cotton","200cm","280cm","Stain removal");
		customs.add(c1);
		customs.add(c2);
		customs.add(c3);
		c1.List.add(p1);
		c1.List.add(p2);
		c1.List.add(p3);
	    c2.List.add(p1);
	    c2.List.add(p2);
	    c2.List.add(p3);
		c3.List.add(p1);
		c1.List.add(p2);
		c1.List.add(p3);
		*/
	}

	public Customer(String id, String nme ,String pass, String phne, String adres) {
		super(id,nme,pass,phne,adres);
		setType(1);
		List=new ArrayList<Product>();
	}	

	
		
	}