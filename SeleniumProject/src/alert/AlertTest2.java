package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/skombettu/All/batch155javaprogram/ChromeThirdPartyDrivers/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://krninformatix.com/selenium/testing.html");
		driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();
		
		Alert alert =driver.switchTo().alert(); // alert() returns Alert interface
		Thread.sleep(3000);
		alert.dismiss();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();
		String txt=alert.getText();
		System.out.println(txt);
		Thread.sleep(3000);
		
		alert.accept();
		driver.close();		
	}
}
