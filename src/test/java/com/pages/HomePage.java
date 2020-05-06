package com.pages;

import java.util.List;

import org.baseclass.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends UtilityClass {
	public List<WebElement> getbLinks() {
		return bLinks;
	}
	public List<WebElement> getbImages() {
		return bImages;
	}
	public HomePage() {
		PageFactory.initElements(dr, this);
	}
	@FindBy(xpath="//div[@class='eg-close-step-1 eg-invisibleButton']")
	private WebElement btnClose;
	public WebElement getBtnClose() {
		return btnClose;
	}
	@FindBy(tagName="a")
	private List<WebElement> bLinks;
	@FindBy(tagName="img")
	private List<WebElement> bImages;

}
