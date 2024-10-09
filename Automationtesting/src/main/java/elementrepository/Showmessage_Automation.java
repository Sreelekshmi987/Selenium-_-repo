package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Showmessage_Automation extends Base {
	
public void showMessage()
{
	WebElement inputform=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
	inputform.click();
	WebElement entermessage=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	entermessage.sendKeys("Hello");
	WebElement showmessage=driver.findElement(By.xpath("//button[@id='button-one']"));
	showmessage.click();
}
public void getTotal()
{
    WebElement entervalueA=driver.findElement(By.xpath("//input[@id='value-a']"));
    entervalueA.sendKeys("10");
    WebElement entervalueB=driver.findElement(By.xpath("//input[@id='value-b']"));
    entervalueB.sendKeys("15");
    WebElement getTotal=driver.findElement(By.xpath("//button[@id='button-two']"));
    getTotal.click();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Showmessage_Automation obj= new Showmessage_Automation();
		obj.initializebrowser();
		obj.showMessage();
		obj.getTotal();
	}

}
