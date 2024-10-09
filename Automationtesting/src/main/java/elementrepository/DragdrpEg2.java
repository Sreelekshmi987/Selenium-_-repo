package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragdrpEg2 {
	public WebDriver driver;
	public void brwsrinitialise()
	{
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
		
	}
	public void drpdwn()
	{
		WebElement drag=driver.findElement(By.xpath("//b[text()='DRAG ME TO MY TARGET!']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(drag).click();
		actions.doubleClick(drag).perform();
		
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		actions.dragAndDrop(drag, drop).build().perform();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragdrpEg2 obj=new DragdrpEg2();
		obj.brwsrinitialise();
		obj.drpdwn();
	}

}
