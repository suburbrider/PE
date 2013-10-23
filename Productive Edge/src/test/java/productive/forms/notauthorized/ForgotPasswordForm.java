package productive.forms.notauthorized;

import org.openqa.selenium.By;

/**
 * Forgot Password page
 *
 */
public class ForgotPasswordForm extends NotAuthorizedBaseForm {

	/**
	 * Constructor by default
	 */
	public ForgotPasswordForm() {
		super(By.xpath("//h1[contains(., 'Forgot Password')]"), "Forgot Password page");
	}

}
