package productive.forms.notauthorized;

import org.openqa.selenium.By;

/**
 * Forgot Username page
 *
 */
public class ForgotUsernameForm extends NotAuthorizedBaseForm {

	/**
	 * Constructor by default
	 */
	public ForgotUsernameForm() {
		super(By.xpath("//h1[contains(., 'Forgot Username')]"), "Forgot Username page");
	}

}
