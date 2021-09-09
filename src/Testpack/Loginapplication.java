package Testpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Objectrepo.Rediffloginpage;
import Objectrepo.RediffHomepage;

//import Objectrepository.RediffHomepage;
//import objectrepository.RediffLoginpage;

//import Testcases.Test;

public class Loginapplication {
	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Tintu\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Rediffloginpage rd=new Rediffloginpage(driver);
		rd.Emaild().sendKeys("hello"); 
		rd.Password().sendKeys("hello");
		//rd.submit().click();
		rd.rediff().click();
		RediffHomepage rh=new RediffHomepage(driver);
		rh.Search().sendKeys("rediff");
		rh.Submit().click();
		
			
	}

}
