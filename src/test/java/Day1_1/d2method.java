package Day1_1;



import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class d2method {



public static void main(String[] args) {


System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();
//load rediff login page
driver.get("https://www.rediff.com/");

// findout total no of links on that page and print the text
//of each
List<WebElement> alllinks =driver.findElements(By.tagName("a"));

System.out.println("Total no of anchors on the page: "+alllinks.size());
System.out.println("---------Text of all links----------");
for(WebElement e: alllinks)
{
System.out.println(e.getText());
}


}



}