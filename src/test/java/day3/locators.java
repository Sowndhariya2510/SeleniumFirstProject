package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class locators {

	//private static WebElement countries;

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
WebDriver d=new ChromeDriver();

d.get("http://demo.automationtesting.in/Register.html");

WebElement lnk=d.findElement(By.linkText("a"));
lnk.click();
//Thread.sleep(1000);
WebElement FN=d.findElement(By.className("form-control ng-pristine ng-untouched ng-invalid ng-invalid-required"));
FN.sendKeys("Sowndhariya");
WebElement LN=d.findElement(By.className("form-control ng-pristine ng-untouched ng-invalid ng-invalid-required"));
LN.sendKeys("S");




WebElement Hobby=d.findElement(By.cssSelector("input[value='Cricket']"));
Hobby.click();
WebElement Skills=d.findElement(By.id("skills"));
Select select=new Select(Skills);
select.selectByValue("Python");
WebElement countries=d.findElement(By.id("countries"));
Select select1=new Select(countries);
select1.selectByValue("India");

WebElement Lang=d.findElement(By.id("msdd"));
Select select2=new Select(Lang);
select2.selectByValue("English");

WebElement DOB=d.findElement(By.id("yearbox"));
Select select3=new Select(DOB);
select3.selectByValue("1999");

WebElement Month=d.findElement(By.id("daybox"));
Select select4=new Select(Month);
select4.selectByValue(" October");



WebElement email=d.findElement(By.className("form-control ng-pristine ng-valid-email ng-invalid ng-invalid-required ng-touched"));
email.sendKeys("sowndhariya66mail.com");
WebElement pwd=d.findElement(By.id("firstpassword"));
pwd.sendKeys("992277");
WebElement pwd2=d.findElement(By.id("secondpassword"));
pwd2.sendKeys("992277");
WebElement submit=d.findElement(By.id("submitbtn"));
submit.click();

	}

}
