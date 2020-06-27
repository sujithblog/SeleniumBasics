package downloadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFileToDesktop {

	public static void main(String[] args) {
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		profile.setPreference("browser.download.folderList", 0);
		
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(profile);
		
		System.setProperty("webdriver.gecko.driver","/home/skombettu/All/batch155javaprogram/FireFoxThirdPartyDrivers/geckodriver-v0.26.0-linux64/geckodriver");
		
		WebDriver driver=new FirefoxDriver(option);

		driver.get("https://www.krninformatix.com/download.php");
		
		driver.findElement(By.xpath("//a[@href='https://goo.gl/uJJ5Sc']")).click();
		
	}

}
// https://youtu.be/KO--8kpBIGo

/* FULL NAME TO SAVE TO DISK
1) To get save to disk :  
2) Go to : firefox -> about:config 
3) Search saveTo
4) You will get : browser.helperApps.neverAsk.saveToDisk
*/

/*
 * System will not take the file name directly
 * system will take only the mime type of the file
 * mime type zip file is applictaion/zip 
 */
 