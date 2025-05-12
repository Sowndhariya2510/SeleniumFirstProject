package day3;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class SwitchToFrame {



WebDriver driver;

public SwitchToFrame() {



System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
driver=new ChromeDriver();
}


public void loadUrl()
{
driver.get("https://docs.oracle.com/javase/8/docs/api/");
driver.manage().window().maximize();

//driver.findElement(By.linkText("AbstractAction")).click();
}

public void switchToFrame()
{
// find out how many frames
List<WebElement> allframes = driver.findElements(By.tagName("frame"));
System.out.println("Total fames: "+allframes.size());

WebElement myframe= driver.findElement(By.xpath("//frame[@name='packageFrame']"));

// driver.switchTo().frame(0);
// driver.switchTo().frame("packageFrame");
driver.switchTo().frame(myframe);

driver.findElement(By.linkText("AbstractAction")).click();

}
public void closeAll()
{
driver.quit();
}



}