package Code;

import java.util.ArrayList;
import java.util.Scanner;

//import java.util.ArrayList;
public class Product {
	
	private String prodType;
	private String prodMat;
	private String height;
	private String width;
	private String specialTreat;
	private String handlingStatus;
	static int prodnumber=0;
	static int valupdate=0;
	static String tempName;
	static String updated;
	static private ArrayList<Product> prodArr=new ArrayList<Product>();
	static Scanner s=new Scanner(System.in);


	public Product(String pType,String pMat,String h,String w,String specialtreat) {
		this.prodType=pType;
		this.prodMat=pMat;
		this.height=h;
		this.width=w;
		this.specialTreat=specialtreat;
		this.handlingStatus="waiting";
		//this.specialTreat=st;
	}

  
	public String getProdType() {
		return prodType;
	}
	public void setProdType(String prodType) {
		this.prodType = prodType;
	}
	public String getProdMat() {
		return prodMat;
	}
	public void setProdMat(String prodMat) {
		this.prodMat = prodMat;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public String getSpecialTreat() {
		return specialTreat;
	}
	public void setSpecialTreat(String specialTreat) {
		this.specialTreat = specialTreat;
	}
	public String getHandlingStatus() {
		return handlingStatus;
	}
	public void setHandlingStatus(String handlingStatus) {
		this.handlingStatus = handlingStatus;
	}
	
	public static void printList(String username) {
		prodArr=CustomerService.allprod(username);
		int x;
		for(int i=0;i<prodArr.size();i++) {
			x=i+1;
			System.out.println(x +"  "+ prodArr.get(i)+"\n");
		}
	}
		
	
	public static int updateOptions() {
		System.out.println("\n\n\n\n");
		System.out.println(" enter 1 if you want to update the Product Type\n");
		System.out.println(" enter 2 if you want to update the Product Material\n");
		System.out.println(" enter 3 if you want to update the Product Height\n");
		System.out.println(" enter 4 if you want to update the Product Width\n");
		System.out.println(" enter 5 if you want to update the Product Special Treatment\n");
		System.out.println("\n");
		valupdate=s.nextInt();
		return valupdate;
	}

	
	public static String updatedValue() {
     System.out.println(" please enter the updated value \n");
		
		String updates=s.nextLine();
		return updates;
		
	}
	
	public static boolean updateProduct() { 
	   boolean states=false;
		int upd=updateOptions();
		s.nextLine();
		updated=updatedValue();
		states=updatedinfromation(prodnumber,upd,updated);
		updatedinfromation(prodnumber,upd,updated);
		return states;
	}
	
	
	public static ArrayList<Product> updatedListReturn(){
		return prodArr;
	}
	
	
	
	public static int getProductNumberFromUser() {
		printList(tempName);
		System.out.println(" please enter the product number from the list of products shown\n");
		prodnumber=s.nextInt();
		return prodnumber;
	}
	
	public static boolean isProductFound(String username) {
		boolean value=false;
		tempName=username;
		prodnumber=getProductNumberFromUser();
		int x= prodArr.size()+1;
		
		if(prodnumber>0 && prodnumber<=x) {
			value=true;
		}
		else {
			System.out.println("thats not a valid value\n");

		}
	
		return value;
	}
	
	public static boolean updatedinfromation(int i, int upd, String updated) {
	    boolean statement = false;
	    int index = i - 1;
	    
	    if (upd == 1) {
	        prodArr.get(index).setProdType(updated);
	        statement = true;
	        System.out.println("Updated product information: " + prodArr.get(index));
	    } else if (upd == 2) {
	        prodArr.get(index).setProdMat(updated);
	        statement = true;
	        System.out.println("Updated product information: " + prodArr.get(index));
	    } else if (upd == 3) {
	        prodArr.get(index).setHeight(updated);
	        statement = true;
	        System.out.println("Updated product information: " + prodArr.get(index));
	    } else if (upd == 4) {
	        prodArr.get(index).setWidth(updated);
	        statement = true;
	        System.out.println("Updated product information: " + prodArr.get(index));
	    } else if (upd == 5) {
	        prodArr.get(index).setSpecialTreat(updated);
	        statement = true;
	        System.out.println("Updated product information: " + prodArr.get(index));
	    }

	    return statement;
	}



	@Override
	public String toString() {
		return "prodType=" + prodType + ", prodMat=" + prodMat + ", height=" + height + ", width=" + width
				+ ", specialTreat=" + specialTreat + ", handlingStatus=" + handlingStatus;
	}


}