package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class krnCoursesOffered {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","/home/skombettu/All/batch155javaprogram/FireFoxThirdPartyDrivers/geckodriver-v0.26.0-linux64/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/");
		WebElement coursesOffered = driver.findElement(By.xpath("//span[text()='Courses Offered']"));
		Actions act=new Actions(driver);
		act.moveToElement(coursesOffered).perform();
		act.contextClick(coursesOffered).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
	} 
}
