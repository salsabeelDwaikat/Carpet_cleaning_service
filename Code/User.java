package Code;
import java.util.ArrayList;

public class User {
	
	private String ID;
	private String name;
	private String phone;
	private String Address;
	private String password;
	private int Type;
	// if admin=0, if customer=1, if worker =2.
	private boolean login;
	static ArrayList<User> users= new ArrayList<User>();
	
	 User() {
		this.name="";
		this.ID="";
		this.phone="";
		this.password="";
		this.Address="";
		login=false;
	}
	User(String Id, String Nme, String pass, String phne,String adres){
		this.ID=Id;
		this.name=Nme;
		this.password=pass;
		this.phone=phne;
		this.Address=adres;
		this.login=false;	
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isLogin() {
		return login;
	}
	public void setLogin(boolean login) {
		this.login = login;
	}
	public int getType() {
		return Type;
	}
	public void setType(int type) {
		Type = type;
	}
	
	
	
	
	

}
