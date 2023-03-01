package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_Demo {
	
	static WebDriver driver;
	
	
	public static void sweet() throws InterruptedException {
       WebElement findElement = driver.findElement(By.xpath("//button[@type='button']"));
       Thread.sleep(2000);
       findElement.click();
	}
	
	
	
	public static void mouse() {
		 driver=new ChromeDriver();
         driver.get("http://www.greenstechnologys.com/");
         driver.manage().window().maximize();

	}
	public static void actions() throws InterruptedException  {
		Actions ac=new Actions(driver);
		WebElement master = driver.findElement(By.linkText("Master Program"));
		//master.click();
		//Thread.sleep(6000);
		ac.contextClick(master);
		
		ac.build().perform();
		
		//WebElement element = driver.findElement(By.linkText("Online Courses"));
		//ac.click(element);
		//ac.doubleClick(element);
		//ac.clickAndHold(element);
		//ac.release();
		//Thread.sleep(2000);
		//ac.moveToElement(master);
		
		
		
      
	}
	
	//public static void main(String[] args) throws InterruptedException {
		//mouse();
		//Thread.sleep(2000);
		//sweet();
		//actions();
		
		
	}


