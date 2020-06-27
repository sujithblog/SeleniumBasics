package fileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/skombettu/All/batch155javaprogram/ChromeThirdPartyDrivers/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///home/skombettu/Desktop/Batch155/sample.html");
		driver.findElement(By.xpath("//input[@id='browse']")).sendKeys("/home/skombettu/Desktop/Batch155/home.png");
	}

}
