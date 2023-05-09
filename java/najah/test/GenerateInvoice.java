package najah.test;

import java.util.ArrayList;
import java.util.Scanner;
import Code.CustomerService;
import Code.Product;
import io.cucumber.java.en.*;
import Code.Adminservice;
import Code.Customer;
import Code.Invoice;

public class GenerateInvoice {
	String username;
	static Scanner s = new Scanner(System.in);
	String answer;
	int prodNumber;
	String Address;
	String Price;
	
	@Given("that the customer {string} is logged in")
	public void thatTheCustomerIsLoggedIn(String string) {
     Adminservice.AddLocationNdPrice();
     Adminservice.Addelemnts();
     
	}
	@Given("{string} requests to generate an invoice")
	public void requestsToGenerateAnInvoice(String string) {
		System.out.println("          \n");
	    System.out.println("do you want to generate invoice?\n");
	    answer=s.nextLine();
		
	}
	@When("{string} has at least one product added in her cart")
	public void hasAtLeastOneProductAddedInHerCart(String string) {
		
	   if(answer.equalsIgnoreCase("yes")) 
		   
	    username=Customer.returnName();
		 prodNumber=CustomerService.pList(username);

	}
	@When("address is {string}")
	public void addressIs(String string) {
		Address=CustomerService.userAddress(username);

	   
	}
	@When("delivery is available to that area at price {string}")
	public void deliveryIsAvailableToThatAreaAtPrice(String string) {
		Price=Adminservice.deliveryAvaialble(Address);

	   
	}
	@Then("the invoice is generated")
	public void theInvoiceIsGenerated() {
		if(prodNumber>0)
			if(Price!=null) {
				Invoice.printInvoice(username,prodNumber,Address);
			}
		

	
	
	}
	
	@Given("customer {string} has logged in")
	public void customerHasLoggedIn(String string) {
	   
	}
	@Given("{string} wants generate an invoice")
	public void wantsGenerateAnInvoice(String string) {
	    
	}
	@When("{string} has one or more product added in cart")
	public void hasOneOrMoreProductAddedInCart(String string) {
	   
	}
	@When("and the address is {string}")
	public void andTheAddressIs(String string) {
	 
	}
	@When("delivery is not available to that area")
	public void deliveryIsNotAvailableToThatArea() {
	  
	}
	@Then("the invoice is not generated")
	public void theInvoiceIsNotGenerated() {
	
	}

	
	
	
}	

	
	