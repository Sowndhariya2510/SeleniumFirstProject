package Day1_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LinkTextPartialLinkText {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
WebDriver driver = new ChromeDriver();// open the Chrome browser window.



driver.manage().window().maximize();// to maximize the opening browser window.
driver.get("https://www.rediff.com/");//Load the web page

//finding the links Rediff mail (by.LinkText())

WebElement link = driver.findElement(By.linkText("Rediffmail"));
System.out.println(link.getText());

 driver.findElement(By.partialLinkText("Rediffmail")).click();




}
}