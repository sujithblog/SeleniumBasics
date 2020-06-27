package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/skombettu/All/batch155javaprogram/ChromeThirdPartyDrivers/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		Thread.sleep(4000);
		
		//driver.switchTo().alert().accept();
		
		//Getting the text from alert window
		Alert alert=driver.switchTo().alert();
		String simpleAlertText=alert.getText();
		System.out.println(simpleAlertText);
		
		alert.accept();
		driver.close();
		}

}
