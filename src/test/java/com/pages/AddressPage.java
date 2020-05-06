package com.pages;

import org.baseclass.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage extends UtilityClass{
	public AddressPage() {
		PageFactory.initElements(dr,this);
	}
	@FindBy(xpath="//a[@class='js-add_address address__new-link']")
	private WebElement btnAddNew;
	public WebElement getBtnAddNew() {
		return btnAddNew;
	}
	
	@FindBy(id="AddressForm_first_name")
	private WebElement txtFirstName;
	@FindBy(id="AddressForm_last_name")
	private WebElement txtLastName;
	@FindBy(id="AddressForm_cell_phone")
	private WebElement txtPhoneNo;
	@FindBy(id="AddressForm_address1")
	private WebElement txtAddress1;
	@FindBy(id="AddressForm_address2")
	private WebElement txtAddress2;
	@FindBy(id="AddressForm_fk_customer_address_region")
	private WebElement selCity;
	@FindBy(id="AddressForm_city")
	private WebElement txtCity;
	@FindBy(id="AddressForm_postcode")
	private WebElement txtPostCode;
	@FindBy(xpath="(//button[contains(text(),'Save & Continue')])[3]")
	private WebElement btnSave;
	@FindBy(className="js-show_delete_address")
	private WebElement btnNewaddress;
	public WebElement getBtnNewaddress() {
		return btnNewaddress;
	}
	public WebElement getBtnSave() {
		return btnSave;
	}
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	public WebElement getTxtPhoneNo() {
		return txtPhoneNo;
	}
	public WebElement getTxtAddress1() {
		return txtAddress1;
	}
	public WebElement getTxtAddress2() {
		return txtAddress2;
	}
	public WebElement getSelCity() {
		return selCity;
	}
	public WebElement getTxtCity() {
		return txtCity;
	}
	public WebElement getTxtPostCode() {
		return txtPostCode;
	}
	
	
	
}
