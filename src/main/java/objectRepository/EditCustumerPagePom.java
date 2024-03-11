package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustumerPagePom {
     @FindBy(xpath = "//input[@name='firstname']")
     private WebElement editFirstNamElement;

	public WebElement getEditFirstNamElement() {
		return editFirstNamElement;
	}

	public EditCustumerPagePom(WebDriver driver) {
		PageFactory.initElements( driver,this);
		}
     /*
      * Business logic for click on firstname
      */
	 public void clickFirstname() {
		 getEditFirstNamElement().clear();
		 getEditFirstNamElement().sendKeys("name");
}
}