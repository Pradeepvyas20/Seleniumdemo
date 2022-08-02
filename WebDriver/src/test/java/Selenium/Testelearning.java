package Selenium;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WindowType;

public class Testelearning 
{
	WebDriver driver; 
  @BeforeTest
  public void beforeTest() 
  {
	    WebDriverManager.chromedriver().setup();
	 	driver=new ChromeDriver();
	 	driver.get("https://www.google.com");
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.get("http://elearningm1.upskills.in/");
	 	//driver.get("https://demoqa.com/upload-download");
	 	//driver.get("https://demoqa.com/alerts");
	 	//driver.get("file:///C:/Users/Pradeep/Downloads/janki2.html");
	 	//driver.get("https://demoqa.com/webtables");
	 	//driver.get("https://demoqa.com/buttons");
	 	//driver.get("https://demoqa.com/browser-windows");
	 	
	 	
	 	//driver.get("file:///C:/Users/Pradeep/Downloads/table.html");
	 	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 	//driver.navigate().to("https://www.google.com"); 
		driver.manage().window().maximize();	  
	  
  }
  
  @Test(enabled=false)
  public void f() throws InterruptedException 
  {
	  
	    driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("Pradeep_20");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Pradeep123");
		driver.findElement(By.xpath("//*[@name='submitAuth']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Compose")).click();
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).click();
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("krankgowda0495@gmail.com");
		driver.findElement(By.xpath("//*[@name='title']")).sendKeys("working on E-learning");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).click(); 
		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys("Hello"+Keys.ENTER+"i am Pradeep"
		+Keys.ENTER+Keys.ENTER+"Thanks & regards"+Keys.ENTER+"Pradeep vyas");
		/*driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys("i am Pradeep");
		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys("Thanks & regards");
		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div/iframe[@class='cke_wysiwyg_frame cke_reset']")).sendKeys("Pradeep Vyas");*/
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='file-descrtiption']")).sendKeys("Introduction");
		driver.findElement(By.xpath("//*[@name='compose']")).click();
		driver.findElement(By.linkText("Logout")).click();	
		
  }
@Test(enabled=false)
public void testcase2() throws InterruptedException, AWTException
{
	/* driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	 driver.findElement(By.id("btnLogin")).click();
	 Thread.sleep(3000);
	 
	 List<WebElement> link= driver.findElements(By.tagName("a"));
	 System.out.println("Total numbers of link  "+link.size());
	
	 for(int i=0;i<link.size();i++)
		{
				System.out.println(link.get(i).getText());
			
}
	 for(WebElement e:link)
	 {
	 String eachlink =e.getText();
	 System.out.println(eachlink);
	 
	 }
	 
	 driver.findElement(By.partialLinkText("welcome"));
	 Thread.sleep(3000);
	 driver.findElement(By.linkText("Logout")).click(); 
	 
	 driver.findElement(By.linkText("PIM")).click();
	 driver.navigate().back();
	 driver.navigate().forward();
	 driver.navigate().refresh();
	 driver.navigate().to("https//:www.google.com"); 
	 driver.findElement(By.linkText("PIM")).click();
	 
	 Actions act =new Actions(driver);
	 WebElement cllink = driver.findElement(By.linkText("Configuration"));
	 act.moveToElement(cllink).build().perform();
	 act.sendKeys(Keys.ARROW_DOWN).build().perform();
	 act.sendKeys(Keys.ARROW_DOWN).build().perform();
	 act.sendKeys(Keys.ARROW_DOWN).build().perform();
	 act.sendKeys(Keys.ENTER).build().perform();
	 
	 Actions act =new Actions(driver);
	 act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).build().perform();*/
	 
	 WebElement Link = driver.findElement(By.linkText("Gmail"));
	 Thread.sleep(3000);
	 Actions act =new Actions(driver);
	 act.contextClick(Link).build().perform();
	 //act.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).build().perform();
	 Robot rbt = new Robot();
	 rbt.keyPress(KeyEvent.VK_DOWN);
	 rbt.keyPress(KeyEvent.VK_DOWN);
	 Thread.sleep(2000);
	 rbt.keyPress(KeyEvent.VK_UP);
	 rbt.keyPress(KeyEvent.VK_ENTER);
	 Thread.sleep(3000);
	 String Title=driver.getTitle();
	 System.out.println(Title);
	
	/* act.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
	 String Title=driver.getTitle();
	 System.out.println(Title);
	 act.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
	 String Title1=driver.getTitle();
	 System.out.println(Title1);
	 act.sendKeys(Keys.chord(Keys.CONTROL,Keys.TAB)).build().perform();*/
	 
	 rbt.keyPress(KeyEvent.VK_CONTROL);
	 rbt.keyPress(KeyEvent.VK_TAB);
	 
}


@Test(enabled=false)
public void testcase1 () throws InterruptedException
{
	
	driver.findElement(By.id("alertButton")).click();
	  Alert alt = driver.switchTo().alert();
	  System.out.println(alt.getText());
	 // Thread.sleep(3000);
	  alt.accept();
	  
	  driver.findElement(By.id("timerAlertButton")).click();
	  WebDriverWait wt = new WebDriverWait(driver, 180);
	  wt.until(ExpectedConditions.alertIsPresent());
	  alt.accept();
	  
	  driver.findElement(By.id("confirmButton")).click();
	  //Thread.sleep(5000);
	  alt.dismiss();
	  Thread.sleep(3000);
	 /* driver.findElement(By.id("promtButton")).click();
	  Thread.sleep(3000);
	  alt.sendKeys("Pradeep");
	  Thread.sleep(3000);
	  System.out.println(alt.getText());
	  alt.accept();*/
	  driver.findElement(By.id("timerAlertButton")).click();
	  Thread.sleep(7000);
	  alt.accept();
	  Thread.sleep(3000);
	  driver.findElement(By.id("promtButton")).click();
	  Thread.sleep(3000);
	  alt.sendKeys("Pradeep");
	  Thread.sleep(3000);
	  System.out.println(alt.getText());
	  alt.accept();
	 
	
	
}

 @Test(enabled=false)
 public void testcase3()
 {
	 
	 //driver.findElement(By.xpath("//tbody/tr[2]/td[1]"));
	 //System.out.println(pv);
	//String pv =driver.findElement(By.xpath("*//*[contains(text(),'Abhi')]/following-sibling::td[3]")).getText();
	//System.out.println(pv);
	 
	 //li[@class='sreading']/following-sibling::li[4]
	 String pv=driver.findElement(By.xpath("//*[@class='ReactTable -striped -highlight']")).getText();
	 System.out.println(pv);
	 driver.findElement(By.xpath("*//*[contains(text(),'Cierra')]//following-sibling::div[6]/div/span[2]")).click();
	 String del=driver.findElement(By.xpath("//*[@class='ReactTable -striped -highlight']")).getText();
	 System.out.println(del);
	
	 
	 
 }
 
 @Test(enabled=false)
 public void testcase4() throws InterruptedException
 {
	 WebElement dc = driver.findElement(By.id("doubleClickBtn"));
	  Actions act = new Actions(driver);
	  act.moveToElement(dc).doubleClick().build().perform();
	  
	  WebElement rclick = driver.findElement(By.id("rightClickBtn"));
	  act.contextClick(rclick).build().perform();
	  
	  String dynamicid = driver.findElement(By.xpath("//*[text()='Click Me']")).getAttribute("id");
	  System.out.println(dynamicid);
	  driver.navigate().refresh();
	  Thread.sleep(3000);
	  String dynamicid1 = driver.findElement(By.xpath("//*[text()='Click Me']")).getAttribute("id");
	  System.out.println(dynamicid1);
 }
 
 @Test(enabled=false)
 public void testcase5() throws InterruptedException
 {
	String parentwindow= driver.getWindowHandle();
	System.out.println(parentwindow);
	WebElement winbtn= driver.findElement(By.id("windowButton"));
	for (int i=0;i<3;i++)
	{
		winbtn.click();
	}
	Set<String> allwindow=driver.getWindowHandles();
	System.out.println(allwindow.size());
	
	String lastwindow="";
	
	for(String handle:allwindow)
	{
		System.out.println("I want to opme google.com in all windows");
		driver.switchTo().window(handle);
		 driver.get("https://www.google.com");
		 lastwindow=handle;
	}
	Thread.sleep(3000);
	driver.switchTo().window(parentwindow);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.close();
	driver.switchTo().window(lastwindow);
	driver.get("https://www.gmail.com");
	//driver.quit();
	
	}
	 
 
 @Test(enabled=false)
 public void testcase6() throws InterruptedException
 {
	 JavascriptExecutor	js=( JavascriptExecutor)driver;
	 String title=js.executeScript("return document.title").toString();
	 System.out.println(title);
	 
	 String url=js.executeScript("return document.URL").toString();
	 System.out.println(url);
	 
	 String domain=js.executeScript("return document.domain").toString();
	 System.out.println(domain);
	 String alltext=js.executeScript("return document.documentElement.innerText").toString();
	 System.out.println(alltext);
 }
 
 @Test(enabled=false)
 public void testcase7() throws InterruptedException
 {
	
	 JavascriptExecutor	js=( JavascriptExecutor)driver;
	 String title=js.executeScript("return document.title").toString();
	 System.out.println(title);
	 
	 String url=js.executeScript("return document.URL").toString();
	 System.out.println(url);
	 
	 String domain=js.executeScript("return document.domain").toString();
	 System.out.println(domain);
	 String alltext=js.executeScript("return document.documentElement.innerText").toString();
	 System.out.println(alltext);
	 
	 
	 
	 String parenttab=driver.getWindowHandle();
	  System.out.println(parenttab);
	 WebDriver newtab = driver.switchTo().newWindow(WindowType.TAB);
	 newtab.get("https://f1.com");
	  Thread.sleep(3000);
	//  driver.navigate().back();
	  ///declare parent tab
	  Set<String> alltab = driver.getWindowHandles();
	  Object [] altab= alltab.toArray();
	 
	  System.out.println(alltab.size());
	//  driver.switchTo().window(parenttab);
	// driver.get("https://google.com");
	  driver.switchTo().window((String) altab[0]);
	  driver.close();
	  driver.switchTo().window((String)altab[1]);
	  driver.get("https://www.google.com");
	 /* Thread.sleep(3000);
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.id("btnLogin")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("PIM")).click();
		 driver.findElement(By.linkText("Employee List")).click();
		//scrollIntoView()
		  //this method will help me to scroll a specific element
		 js.executeScript("document.getElementById('ohrmList_chkSelectRecord_29').scrollIntoView()");*/
	  
		 
		 
		 
	 
	  driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Moolya",Keys.ENTER);
	//  Actions alt= new Actions(driver);
	 // alt.sendKeys(Keys.PAGE_DOWN).build().perform();
//	  js.executeScript("window.scrollBy(0,600)");
	  //if you want to scroll to the end of the page, then you can use document.body.scrollHeight
	 
	  //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	  Thread.sleep(3000);
	  //I want to scroll up, if I want to scroll all the way up then I use -
	  //js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	 // Thread.sleep(3000);
     js.executeScript("document.getElementsByClassName('LC20lb MBeuO DKV0Md')[4].scrollIntoView()");
	  Thread.sleep(3000);
	 driver.findElement(By.partialLinkText("Moolya Software Testing Reviews by 48 Employees")).click();
	
	  
	  
 }
 
 @Test
 public void ganguly() throws InterruptedException
 {
	 JavascriptExecutor	js=( JavascriptExecutor)driver;
	 
	 driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cricinfo",Keys.ENTER);
	 Thread.sleep(3000);
	 driver.findElement(By.partialLinkText("Live cricket scores, match schedules, latest cricket news ...")).click();
	 driver.findElement(By.partialLinkText("Teams")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.linkText("India")).click();
	 Thread.sleep(2000);
	 js.executeScript("document.getElementsByClassName('ds-flex ds-flex-row ds-space-x-4')[0].scrollIntoView()");
	 Thread.sleep(4000);
	 driver.findElement(By.partialLinkText("Ganguly, Morgan, Muralidaran, Misbah, Johnson among 53 players in Legends League Cricket")).click();
	 
	 
 }
 
 
 

@AfterTest
  public void afterTest()
  {
	 driver.close();
  }

}
