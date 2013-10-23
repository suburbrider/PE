package productive.forms.myprofile;

import org.openqa.selenium.By;

import productive.forms.MenuForm;

/**
 * Account page
 */
public class MyAccountForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public MyAccountForm() {
		super(By.xpath("//div[@id='breadcrumb'][contains(., 'My Profile') and contains(., 'My Account')]"),
				"My Account Page");
	}

}
