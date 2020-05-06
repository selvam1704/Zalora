package com.pages;

public class PageObjectManager {
	LoginPage lPage;
	SearchPage sPage;
	ProductDetailsPage pPage;
	CartPage cPage;
	AddressPage aPage;
	PaymentPage pmPage;
	HomePage hPage;
	public LoginPage getLoginPage() {
		if (lPage == null) {
			lPage = new LoginPage();
		}
		return lPage;
	}

	public SearchPage getSearchpage() {
		if (sPage == null) {
			sPage = new SearchPage();
		}
		return sPage;
	}
	public ProductDetailsPage getProductPage() {
		if(pPage==null)
		{
			pPage=new ProductDetailsPage();
		}
		return pPage;
	}
	public CartPage getCartPage() {
		if(cPage==null)
		{
			cPage=new CartPage();
		}
		return cPage;
	}
	public AddressPage getAddressPage() {
		if(aPage==null)
		{
			aPage=new AddressPage();
		}
		return aPage;
	}
	public PaymentPage getPaymentPage() {
		if(pmPage==null)
		{
			pmPage=new PaymentPage();
		}
		return pmPage;
	}
	public HomePage getHomePage() {
		if(hPage==null)
		{
			hPage=new HomePage();
		}
		return hPage;
	}

}
