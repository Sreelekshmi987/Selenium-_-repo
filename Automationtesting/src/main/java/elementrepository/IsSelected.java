package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IsSelected extends BaseEg2{

	public void select()
	{
		WebElement select=driver.findElement(By.xpath("//input[@value='option-2']"));
		select.click();
		System.out.println(select.isSelected());
		WebElement select1=driver.findElement(By.xpath("//input[@value='option-3']"));
		System.out.println(select1.isSelected());
		WebElement select2=driver.findElement(By.xpath("//input[@value='option-4']"));
		select2.click();
		System.out.println(select2.isSelected());
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsSelected obj=new IsSelected();
		obj.browserinitialisation();
		obj.isSelect();
		obj.select();
	}

}
