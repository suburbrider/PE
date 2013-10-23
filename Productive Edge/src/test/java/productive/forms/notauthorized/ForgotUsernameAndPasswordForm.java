package productive.forms.notauthorized;

import org.openqa.selenium.By;


/**
 * Forgot Username and Password page
 *
 */
public class ForgotUsernameAndPasswordForm extends NotAuthorizedBaseForm {

	/**
	 * Constructor by default
	 */
	public ForgotUsernameAndPasswordForm() {
		super(By.xpath("//h1[contains(., 'Forgot Username And Password')]"), "Forgot Username And Password page");
	}

}
