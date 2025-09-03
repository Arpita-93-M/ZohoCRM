package com.zoho.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaign {
	@FindBy(linkText="Campaigns")
	private WebElement campaignBtn;
	
	@FindBy(xpath = "//input[@value='New Campaign']")
	private WebElement newCampignBtn;
	
	@FindBy(xpath = "//input[@name='property(Campaign Name)']")
	private WebElement cmpnNameTF;
	
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement saveBtn;
	
    public CreateCampaign(WebDriver driver) {
    PageFactory.initElements(driver, this);
    }

	public WebElement getCampaignBtn() {
		return campaignBtn;
	}

	public WebElement getNewCampignBtn() {
		return newCampignBtn;
	}

	public WebElement getCmpnNameTF() {
		return cmpnNameTF;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
}