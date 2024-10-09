package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop extends Base {

	public void drag_drop()
	{
	WebElement element1=driver.findElement(By.xpath("//a[@id='others']"));
	element1.click();
	
	WebElement dragitem=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));	
	Actions actions=new Actions(driver);
	actions.moveToElement(dragitem).click();
	actions.doubleClick(dragitem).perform();
	
	WebElement dropitem=driver.findElement(By.xpath("//div[@id='mydropzone']"));
	actions.dragAndDrop(dragitem, dropitem).build().perform();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drag_Drop obj=new Drag_Drop();
		obj.initializebrowser();
		obj.drag_drop();
	}

}
