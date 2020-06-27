package screenshot;

import java.io.File;
import java.util.concurrent.TimeUnit;
 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class TaskScreenshot {
	
public WebDriver driver=new ChromeDriver();
public String baseurl ="https://jqueryui.com/toggle/";
		
public void openURL() {
	driver.get(baseurl);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

public void taskScreenshot() throws Exception    {
	TakesScreenshot t=(TakesScreenshot)driver;
	File sourse=t.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(sourse, new File("/home/skombettu/All/batch155javaprogram/ss/abc.png"));
	System.out.println("done");
 }

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","/home/skombettu/All/batch155javaprogram/ChromeThirdPartyDrivers/chromedriver_linux64/chromedriver");
		TaskScreenshot ts=new TaskScreenshot();
		ts.openURL();
		ts.taskScreenshot();
	}

}
