package com.pages;

import org.baseclass.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends UtilityClass {
	public CartPage() {
		PageFactory.initElements(dr,this);
	}
	@FindBy(xpath="//strong[contains(text(),'RM')]")
	private WebElement txtPrice;
	@FindBy(xpath="(//a[contains(text(),'Go to Checkout')])[2]")
	private WebElement btnCheckOut;
	public WebElement getTxtPrice() {
		return txtPrice;
	}
	public WebElement getBtnCheckOut() {
		return btnCheckOut;
	}

}
