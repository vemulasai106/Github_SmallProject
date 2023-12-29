package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop_Program {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		Actions act = new Actions(driver);
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement From = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement to = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		act.dragAndDrop(From,to).perform();

	}

}
