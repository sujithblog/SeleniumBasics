package sampleLoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
 			System.setProperty("webdriver.chrome.driver","/home/skombettu/All/batch155javaprogram/ChromeThirdPartyDrivers/chromedriver_linux64/chromedriver");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
			
//Validating title
			String expectedTitle="actiTIME - Login";
			String actualTitle=driver.getTitle();
			System.out.println(actualTitle);
			if(expectedTitle.equals(actualTitle)) {
				System.out.println("getTitle pass");
			}else {
				System.out.println("getTitle fail");
			}
/*
//Validating some text
			
			String expectedText="Enter Time-Track";
			String actualText=driver.findElement(By.xpath("(//td[@class='pagetitle'])[1]")).getText();
				
			//Boolean status = expectedText.equals(actualText);
			if(expectedText.equals(actualText)) {
				System.out.println("getText pass1");
			}else {
				System.out.println("getText fail1");
			}
			
*/			

//Validating URL
			String expectedUrl="https://demo.actitime.com/login.do";
			String actualUrlt=driver.getCurrentUrl();
				
			//Boolean status = expectedText.equals(actualText);
			if(expectedUrl.equals(actualUrlt)) {
				System.out.println("getCurrentUrl pass");
			}else {
				System.out.println("getCurrentUrl fail");
			}	
						
			Thread.sleep(20000);
			driver.findElement(By.id("logoutLink")).click();
		}
}
