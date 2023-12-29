package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement_Program {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		Actions act = new Actions(driver);
		driver.get("https://demo.automationtesting.in/Alerts.html");
		WebElement Widgets = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/a"));
		WebElement AutoComplete = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[5]/ul/li[2]/a"));
		act.moveToElement(Widgets).moveToElement(AutoComplete).click().perform();
		

	}

}
