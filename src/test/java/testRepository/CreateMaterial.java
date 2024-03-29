package testRepository;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import genericUtility.JavaUtiity;
import objectRepository.CreateProductPagePom;
import objectRepository.HomePagePom;
import objectRepository.ProductListPagePom;

public class CreateMaterial extends BaseClass {
	@Test
  public void createProduct() throws Exception {
		JavaUtiity JUTIL=new JavaUtiity();
		int num=JUTIL.getRandomNumber();
	ExcelUtility EUTIL=new ExcelUtility();
	String PdtNAME=	EUTIL.getDataFromExcel("Product", 2, 2);
	
	HomePagePom HP=new HomePagePom(driver);
	HP.clickProduct();
	ProductListPagePom PLP=new ProductListPagePom(driver);
	PLP.clickCreateProduct();
	CreateProductPagePom CPP=new CreateProductPagePom(driver);
	CPP.createProduct(PdtNAME);
	
  }
}
