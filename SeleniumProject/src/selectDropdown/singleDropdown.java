package selectDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singleDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/skombettu/All/batch155javaprogram/ChromeThirdPartyDrivers/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		WebElement singleDropdown = driver.findElement(By.id("testingDropdown"));
		
		Select sd = new Select(singleDropdown);
		
		List<WebElement> options = sd.getOptions();
		int size = options.size();
		
		for (WebElement ele : options) 
		{
			String sdElement = ele.getText();
			System.out.println(sdElement);
		}
	}
}
