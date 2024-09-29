package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locaters extends Base {
public void locatingbyID()
{
  WebElement message=driver.findElement(By.id("single-input-field"));
  WebElement message1=driver.findElement(By.id("value-a"));
  WebElement message2=driver.findElement(By.id("value-b"));
  WebElement message3=driver.findElement(By.id("button-two"));
  WebElement message4=driver.findElement(By.id("is_checked"));
}

public void locatingbyClass()
{
	WebElement elementname=driver.findElement(By.className("btn btn-primary"));
	WebElement elementname1=driver.findElement(By.className("form-check-input"));
	WebElement elementname2=driver.findElement(By.className("form-control datepicker"));
	WebElement elementname3=driver.findElement(By.className("form-control"));
	WebElement elementname4=driver.findElement(By.className("w25 fleft"));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locaters obj=new Locaters();
		obj.initializebrowser();
		obj.locatingbyID();
		obj.locatingbyClass();
	}

}
