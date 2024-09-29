package elementrepository;

public class Browsercommands extends Base{
	public void browsercommands()
	{
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		
		
	}

	public static void main(String[] args) {
		Browsercommands obj=new Browsercommands();
		obj.initializebrowser();
		obj.browsercommands();

	}

}
