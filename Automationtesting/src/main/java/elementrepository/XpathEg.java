package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XpathEg extends Base{
public void absolut_expath()
{
	WebElement xpath=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input")); 
}
public void relative_xpath()
{
	WebElement xpath=driver.findElement(By.xpath("//input[@placeholder='Message']"));
}
public void dynamic_xpath_contains()
{
	WebElement xpath=driver.findElement(By.xpath("//input[contains(@placeholder,'Message')]"));
}
public void dynamic_xpath_text()
{
	WebElement xpath=driver.findElement(By.xpath("//button[text()='Show Message']"));
}
public void axes_method()
{
	WebElement xpath=driver.findElement(By.xpath("//a[@class='navbar-brand']//child::img[@alt='logo']"));
	WebElement childxpath=driver.findElement(By.xpath("//div[@class='form-group']//child::label[@for='inputEmail4']"));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
