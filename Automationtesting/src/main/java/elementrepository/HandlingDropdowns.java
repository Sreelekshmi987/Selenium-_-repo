package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdowns extends Base{

	public void dropdownDisplay()
	{
		WebElement inputform=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputform.click();
		WebElement selectinput=driver.findElement(By.xpath("//a[@href='select-input.php']"));
		selectinput.click();
		WebElement dropdownlist=driver.findElement(By.id("single-input-field"));
		Select select=new Select(dropdownlist);
		//select.selectByVisibleText("Red");
		//select.selectByIndex(1);
		select.selectByValue("Red");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDropdowns obj=new HandlingDropdowns();
		obj.initializebrowser();
		obj.dropdownDisplay();
	}

}
