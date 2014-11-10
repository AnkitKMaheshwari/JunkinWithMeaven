package p1;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class GoogleFstLinkTest {
	
	private WebDriver driver;

	@BeforeMethod
	public void bfrmthd(){
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void aftrMeth(){
	driver.quit();
	}
	
	@Test
	public void googleTest1(){
		driver.get("http://www.google.com");
		driver.findElement(By.id("gbqfq")).sendKeys("selenium");
		driver.findElement(By.id("gbqfb")).click();
		System.out.println("It is a fst test with meaven nd testng");
		
	}
	
}
