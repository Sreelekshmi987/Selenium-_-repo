package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IsEnable extends Base {

	public void enable()
	{
		WebElement inputform=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputform.click();
		WebElement entermessage=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		System.out.println(entermessage.isEnabled());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsEnable obj=new IsEnable();
		obj.initializebrowser();
		obj.enable();
	}

}
