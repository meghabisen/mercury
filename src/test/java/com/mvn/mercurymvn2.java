package com.mvn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class mercurymvn2 {
	public WebDriver driver;
  @Test
  public void user1() {
	  

	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Suvidyap1");
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("P@ssword1");
	  driver.findElement(By.xpath("//input[@name='login']")).click();
	  Boolean flag= driver.findElement(By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']")).isDisplayed();
		System.out.println("Flight Finder image is displayed");  
	  driver.findElement(By.linkText("SIGN-OFF")).click();
	  System.out.println("logout 1User");
	  System.out.println("megha 89 fef");
  }
  @Test
  public void loginuser2() 
  {
	  System.out.println("SECOND user login");
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Suvidyap2");
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("P@ssword2");
	  driver.findElement(By.xpath("//input[@name='login']")).click();
	Boolean flag1= driver.findElement(By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']")).isDisplayed();
	System.out.println("Flight Finder image is displayed");  
	driver.findElement(By.linkText("SIGN-OFF")).click();
	  System.out.println("logout 2User");
  }
  @Test
  public void loginuser3() 
  {
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Suvidyap");
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("P@ssword");
	  driver.findElement(By.xpath("//input[@name='login']")).click();
	 
	  driver.findElement(By.linkText("SIGN-OFF")).click();
	  System.out.println("logout 3User");
  }

  
  @BeforeMethod
  public void beforeMethod() {
	  Set<Cookie> Cookies =driver.manage().getCookies();
	  for(Cookie Cookie:Cookies)
	  {
		  System.out.println("The name of cookie is:"+ Cookie.getName());
	  }
  }

  @AfterMethod
  public void afterMethod() throws IOException {
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyToDirectory(src, new File("E:\\MEGHA\\CJC new\\Megha Eclips\\mvn2\\src\\test\\resources\\Screenshotmvn2\\"));
  }

  @BeforeClass
  public void beforeClass() {
	  driver.manage().window().maximize();
	  System.out.println("site page maximize");
  }

  @AfterClass
  public void afterClass() {
	  driver.manage().deleteAllCookies();
	  System.out.println("Clear cookies");
  }

  @BeforeTest
  public void beforeTest() {
	  driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	  System.out.println("Mercury Tours site open");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Close db Connection");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ab\\Desktop\\Testing\\chromedriver.exe");
	  driver = new ChromeDriver();
	  System.out.println("Chrome browser open");
  }

  @AfterSuite
  public void afterSuite() {
	  driver.close();
	  System.out.println("Browser is close");
  }

}
