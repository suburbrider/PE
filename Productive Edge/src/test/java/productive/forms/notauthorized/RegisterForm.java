package productive.forms.notauthorized;

import org.openqa.selenium.By;

/**
 * Forgot Register page
 *
 */
public class RegisterForm extends NotAuthorizedBaseForm {

	/**
	 * Constructor by default
	 */
	public RegisterForm() {
		super(By.xpath("//h1[contains(.,'Register')]"), "Register page");
	}

}
