package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Frames_Project {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		WebElement frame1 = driver.findElement(By.xpath("/html/frameset/frame[1]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.name("mytext1")).sendKeys("Aishwarya");
		driver.switchTo().defaultContent();
		WebElement frame2 = driver.findElement(By.xpath("/html/frameset/frameset/frame[1]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.name("mytext2")).sendKeys("BhagyaLakshmi");
		driver.switchTo().defaultContent();
		WebElement frame3 = driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.name("mytext3")).sendKeys("Krishnaveni");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"i8\"]/div[3]/div")).click();
		driver.switchTo().defaultContent();
		WebElement frame4 = driver.findElement(By.xpath("/html/frameset/frameset/frame[3]"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.name("mytext4")).sendKeys("RamaLakshmi");
		driver.switchTo().defaultContent();
		WebElement frame5 = driver.findElement(By.xpath("/html/frameset/frame[2]"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.name("mytext5")).sendKeys("Jaishwika");

	}

}
