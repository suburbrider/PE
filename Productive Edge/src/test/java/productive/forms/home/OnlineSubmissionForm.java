package productive.forms.home;

import org.openqa.selenium.By;

import productive.forms.MenuForm;

/**
 * Online Form Submission page
 */
public class OnlineSubmissionForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public OnlineSubmissionForm() {
		super(
				By.xpath("//div[@id='breadcrumb'][contains(., 'Home') and contains(., 'Online Form Submission')]"),
				"Online Form Submission Page");
	}

}
