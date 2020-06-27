package fullProjectTry1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public WebDriver driver=new FirefoxDriver();
	public String baseURL = "https://jqueryui.com/droppable/";
	
		public void openURL(){
			driver.get(baseURL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}

		public void switchToFrame() {
			WebElement frm=driver.findElement(By.xpath("//iframe[contains(@src,'droppable')]"));
			driver.switchTo().frame(frm);
		}
	
		public void dragAndDropTest() throws Exception {
			driver.findElement(By.xpath("(//a[text()='Droppable'])")).click();
			switchToFrame();
			driver.findElement(By.id("draggable")).click();
			WebElement sourse=driver.findElement(By.id("draggable"));
			WebElement target=driver.findElement(By.id("droppable"));
			Thread.sleep(3000);
			Actions act=new Actions(driver);
			act.dragAndDrop(sourse, target).perform();
		}
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","/home/skombettu/All/batch155javaprogram/FireFoxThirdPartyDrivers/geckodriver-v0.26.0-linux64/geckodriver");
		Droppable d=new Droppable();
		d.openURL();
		d.dragAndDropTest();
	}
}
