package testRepository;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import genericUtility.JavaUtiity;
import objectRepository.ContactListPagePom;
import objectRepository.CreateContactPagePom;
import objectRepository.HomePagePom;

public class CreateContact extends BaseClass {
  @Test
  public void createData() throws Exception {
	  JavaUtiity JUTIL=new JavaUtiity();
		int num=JUTIL.getRandomNumber();
		ExcelUtility EUTIL=new ExcelUtility();
	String FNAME=	EUTIL.getDataFromExcel("Contact", 2, 2);
	String LNAME=EUTIL.getDataFromExcel("Contact",2 , 3);
	
	HomePagePom HP=new HomePagePom(driver);
	
	HP.clickContacts();
	ContactListPagePom CLP=new ContactListPagePom(driver);
	CLP.clickCreateContact();
	CreateContactPagePom CCP=new CreateContactPagePom(driver);
	CCP.createContact(FNAME+num, LNAME);
	Thread.sleep(3000);
	
		
  }
}
