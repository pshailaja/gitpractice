package selenium_prac;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeFf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/Users/PC/Downloads/geckodriver-v0.18.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");

	}

}
