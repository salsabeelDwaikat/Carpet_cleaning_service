package Code;

//import java.util.ArrayList;

public class Product {
	
	private String prodType;
	private String prodMat;
	private String height;
	private String width;
	private String specialTreat;

	
	Product prod=new Product();
	
	public Product() {
		
	}
	public Product(String pType,String pMat,String h,String w) {
		this.prodType=pType;
		this.prodMat=pMat;
		this.height=h;
		this.width=w;
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


	
	

}
