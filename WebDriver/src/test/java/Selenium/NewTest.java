package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {

	WebDriver driver;
	 @BeforeTest
	  public void beforeTest()
	 {
		 	WebDriverManager.chromedriver().setup();
		 	driver=new ChromeDriver();
			//driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.get("https://demo.guru99.com/test/newtours/");
			/*String Title=driver.getTitle();
			String Url=driver.getCurrentUrl();
			System.out.println(Title+"  "+Url);
			Assert.assertEquals(Title,"OrangeHRM");
			Assert.assertEquals(Url,"https://opensource-demo.orangehrmlive.com/");*/
	  }
	@Test(enabled=false)
public void f() throws InterruptedException


{
		driver.manage().window().maximize();
		String Title=driver.getTitle();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		String username=driver.findElement(By.id("txtUsername")).getAttribute("value");
		System.out.println(username);
		Assert.assertEquals(username,"Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		String password=driver.findElement(By.id("txtPassword")).getAttribute("value");
		System.out.println(password);
		Assert.assertEquals(password,"admin123");
		//Assert.assertEquals("admin123","admin123");
		String login=driver.findElement(By.id("btnLogin")).getAttribute("value");
		System.out.println(login);
		driver.findElement(By.id("btnLogin")).click();
		//Assert.assertEquals(login,"LOGIN");
		Thread.sleep(3000);
		
		String Title1=driver.getTitle();
		if (Title.equalsIgnoreCase(Title1)) {
			driver.findElement(By.id("welcome")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
		}
		else {
			System.out.println("It is not same");
		}
		/*driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
		System.out.println("Hi add someone");
		*/
}
 
	
	@Test()
	public void testcase1()
	{

		WebElement UN = driver.findElement(By.xpath("//*[@name='userName']"));
		if(UN.isEnabled()) {
		
			UN.clear();
			UN.sendKeys("pradeep");
		}
		if(UN.isDisplayed())
		{
			System.out.println(UN.getAttribute("value"));
		}
		else {
			System.out.println("Username textbox is Disabled");
		}
		WebElement PWD = driver.findElement(By.xpath("//*[@name='password']"));
	
		if(PWD.isEnabled()) {
	
			PWD.clear();
			PWD.sendKeys("pradeep123");
		}
		if(PWD.isDisplayed())
		{
			System.out.println(PWD.getAttribute("value"));
		}
		else {
			System.out.println("password textbox is Disabled");
		}
		driver.findElement(By.xpath("//*[@name='submit']")).click();
		
	
	}
    @Test(enabled=false)
	public void testcase2() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("pradeep");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("pradeep123");
		driver.findElement(By.xpath("//*[@name='submit']")).click();
		String hd=driver.findElement(By.xpath("//tbody/tr/td/h3")).getText();
		Assert.assertEquals(hd,"Login Successfully");
		
		driver.findElement(By.linkText("Flights")).click();
		//driver.findElement(By.partialLinkText("Car")).click();
		Thread.sleep(3000);
		
		WebElement radio = driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']"));
		radio.click();
		
		WebElement dd = driver.findElement(By.name("passCount"));
		Select sel1 = new Select(dd);
		sel1.selectByVisibleText("1");
		Thread.sleep(3000);
		
		sel1.selectByVisibleText("3");
		Thread.sleep(3000);
		
		sel1.selectByVisibleText("2");
		
		//fromPort
		WebElement dd1 = driver.findElement(By.name("fromPort"));
		Select sel2 = new Select(dd1);
		List<WebElement> values = sel2.getOptions();
		System.out.println(values.size());
		for(int i=0;i<values.size();i++)
		{
			System.out.println(values.get(i).getText());
		}
		//sel2.selectByIndex(6);
		sel2.selectByValue("London");
		WebElement First = sel2.getFirstSelectedOption();
		System.out.println(First.getAttribute("value"));
		//fromMonth
		//WebElement dd2 = driver.findElement(By.name("fromMonth"));
		//Select sel3 = new Select(dd2);
		//sel3.selectByVisibleText("1");
		
		

		
		
	}
	
	@AfterTest
 
 public void afterTest()
{
	  //driver.close();
}
	
	

}
