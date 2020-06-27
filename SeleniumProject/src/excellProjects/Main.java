package excellProjects;

public class Main {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/home/skombettu/All/batch155javaprogram/FireFoxThirdPartyDrivers/geckodriver-v0.26.0-linux64/geckodriver");
		GetExcelldata.openURL();
		GetExcelldata.login();
		
		
		
	}

}
