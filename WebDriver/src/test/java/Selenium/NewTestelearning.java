package Selenium;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTestelearning 
{
	WebDriver driver; 
  @BeforeTest
  public void beforeTest() 
  {
	    WebDriverManager.chromedriver().setup();
	 	driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.get("http://elearningm1.upskills.in/");
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
@Test
public void testcase2() throws InterruptedException
{
	 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	 driver.findElement(By.id("btnLogin")).click();
	 Thread.sleep(3000);
	 
	 List<WebElement> link= driver.findElements(By.tagName("a"));
	 System.out.println("Total numbers of link  "+link.size());
	
	 /*for(int i=0;i<link.size();i++)
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
	 driver.findElement(By.linkText("Logout")).click(); */
	 
	 driver.findElement(By.linkText("PIM")).click();
	 driver.navigate().back();
	 driver.navigate().forward();
	 driver.navigate().refresh();
	 driver.navigate().to("https//:www.google.com");
	 
	 
	 
}


  @AfterTest
  public void afterTest()
  {
	  //driver.close();
  }

}
