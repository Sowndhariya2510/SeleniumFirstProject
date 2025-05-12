package Day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FirstSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 

		// creating a web driver instance(To control all UI activities on Browser)
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();// opens the chrome browser window

		// WebDriver : methods:
		//get(): Load the url in current browser window//
		driver.get("https://www.google.com/");
		//getTitle(): It returns the title of the current page
		String actualtitle=driver.getTitle();

		System.out.println("Title of the page : "+actualtitle);

		String expectedTitle="FirstCry";

		if(actualtitle.equals(expectedTitle))
		{
		System.out.println("Landed on correct page");
		}
		else
		{
		System.out.println("error : wrong page landed");
		}


		}



		
	}


