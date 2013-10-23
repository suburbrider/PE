package productive.forms.myprofile;

import org.openqa.selenium.By;

import productive.forms.MenuForm;

/**
 * My Health Results page
 */
public class MyHealthResultsForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public MyHealthResultsForm() {
		super(
				By.xpath("//div[@id='breadcrumb'][contains(., 'My Profile') and contains(., 'My Health Results')]"),
				"My Health Results Page");
	}

}
