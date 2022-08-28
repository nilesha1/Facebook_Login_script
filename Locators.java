package udemy;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("username@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("password@1234");
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.className("_6ltg")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.cssSelector("div._9ay7")).getText());
		//For error message capture and print error msg using "cssSelector(tagname.className)"		
		
	}

}
