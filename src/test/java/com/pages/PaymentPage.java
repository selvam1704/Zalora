package com.pages;

import java.util.List;

import org.baseclass.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends UtilityClass {
	public PaymentPage() {
		PageFactory.initElements(dr, this);
	}
@FindBy(xpath="//div[@class='sidebar__tab__content box ']//a")
private List<WebElement> paymentOptions;

public List<WebElement> getPaymentOptions() {
	return paymentOptions;
}
}
