package productive.forms.myprofile;

import org.openqa.selenium.By;

import productive.forms.MenuForm;

/**
 * My Points Statement page
 */
public class MyPointsStatementForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public MyPointsStatementForm() {
		super(By.xpath("//div[@id='breadcrumb'][contains(., 'My Profile') and contains(., 'My Points Statement')]"),
				"My Points Statement Page");
	}

}
