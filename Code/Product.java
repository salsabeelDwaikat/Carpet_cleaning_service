package Code;
//import java.util.ArrayList;
public class Product {
	
	private String prodType;
	private String prodMat;
	private String height;
	private String width;
	private String specialTreat;
	private String handlingStatus;


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


	@Override
	public String toString() {
		return "Product [prodType=" + prodType + ", prodMat=" + prodMat + ", height=" + height + ", width=" + width
				+ ", specialTreat=" + specialTreat + ", handlingStatus=" + handlingStatus + "]";
	}


}