package browserActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoBrowserActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/skombettu/All/batch155javaprogram/ChromeThirdPartyDrivers/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com");
		//driver.navigate().to("https://krninformatix.com");
		driver.findElement(By.xpath("//a[text()='About us']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
	}

}
