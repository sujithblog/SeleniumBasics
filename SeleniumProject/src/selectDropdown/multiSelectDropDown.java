package selectDropdown;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/skombettu/All/batch155javaprogram/ChromeThirdPartyDrivers/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///home/skombettu/Desktop/Batch155/sample.html");
		driver.manage().window().maximize();
		WebElement multiSelect = driver.findElement(By.id("numbers"));
		
		Select dd=new Select(multiSelect);
		Thread.sleep(2000);
		dd.selectByIndex(1);
		Thread.sleep(2000);
		dd.selectByValue("3");
		Thread.sleep(2000);
		dd.selectByVisibleText("Four");

		// deSelcet the option from multiselect drop down
		Thread.sleep(2000);
		//dd.deselectAll();
		
		java.util.List<WebElement> allOptions= dd.getAllSelectedOptions();
		
		int opsize=allOptions.size();
		 
		 for(int i=0;i<opsize;i++)
		 {
			 WebElement option1=allOptions.get(i);	
			 String op1=option1.getText();
			 System.out.println(op1);
		 }
		
		
		
		
		
		  
	}

}
