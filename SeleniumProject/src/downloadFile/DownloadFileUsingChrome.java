package downloadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class DownloadFileUsingChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/home/skombettu/All/batch155javaprogram/ChromeThirdPartyDrivers/chromedriver_linux64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.findElement(By.id("textbox")).sendKeys("Testing Data");
		driver.findElement(By.id("createTxt")).click();
		driver.findElement(By.id("link-to-download")).click();

	}

}
