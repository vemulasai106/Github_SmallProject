package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions_Program {

	public static void main(String[] args) {
	   WebDriver driver = new EdgeDriver();
	   Actions act = new Actions(driver);
	   driver.get("https://text-compare.com/");
	   driver.findElement(By.name("text1")).sendKeys("Selenium is a one of testing design tool");
	   act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	   act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
	   act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	   act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	   driver.findElement(By.xpath("//*[@id=\"compareButton\"]/div[1]")).click();

	}

}
