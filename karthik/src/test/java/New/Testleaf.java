package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testleaf {

	
	
		
		@Test
			public void openbutton() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\alimili.karthik\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver b1;
			b1=new ChromeDriver();
			b1.get("http://leafground.com/");
			Thread.sleep(2000);
			b1.findElement(By.linkText("Button")).click();
			b1.findElement(By.id("position")).click();
			b1.findElement(By.id("home")).click();
			b1.findElement(By.linkText("Button")).click();
			b1.findElement(By.id("color")).click();
			b1.findElement(By.id("home")).click();
			b1.findElement(By.linkText("Button")).click();
			b1.findElement(By.id("home")).click();
			b1.findElement(By.linkText("Button")).click();
			b1.findElement(By.id("size")).click();
			b1.findElement(By.id("home")).click();
			b1.close();

			}
	}

