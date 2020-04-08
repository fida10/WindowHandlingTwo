import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "//Users//fida10//selenium//drivers//chrome//chromedriver");
		WebDriver dr = new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		dr.get("https://www.staydomio.com/");
		Actions a = new Actions(dr);
		a.moveToElement(dr.findElement(By.xpath("//div[@class='styles_topRow__1vC3V']//div[1]//div[1]//a[contains(@href,'lease-to')]"))).keyDown(Keys.SHIFT).click().build().perform();
		a.moveToElement(dr.findElement(By.xpath("//div[@class='styles_topRow__1vC3V']//div[1]//div[1]//a[contains(@href,'instagram')]"))).keyDown(Keys.SHIFT).click().build().perform();
		WindowSwitcher.windowSwitcher(dr);
	}
}
