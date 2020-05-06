package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityClass {
public static WebDriver dr;
public static Actions a;
public static Robot r;
public static Alert w; 
public static Select s;
public static JavascriptExecutor js;

//1
public static void launchBrowser()
{
	WebDriverManager.chromedriver().setup();
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	dr =new ChromeDriver(options);
			
			
	
}
//2
public static void loadUrl(String url)
{
dr.get(url);
}
//3
public static void pageUrl() {
	String url = dr.getCurrentUrl();
	System.out.println(url);

}
//4
public static void pageTitle() {
	String title = dr.getTitle();
	System.out.println(title);

}
//5
public static void windowMax() {
	dr.manage().window().maximize();

}
//6
public static void quitBrowser() {
	
	dr.quit();

}
//7
public static void closeTab() {
	dr.close();

}

//8
public static void fill(WebElement e,String  s)
{
	e.sendKeys(s);

}
//9
public static void btnClick(WebElement e) {
	e.click();
}
//10
public static void getTextEntered(WebElement e) {
	String txt = e.getAttribute("value");
	System.out.println(txt);
}
//11
public static void getTheText(WebElement e) {
	String text = e.getText();
	System.out.println(text);
	
}
//actions
//12
public static void doubClick(WebElement e) {
	
	new Actions(dr).doubleClick(e).perform();
}
//13
public static void contextCl(WebElement e) {

	new Actions(dr).contextClick(e).perform();
}
//14
public static void moveElement(WebElement element) {
	new Actions(dr).moveToElement(element).click().perform();
	
}
//15
public static void drgAndDrp(WebElement s,WebElement d) {
	new Actions(dr).dragAndDrop(s, d).perform();
	

}
//robot
//16
public static void copy() throws AWTException {
	r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_C);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_C);

}
//17
public static void Enter() throws AWTException {
	r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	
	r.keyRelease(KeyEvent.VK_ENTER);
	
}

//Alert
//18
public static void confirmAlertOk() {
	w=dr.switchTo().alert();
	String text = w.getText();
	System.out.println(text);
	w.accept();
	
}

//19
public static void confirmAlertDismiss() {
	w=dr.switchTo().alert();
	w.dismiss();
	
}

//Select
//20
public static void selByIndex(WebElement e,int i) {
	new Select(e).selectByIndex(i);

}
//21
public static void isMultipleSelect(WebElement e) {
	boolean b= new Select(e).isMultiple();
	System.out.println(b);
	
}
//22
public static void gtOptions(WebElement e) {
	List<WebElement> li = new Select(e).getOptions();
	for (WebElement allValues: li) {
		String text = allValues.getText();
		System.out.println(text);
	}
	
}
//23
public static void SelByValue(WebElement e, String v) {

	new Select(e).selectByValue(v);

}
//24
public static void deSelects(WebElement e,int i) {
	new Select(e).deselectByIndex(i);

}
//25
public static void deselAll(WebElement e) {
	new Select(e).deselectAll();
}
//frames
//26
public static void frameWeb(WebElement e) {
	dr.switchTo().frame(e);

}
//27
public static void frameIndex(int i) {
	dr.switchTo().frame(i);

}
//28
public static void frameId(String id) {
	dr.switchTo().frame(id);

}
//29
public static void switchParent() {
	dr.switchTo().parentFrame();

}
//30
public static void switchDefault() {
	dr.switchTo().defaultContent();

}

//windowHandling
//31
public static void windowId() {
	String parWindow = dr.getWindowHandle();
	System.out.println(parWindow);
	Set<String> allWin = dr.getWindowHandles();
	System.out.println(allWin);
	for (String st : allWin) {
		if(!parWindow.equals(st))
		{
			dr.switchTo().window(st);
			System.out.println(st);
		}
		
	}
}
//jsexecutor
//32
public static void scrollDown(WebElement e)
{
	js=(JavascriptExecutor) dr;
	js.executeScript("arguments[0].scrollIntoView(true)",e);
}
//33
public static void scrollUp(WebElement e)
{
	js=(JavascriptExecutor) dr;
	js.executeScript("arguments[0].scrollIntoView(false)",e);
}
//34
public static  void display(WebElement e) {
	boolean b = e.isDisplayed();
	System.out.println(b);
	
}
//35
public static void enable(WebElement e) {
boolean b = e.isEnabled();	
System.out.println(b);
}
//36
public static void Selected(WebElement e) {
	boolean b = e.isSelected();
	System.out.println(b);
	
}
//37
public static void Sleeep(int time) throws InterruptedException {
	Thread.sleep(time);
}
//38
public static void selbyVisible(WebElement e,String m) {
	
new Select(e).selectByVisibleText(m);
}
//39
public static void getParId() {
	String text = dr.getWindowHandle();
	System.out.println(text);
}
//40
public static void getChildId() {
	Set<String> allId = dr.getWindowHandles();
	String parId = dr.getWindowHandle();
	for (String s : allId) {
		if(!(parId==s))
		{
			System.out.println(s);
		}
	}
}
//41
public static void proAlert(String m) {
 w = dr.switchTo().alert();
 System.out.println(w.getText());
 w.sendKeys(m);
 w.accept();

}
//42
public static void cut() throws AWTException {
	r=new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_X);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_X);

}
//43
public static void impWaitSec(int time) {
	dr.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

}
//44
public static void SetAttributeJs(WebElement element,String name) {
	JavascriptExecutor  js=(JavascriptExecutor) dr;
	js.executeScript("arguments[0].setAttribute('value','"+name+"')", element);

}
//45
public static void getAttributeJs(WebElement element) {
	JavascriptExecutor  js=(JavascriptExecutor) dr;
	String text= (String) js.executeScript("return arguments[0].getAttribute('value')", element);
	System.out.println(text);
	
	}
//46
public static void getOptionAll(WebElement  e) {
	List<WebElement> allOptions = new Select(e).getOptions();
	for (int i = 0; i <allOptions.size(); i++) {
		WebElement text = allOptions.get(i);
		System.out.println(text);
		
	}

	

}
//47
public static void getSelOption(WebElement  element) {
	List<WebElement> selOptions = new Select(element).getAllSelectedOptions();
	for (int i = 0; i < selOptions.size(); i++) {
		WebElement text = selOptions.get(i);
		System.out.println(text);
		
	}

}
//48
public static void getFirstOptionSel(WebElement element) {
	WebElement s = new Select(element).getFirstSelectedOption();
	String text = s.getText();
	System.out.println(text);

}
//49
public static void deSelectbyVal(WebElement element,String s1) {
	new Select(element).deselectByValue(s1);

}
//50
public static void deSelectbyVisible(WebElement e,String text) {
	new Select(e).deselectByVisibleText(text);
}
//51
public static void takeScreenShots(String path) throws IOException {
	TakesScreenshot tk=(TakesScreenshot) dr;
	File source = tk.getScreenshotAs(OutputType.FILE);
	File d=new File(path);
	FileUtils.copyFile(source, d);
	System.out.println("done");
	
}
//52 
public static void cssProperty(WebElement element,String val) {
	System.out.println(element.getCssValue(val));

}
//53
public static void cleartext(WebElement e) {
	e.clear();

}
//54
public static void navigateTo(String ulr) {
	dr.navigate().to(ulr);

}
//55
public static void refreshPage() {
dr.navigate().refresh();
}
//56
public static void backPage() {
	dr.navigate().back();

}

}


	









