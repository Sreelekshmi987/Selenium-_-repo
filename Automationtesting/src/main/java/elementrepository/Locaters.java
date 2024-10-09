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
public void locatingbyName()
{
    WebElement name=driver.findElement(By.name("description"));
    WebElement name1=driver.findElement(By.name("student-gender"));
    WebElement name2=driver.findElement(By.name("viewport"));
    WebElement name3=driver.findElement(By.name("keywords"));
    WebElement name4=driver.findElement(By.name("author"));
}
public void locatingbyLinkText()
{
    WebElement text=driver.findElement(By.linkText("check-box-demo.php"));
    WebElement text1=driver.findElement(By.linkText("radio-button-demo.php"));
    WebElement text2=driver.findElement(By.linkText("select-input.php"));
    WebElement text3=driver.findElement(By.linkText("form-submit.php"));
    WebElement text4=driver.findElement(By.linkText("ajax-form-submit.php"));
}
public void locatingbyPartialLinkText()
{
    WebElement text=driver.findElement(By.partialLinkText("simple-form"));
    WebElement text1=driver.findElement(By.partialLinkText("check-box"));
    WebElement text2=driver.findElement(By.partialLinkText("radio-button"));
    WebElement text3=driver.findElement(By.partialLinkText("select-input"));
    WebElement text4=driver.findElement(By.partialLinkText("ajax-form"));
}
//css selector
public void tagandid()//syntax tag#id
{
    WebElement message=driver.findElement(By.cssSelector("input#single-input-field"));	
    WebElement message1=driver.findElement(By.cssSelector("button#button-one"));
    WebElement message2=driver.findElement(By.cssSelector("input#value-a"));
}
public void tagandclass()//syntax tag.class
{
	WebElement message=driver.findElement(By.cssSelector("input.form-check-input"));
	WebElement message1=driver.findElement(By.cssSelector(""));
	WebElement message2=driver.findElement(By.cssSelector(""));
}
public void tagandattribute()//syntax tag[attribute=value]
{
	WebElement message=driver.findElement(By.cssSelector("input[type=checkbox]"));
	WebElement message1=driver.findElement(By.cssSelector(""));
	WebElement message2=driver.findElement(By.cssSelector(""));

}
public void tag_classandattribute()//syntax tag.classname[attribute=value]
{
	WebElement message=driver.findElement(By.cssSelector("input.form-check-input[type=checkbox]"));
	WebElement message1=driver.findElement(By.cssSelector(""));
	WebElement message2=driver.findElement(By.cssSelector(""));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locaters obj=new Locaters();
		obj.initializebrowser();
		obj.locatingbyID();
		obj.locatingbyClass();
	}

}
