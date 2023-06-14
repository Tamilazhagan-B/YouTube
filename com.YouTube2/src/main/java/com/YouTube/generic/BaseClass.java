package com.YouTube.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.YouTube.pom.GoogleApiPage;
import com.YouTube.pom.HomePage;

public class BaseClass {
	public static WebDriver driver;
	FileLib fl=new FileLib();
	
	
	
	static {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tamil\\git\\youtube\\com.YouTube2\\src\\main\\resources\\driver\\chromedriver.exe");
	}
	@SuppressWarnings("deprecation")
	public static void impWait()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	} 
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		impWait();
		String url=fl.getPropertyData("url");
		Reporter.log(url);
		driver.get(url);
		Reporter.log("BrowserOpened...", true);		
	}	
	
	@BeforeMethod
	public void signInEmail() throws IOException {
		HomePage hp=new HomePage(driver);
		hp.sigin().click();
		impWait();
		
		GoogleApiPage gp=new GoogleApiPage(driver);
		String email=fl.getPropertyData("email1");
		gp.EmailTextField().sendKeys(email);
		impWait();
		gp.clickNextforEmail().click();
		impWait();
		String pwd=fl.getPropertyData("pwd1");
		gp.PasswordTextField().sendKeys(pwd);
		impWait();
		gp.clickNextforPwd().click();
		impWait();
		Reporter.log("signIn...", true);
	}
	
	@AfterMethod
	public void signOutEmail() {
		HomePage hp=new HomePage(driver);
		/*
		 * hp.clickAcclogo().click(); impWait();
		 */
		hp.singOut().click();
		Reporter.log("signOut...", true);
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
		Reporter.log("BrowserClosed...", true);
	}

}
