package com.YouTube.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.YouTube.generic.BaseClass;
import com.YouTube.generic.FileLib;

public class GoogleApiPage extends BaseClass {
	
	
	@FindBy(id = "identifierId")
	private WebElement emailTextField;
	
	@FindBy(xpath = "//span[.='Next']")
	private WebElement email_next;
	
	@FindBy(xpath = "//span[.='Next']")    //(//span[@jsname='V67aGc'])[2]
	private WebElement pwd_next;
	
	@FindBy(name = "Passwd")
	private WebElement passwdTestField;
	
	
	 public GoogleApiPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement EmailTextField() {
		return emailTextField;
	}
	
	public WebElement clickNextforEmail() {
		return email_next;
	}
	
	public WebElement PasswordTextField() {
		return passwdTestField;
		
	}
	
	public WebElement clickNextforPwd() {
		return pwd_next;
	}
	
	
	
	
	
	
	
}
