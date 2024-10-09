package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XpathEg extends Base{
public void absolut_expath()
{
	WebElement xpath=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input")); 
	WebElement xpath1=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/select"));
	WebElement xpath2=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button"));
}

public void relative_xpath()
{
	WebElement xpath=driver.findElement(By.xpath("//input[@placeholder='Message']"));
	WebElement xpath1=driver.findElement(By.xpath("//button[@id='button-one']"));
	WebElement xpath2=driver.findElement(By.xpath("//input[@id='gridCheck']"));

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
	WebElement parentxpath=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
	WebElement followingpath=driver.findElement(By.xpath("//input[@type='text']//following::input"));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
