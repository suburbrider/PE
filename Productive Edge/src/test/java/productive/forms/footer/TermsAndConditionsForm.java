package productive.forms.footer;

import org.openqa.selenium.By;
import productive.forms.MenuForm;

/**
 * Terms and Conditions page
 */
public class TermsAndConditionsForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public TermsAndConditionsForm() {
		super(By.xpath("//h1[contains(., 'Terms and Conditions')]"), "Terms and Conditions");
	}

}
