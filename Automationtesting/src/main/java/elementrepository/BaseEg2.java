package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseEg2 {
	
	public WebDriver driver;
	public void browserinitialisation()
	{
	driver=new ChromeDriver();
	driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	driver.manage().window().maximize();
	}
    
	public void drpdwnlist()
	{
		WebElement drpdwn=driver.findElement(By.id("dropdowm-menu-1"));
		Select select=new Select(drpdwn);
		//select.selectByVisibleText("C#");
		//select.selectByIndex(1);
		select.selectByValue("c#");
	}
	public void isEnable()
	{
		WebElement checkbox=driver.findElement(By.xpath("//input[@value='option-3']"));
		System.out.println(checkbox.isEnabled());
	}
	public void isSelect()
	{
		WebElement select=driver.findElement(By.xpath("//input[@value='option-1']"));
		select.click();
		System.out.println(select.isSelected());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseEg2 obj=new BaseEg2();
		obj.browserinitialisation();
		obj.drpdwnlist();
		obj.isEnable();
		obj.isSelect();
	}
	


}
