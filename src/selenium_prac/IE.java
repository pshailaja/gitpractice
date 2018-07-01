package selenium_prac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IE {

	public static void main(String args[])
	{
		System.setProperty("Webdriver.ie.driver", "C:/Users/PC/Downloads/IEDriverServer_x64_3.11.1/IEDriverServer.exe");
		DesiredCapabilities caps=DesiredCapabilities.internetExplorer();
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		
		WebDriver driver=new InternetExplorerDriver(caps);
		String URL="http://www.google.com";
		driver.get(URL);
		System.out.println("IE opened "+ URL);
	}
	
}
