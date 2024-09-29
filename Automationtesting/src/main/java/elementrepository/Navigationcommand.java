package elementrepository;

public class Navigationcommand extends Base{
public void navigate()
{
  driver.navigate().to("https://www.amazon.in/");
  driver.navigate().back();
  driver.navigate().forward();
  driver.navigate().refresh();
  }
	
	public static void main(String[] args) {
		Navigationcommand obj=new Navigationcommand();
		obj.initializebrowser();
		obj.navigate();

	}

}
