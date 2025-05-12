package Day1_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
Navigation nav=driver.navigate();
nav.to("https://www.rediff.com/");
	driver.findElement(By.linkText("Rediffmail"));
	Thread.sleep(8000);
	
	nav.back();
	Thread.sleep(8000);
	
	nav.forward();
	driver.findElement(By.id("login1")).sendKeys("sownd");
	driver.findElement(By.id("password")).sendKeys("8832");
	driver.findElement(By.name("proceed")).click();
	
	}

}
