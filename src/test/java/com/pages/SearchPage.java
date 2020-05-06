package com.pages;

import java.util.List;

import org.baseclass.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends UtilityClass{
	public SearchPage() {
PageFactory.initElements(dr, this);
	}
	@FindBy(name="q")
	private WebElement txtSearch;
	@FindBy(xpath="//a[@class='b-catalogList__itmLink itm-link']")
	private List<WebElement> listProduct;
	public WebElement getBtnSearch() {
		return btnSearch;
	}
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement btnSearch;
	public WebElement getTxtSearch() {
		return txtSearch;
	}
	public List<WebElement> getListProduct() {
		return listProduct;
	}

}
