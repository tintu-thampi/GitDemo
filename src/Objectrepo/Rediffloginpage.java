package Objectrepo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import Objectrepo.WebElement;

//import objectrepository.By;

public class Rediffloginpage {
	WebDriver driver;
	public Rediffloginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By username=By.xpath(".//*[@id='login1']");
	   By Password=By.name("passwd");
	   By go=By.name("proceed");
	   By rediff=By.linkText("rediff.com");
	   
	   public WebElement Emaild()
	   {
		   return driver.findElement(username);
	   }
	         
	   public WebElement Password()
	   {
		   return driver.findElement(Password);
	   }
	   
	   public WebElement submit()
	   {
		   return driver.findElement(go);
	   }
	   
	   public WebElement rediff()
	   {
		   return driver.findElement(rediff);
	   }
		

}
