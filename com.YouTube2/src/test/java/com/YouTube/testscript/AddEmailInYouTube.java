package com.YouTube.testscript;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.YouTube.generic.BaseClass;
import com.YouTube.generic.FileLib;
import com.YouTube.pom.GoogleApiPage;
import com.YouTube.pom.HomePage;

public class AddEmailInYouTube extends BaseClass {
	FileLib fl=new FileLib();
	
	@Test
	public void addEmailInYouTube() throws IOException {
		HomePage hp=new HomePage(driver);
		hp.clickAcclogo().click();
		impWait();
		String actual=hp.verifyMail().getText();
		impWait();
		String exptEmail=fl.getPropertyData("email1");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actual, exptEmail);
		impWait();
		Reporter.log(actual, true);
		sa.assertAll();
		
		
		
		
		
	}

}
