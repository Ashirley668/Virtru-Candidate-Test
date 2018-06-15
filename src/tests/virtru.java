package tests;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class virtru {
	WebDriver driver;
	String browserType = "Chrome";	
	
	@BeforeMethod
	public void setUP() {
	driver = utilities.DriverFactory.open("browserType");
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com");	
}
	
	@Test
	public void encryptionTest() {
	driver.findElement(By.cssSelector("#identifierId")).sendKeys("automationsa24@gmail.com");
	driver.findElement(By.cssSelector("#identifierNext > content")).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("Autotesting89");
	driver.findElement(By.cssSelector("#passwordNext > content > span")).click();
	driver.findElement(By.cssSelector("#yDmH0d > div.FaV4Jb.xAuNcb > c-wiz > div > div > div.hdPVYc.xpKNgc > div:nth-child(2) > c-wiz > div > div.PoG2cf > div > div.ZY8k5b > div.vmZ0T > a.WaidBe")).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\":3g\"]")).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	String url = driver.findElement(By.xpath("//a[normalize-space(string(.)) = 'Unlock Message']")).getAttribute("href").toString();
	driver.get(url);
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//span[contains(text(), 'automationsa24@gmail.com')]")).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[3]/a[1]")).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	String msg = driver.findElement(By.xpath("//*[@id=\"tdf-body\"]/div")).getText().toString();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	Assert.assertTrue(msg != "Working on automating gmail login through Selenium!");
    System.out.println("Successfully completed");
	}

	@AfterMethod
	public void tearDown() {
	 driver.quit();	
	 
	}
}
