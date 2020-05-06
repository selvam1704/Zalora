package com.pages;

import org.baseclass.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage extends UtilityClass{
	public ProductDetailsPage() {
		PageFactory.initElements(dr, this);
	}
	
	@FindBy(id="productSizeSelect")
	private WebElement selSize;
	@FindBy(id="AddToCart")
	private WebElement btnbag;
	@FindBy(id="shopping-bag-qty")
	private WebElement btnCart;
	
	public WebElement getSelSize() {
		return selSize;
	}
	public WebElement getBtnCart() {
		return btnCart;
	}
	public WebElement getBtnSize() {
		return selSize;
	}
	public WebElement getBtnbag() {
		return btnbag;
	}

}
