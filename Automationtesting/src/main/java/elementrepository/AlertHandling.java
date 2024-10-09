package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base{
  public void alert1()
{
	WebElement alerts_and_modals=driver.findElement(By.xpath("//a[@href='bootstrap-alert.php']"));
	alerts_and_modals.click();
	WebElement javascript_alert=driver.findElement(By.xpath("//a[@href='javascript-alert.php']"));
	javascript_alert.click();
	WebElement button=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
	button.click();
	driver.switchTo().alert().accept();
}
  public void alert2()
  {
	  WebElement alerts_and_modals=driver.findElement(By.xpath("//a[@href='bootstrap-alert.php']"));
		alerts_and_modals.click();
		WebElement javascript_alert=driver.findElement(By.xpath("//a[@href='javascript-alert.php']"));
		javascript_alert.click();
	   WebElement warningbutton=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
	  warningbutton.click();
	  driver.switchTo().alert().dismiss();  
  }
  public void alert3()
  {
	  WebElement alerts_and_modals=driver.findElement(By.xpath("//a[@href='bootstrap-alert.php']"));
		alerts_and_modals.click();
		WebElement javascript_alert=driver.findElement(By.xpath("//a[@href='javascript-alert.php']"));
		javascript_alert.click();
		 WebElement warningbutton1=driver.findElement(By.xpath("// button[@class='btn btn-danger']"));
		 warningbutton1.click();
		 driver.switchTo().alert().sendKeys("Test alert");
		 driver.switchTo().alert().accept();
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AlertHandling obj=new AlertHandling();
		obj.initializebrowser();
		//obj.alert1();
		//obj.alert2();
		obj.alert3();
		
	}

}
