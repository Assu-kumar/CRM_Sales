package testRepository;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import genericUtility.JavaUtiity;
import objectRepository.CreateLeadPomPage;
import objectRepository.HomePagePom;
import objectRepository.LeadListPagePom;

public class CreateCustmer extends BaseClass{
	
	@Test
	public void createLead() throws Exception {
		JavaUtiity JUTIL=new JavaUtiity();
		int num=JUTIL.getRandomNumber();
	ExcelUtility EUTIL=new ExcelUtility();
	String FNAME=	EUTIL.getDataFromExcel("Lead", 2, 2);
	String LNAME=EUTIL.getDataFromExcel("Lead",2 , 3);
	String CNAME=EUTIL.getDataFromExcel("Lead", 2, 4);
	HomePagePom HP=new HomePagePom(driver);
	HP.clickLeads();
	LeadListPagePom LLP=new LeadListPagePom(driver);
	LLP.clickcreateLeadbutton();
	CreateLeadPomPage CLP=new CreateLeadPomPage(driver);
	CLP.createLead(FNAME+num, LNAME, CNAME);
	
	
	
	
	

}
}