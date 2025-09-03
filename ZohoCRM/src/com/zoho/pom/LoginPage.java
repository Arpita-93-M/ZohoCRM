package com.zoho.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="userName")
	private WebElement unTbx;
	
	@FindBy(id="passWord")
	private WebElement pwTbx;
	
	@FindBy(xpath="//input[@type='image']")
	private WebElement saveBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUnTbx() {
		return unTbx;
	}

	public WebElement getPwTbx() {
		return pwTbx;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

}