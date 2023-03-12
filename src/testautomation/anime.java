package testautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class anime {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
		driver.findElement(By.id("email")).sendKeys("dalif65740@mirtox.com");
		driver.findElement(By.id("pass")).sendKeys("Password123");
		driver.findElement(By.id("send2")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[4]/a/span[2]")));
		action.moveToElement(driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[4]/ul/li[1]/a/span")));
		action.click().build().perform();
		
		Select sortBy=new Select(driver.findElement(By.id("sorter")));
		sortBy.selectByVisibleText("Price");
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,750)", "");
		
		driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[8]/div/a/span/span/img")).click();
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[4]/form/div/div/div[1]/div/input")).sendKeys(Keys.ARROW_RIGHT);
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[4]/form/div/div/div[1]/div/input")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[4]/form/div/div/div[1]/div/input")).sendKeys("2");
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[4]/form/div/div/div[2]/button/span")).click();
		driver.findElement(By.linkText("shopping cart")).click();
		driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button/span")).click();
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button/span")).click();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[4]/div/button")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('confirm order?')");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.navigate().refresh();
		driver.quit();
	//	driver.findElement(By.id("VGYNPQD")).sendKeys("Patiala");
//		driver.findElement(By.id("PLW0CJG")).sendKeys("Patiala");
//		Select sortBy1=new Select(driver.findElement(By.id("X6NQ4MH")));
//		sortBy1.selectByVisibleText("India");
//		
//		Select sortBy2=new Select(driver.findElement(By.id("D4SPW0U")));
//		sortBy2.selectByVisibleText("Punjab");
//		try {
//			Thread.sleep(7000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		//driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button")).click();
		//driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[4]/div/button")).click();
	}
}
