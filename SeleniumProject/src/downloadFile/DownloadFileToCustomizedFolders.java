package downloadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFileToCustomizedFolders {

	public static void main(String[] args) {
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.dir", "/home/skombettu/All/batch155javaprogram");
		
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(profile);
		
		System.setProperty("webdriver.gecko.driver","/home/skombettu/All/batch155javaprogram/FireFoxThirdPartyDrivers/geckodriver-v0.26.0-linux64/geckodriver");
		
		WebDriver driver=new FirefoxDriver(option);

		driver.get("https://www.krninformatix.com/download.php");
		
		driver.findElement(By.xpath("//a[@href='https://goo.gl/uJJ5Sc']")).click();
		
	}
}
 