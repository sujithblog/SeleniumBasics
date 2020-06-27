package selectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSingleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/skombettu/All/batch155javaprogram/ChromeThirdPartyDrivers/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///home/skombettu/Desktop/Batch155/sample.html");
		
		WebElement singleSelect=driver.findElement(By.id("city"));
		Select dd =new Select(singleSelect); 
 		Thread.sleep(2000);
		dd.selectByIndex(1);
		Thread.sleep(2000);
		dd.selectByValue("3");	
		Thread.sleep(2000);
		dd.selectByVisibleText("Bangalore");
 			
		java.util.List<WebElement> allOptions= dd.getOptions();
		
		 //WebElement opt=allOptions.get(0);	
		 //String getText=opt.getText();
		 //System.out.println(getText);
		 //put it in for loop
				
		int optsize=allOptions.size();
		
		 for(int i=0;i<optsize;i++) 
		 {
			 WebElement opt=allOptions.get(i);	
			 String getText=opt.getText();
			 System.out.println(getText);
		 }	
	}
}
