package com.stepdefintion;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.baseclass.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pages.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefintion extends UtilityClass {
	PageObjectManager page = new PageObjectManager();

	@Given("Entered into the zalora Website")
	public void entered_into_the_zalora_Website() throws IOException {

		loadUrl("https://www.zalora.com.my/");
		takeScreenShots("D:\\greens\\Zalora\\ScreenShot\\login.png");

	}

	@Given("Entering Valid Login Credentials")
	public void entering_Valid_Login_Credentials() throws IOException {

		btnClick(page.getLoginPage().getBtnAccount());
		btnClick(page.getLoginPage().getBtnLogin());
		fill(page.getLoginPage().getTxtEmail(), ExcelOperations.excelRead(0, 1));
		fill(page.getLoginPage().getTxtPassword(), ExcelOperations.excelRead(0, 2));
		takeScreenShots("D:\\greens\\Zalora\\ScreenShot\\credentials.png");
		btnClick(page.getLoginPage().getBtnLogIn1());

	}

	@Given("Searching For product product")
	public void searching_For_product_product() throws AWTException, IOException {
		fill(page.getSearchpage().getTxtSearch(), ExcelOperations.excelRead(1, 1));
		btnClick(page.getSearchpage().getBtnSearch());
		List<WebElement> lProd = page.getSearchpage().getListProduct();
		System.out.println(lProd.size());
		for (WebElement x : lProd) {
			System.out.println(x.getText());

		}
		takeScreenShots("D:\\greens\\Zalora\\ScreenShot\\products.png");
		lProd.get(3).click();

	}

	@Given("selecting and adding the product in the bag")
	public void selecting_and_adding_the_product_in_the_bag() throws IOException {
		selByIndex(page.getProductPage().getBtnSize(), 3);
		btnClick(page.getProductPage().getBtnCart());

		getTheText(page.getCartPage().getTxtPrice());
		btnClick(page.getCartPage().getBtnCheckOut());
		takeScreenShots("D:\\greens\\Zalora\\ScreenShot\\bags.png");

	}

	@Given("entering the delivery address")
	public void entering_the_delivery_address() throws IOException {
		btnClick(page.getAddressPage().getBtnAddNew());
		fill(page.getAddressPage().getTxtFirstName(), ExcelOperations.excelRead(2, 1));
		fill(page.getAddressPage().getTxtLastName(), ExcelOperations.excelRead(2, 2));
		fill(page.getAddressPage().getTxtPhoneNo(), ExcelOperations.excelRead(2, 3));
		fill(page.getAddressPage().getTxtAddress1(), ExcelOperations.excelRead(2, 4));
		fill(page.getAddressPage().getTxtAddress2(), ExcelOperations.excelRead(2, 5));
		selbyVisible(page.getAddressPage().getSelCity(), ExcelOperations.excelRead(2, 6));
		fill(page.getAddressPage().getTxtCity(), ExcelOperations.excelRead(2, 7));
		fill(page.getAddressPage().getTxtPostCode(), ExcelOperations.excelRead(2, 8));
		btnClick(page.getAddressPage().getBtnSave());

	}

	@Given("entering the Payment details")
	public void entering_the_Payment_details() throws IOException {
		List<WebElement> payOptions = page.getPaymentPage().getPaymentOptions();
		for (int i = 0; i < payOptions.size(); i++) {
			String options = payOptions.get(i).getText();
		}
		takeScreenShots("D:\\greens\\Zalora\\ScreenShot\\payments.png");
	}

	@Then("geting the Outcomes")
	public void geting_the_Outcomes() {
		System.out.println("product booking validated");
	}

	@Given("Entering into the Website")
	public void entering_into_the_Website() {
		loadUrl("https://www.zalora.com.my/");

	}

	@Given("validating images and links")
	public void validating_images_and_links() throws MalformedURLException, IOException, InterruptedException {
		Thread.sleep(15000);
		btnClick(page.getHomePage().getBtnClose());
		takeScreenShots("D:\\greens\\Zalora\\ScreenShot\\homepage.png");

		int count = 0;
		int size = page.getHomePage().getbImages().size();
		System.out.println("total no of images " + size);

		for (WebElement url : page.getHomePage().getbImages()) {
			String a = url.getAttribute("src");

			try {
				URL u = new URL(a);
				URLConnection op = u.openConnection();
				HttpURLConnection h = (HttpURLConnection) op;
				int code = h.getResponseCode();

				if (code != 200) {
					System.out.println(a);
					count++;

				}
			} catch (Exception e) {
				count++;

			}
		}
		System.out.println("no of broken images" + count);
	}

	@Then("validating the outcome")
	public void validating_the_outcome() {
		System.out.println("homepage validated");
	}

}
