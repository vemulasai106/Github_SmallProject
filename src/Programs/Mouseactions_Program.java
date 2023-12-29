package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions_Program {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		Actions act = new Actions(driver);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		//Rightclick
		WebElement Right = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(Right).perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[3]/span")).click();
		driver.switchTo().alert().accept();
		//Doubleclick
		WebElement Double = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(Double).perform();
		driver.switchTo().alert().accept();
		

	}

}
