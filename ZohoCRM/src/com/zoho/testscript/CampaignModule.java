package com.zoho.testscript;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.zoho.generic.BaseClass;
import com.zoho.generic.Filelib;
import com.zoho.pom.CreateCampaign;
@Listeners(com.zoho.generic.ListenerImplimentation.class)
public class CampaignModule extends BaseClass{
 @Test
 public void testCampaignModule() throws EncryptedDocumentException, IOException {
 Filelib li = new Filelib();
 String cName = li.getExcelData("Campaign Name", 1, 0);
 CreateCampaign cc=new CreateCampaign(driver);
 cc.getCampaignBtn().click();
 cc.getNewCampignBtn().click();
 cc.getCmpnNameTF().sendKeys(cName);
 cc.getSaveBtn().click();
 
 }
}