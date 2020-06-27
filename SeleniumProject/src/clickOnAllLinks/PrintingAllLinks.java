package clickOnAllLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingAllLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/home/skombettu/All/batch155javaprogram/ChromeThirdPartyDrivers/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://krninformatix.com/index.php");
		driver.manage().window().maximize();
		
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));	
		
		int linkSize=allLinks.size();
	
		for(int i=0;i<=linkSize; i++)
		{
			WebElement link = allLinks.get(i);
			String te=link.getText();
			System.out.println(te);
		}
	}
}
