package objectRepository;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import genericUtility.JavaUtiity;

public class CreateCustumer extends BaseClass{
   @Test
   public void create() throws Exception {
	   JavaUtiity jUTIlJavaUtiity=new JavaUtiity();
	   int num=jUTIlJavaUtiity.getRandomNumber();
	   ExcelUtility Eutil=new ExcelUtility();
	   String fname=Eutil.getDataFromExcel("Lead", 2, 4);
	   HomePagePom hpHomePagePom=new HomePagePom(driver);
	   hpHomePagePom.clickLeads();
	   LeadListPagePom lPagePom=new LeadListPagePom(driver);
	   lPagePom.clickEditBtn();
	   EditLeadPagePom ePagePom=new EditLeadPagePom(driver);
	   ePagePom.clickFirstname();
	   
   }
}
