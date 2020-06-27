package getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGetAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/skombettu/All/batch155javaprogram/ChromeThirdPartyDrivers/chromedriver_linux64/chromedriver");

		WebDriver driver=new ChromeDriver();
		driver.get("file:///home/skombettu/Desktop/Batch155/sample.html");
		driver.manage().window().maximize();
		
		String attValue=driver.findElement(By.xpath("//a[text()='Java Inheritance']")).getAttribute("href"); 
		System.out.println(attValue);
	
		
		String classAttValue=driver.findElement(By.xpath("//a[text()='Java Inheritance']")).getAttribute("class"); 
		System.out.println(classAttValue);
		driver.close();
	}

}
