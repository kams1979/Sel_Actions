package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop1 {
	
	static WebDriver driver;
	
	private static void browse() {
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
	}
	private static void dragdrop3() throws InterruptedException {
		Actions ac=new Actions(driver);
		WebElement s = driver.findElement(By.id("angular"));
		WebElement e = driver.findElement(By.id("droparea"));
		
       ac.dragAndDrop(s, e);		
		ac.build().perform();
		
			
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		browse();
		Thread.sleep(2000);
		dragdrop3();
		
		
		
	}

}
