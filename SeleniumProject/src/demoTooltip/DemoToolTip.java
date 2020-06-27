package demoTooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoToolTip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/skombettu/All/batch155javaprogram/ChromeThirdPartyDrivers/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		String toolTipTitle=driver.findElement(By.xpath("//img[contains(@src,'on6')]")).getAttribute("title");
		System.out.println(toolTipTitle);
 	}

}
