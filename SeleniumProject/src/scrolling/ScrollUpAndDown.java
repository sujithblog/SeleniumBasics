package scrolling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollUpAndDown {

	public WebDriver driver = new FirefoxDriver();
	public String baseUrl = "https://jqueryui.com/demos/";

	public void openURL() {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void scrollDown() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,800)", "");

		// OR
		// ((JavascriptExecutor)driver).executeScript("scroll(0,800)");
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/home/skombettu/All/batch155javaprogram/FireFoxThirdPartyDrivers/geckodriver-v0.26.0-linux64/geckodriver");
		ScrollUpAndDown sud = new ScrollUpAndDown();
		sud.openURL();
		sud.scrollDown();
	}

}
