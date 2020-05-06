
package com.pages;

import org.baseclass.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends UtilityClass{
	public WebElement getBtnAccount() {
		return btnAccount;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public WebElement getTxtEmail() {
		return txtEmail;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getBtnLogIn1() {
		return btnLogIn1;
	}
	public LoginPage() {
PageFactory.initElements(dr, this);
	}

	@FindBy(xpath="//i[@class='js-seg-bar__account seg-bar__account icon_user']")
	private WebElement btnAccount;
	@FindBy(id="account-menu-login-btn")
	private WebElement btnLogin;
	@FindBy(id="LoginForm_email")
	private WebElement txtEmail;
	@FindBy(id="LoginForm_password")
	private WebElement txtPassword;
	@FindBy(xpath="(//button[@type='submit'])[3]")
	private WebElement btnLogIn1;
	@FindBy(className="zalora-logo zalora-logo--white pts")
	private WebElement logo;
	public WebElement getLogo() {
		return logo;
	}
	
}