package dragAndDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
//https://www.youtube.com/watch?v=bmQBoKE3ldc&t=1s
	
	// launch the URL
	 public WebDriver driver=new ChromeDriver();
	 public String baseUrl ="http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
	
	 public void openURL()
	 {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 }
	                  
	 public void dragThem() {
		 driver.findElement(By.id("box1")).click();
		 WebElement dragMe = driver.findElement(By.id("box1"));
		 WebElement dropMe = driver.findElement(By.id("box101"));
		 Actions builder=new Actions(driver);
		 builder.dragAndDrop(dragMe,dropMe).perform();
 	}
	 
	 public void putThemBack() {
		 driver.findElement(By.id("box1")).click();
		 WebElement dragMe = driver.findElement(By.id("box1"));
		 WebElement dropMe = driver.findElement(By.id("dropContent"));
		 Actions builder=new Actions(driver);
		 builder.dragAndDrop(dragMe,dropMe).perform();
		 driver.navigate().refresh();
	}
	 
	public static void main(String[] args) throws InterruptedException 
		 {			
			 System.setProperty("webdriver.chrome.driver","/home/skombettu/All/batch155javaprogram/ChromeThirdPartyDrivers/chromedriver_linux64/chromedriver");
			 DragAndDrop test=new DragAndDrop();
			 test.openURL();
			 Thread.sleep(3000);
			 test.dragThem();
			 test.putThemBack();
	}
}