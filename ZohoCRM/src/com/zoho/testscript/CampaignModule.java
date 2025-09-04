package com.zoho.testscript;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Listeners;
import com.zoho.generic.BaseClass;
import com.zoho.generic.Filelib;
import com.zoho.pom.CreateCampaign;
@Listeners(com.zoho.generic.ListenerImplimentation.class)
public class CampaignModule extends BaseClass{
 @Test
 public void testCampaignModule() throws EncryptedDocumentException, IOException, InvalidFormatException {
 Filelib li = new Filelib();
 String cName = li.getExcelData("Campaign Name", 1, 0);
 CreateCampaign cc=new CreateCampaign(driver);
 cc.getCampaignBtn().click();
 cc.getNewCampignBtn().click();
 cc.getCmpnNameTF().sendKeys(cName);
 cc.getSaveBtn().click();
 
 }
}