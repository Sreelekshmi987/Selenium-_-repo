package elementrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Find_multiple_elements extends Base {
	public void multipleElements()
	{
		WebElement simpleform=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		simpleform.click();
	  List<WebElement> element1=driver.findElements(By.xpath("//input[@type='text']"));
	  for(WebElement element2:element1)
	  {
		  element2.sendKeys("hello");
	  }
		
	}

	public static void main(String[] args) {

		Find_multiple_elements obj=new Find_multiple_elements();
		obj.initializebrowser();
		obj.multipleElements();
	}

}
