package com.YouTube.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.YouTube.generic.BaseClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath = "(//div[@class='yt-spec-touch-feedback-shape__fill'])[4]")
	private WebElement signup_button;
	
	@FindBy(id = "img")
	private WebElement click_acco_pic;
	
	@FindBy(xpath = "//yt-formatted-string[@id='email']")
	private WebElement verify_Mail;
	
	@FindBy(xpath = "(//yt-formatted-string[@id='label'])[4]")
	private WebElement sing_Out;
	
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public WebElement sigin() {
		return signup_button;
	}
	
	public void getGmailName() {
		
	}
	
	public WebElement clickAcclogo() {
		return click_acco_pic;
	}
	
	public WebElement verifyMail() {
		return verify_Mail;
	}
	
	public WebElement singOut() {
		return sing_Out;
	}
	
	
	
	
}
