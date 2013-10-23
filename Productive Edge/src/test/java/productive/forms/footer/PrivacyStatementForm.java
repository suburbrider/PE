package productive.forms.footer;

import org.openqa.selenium.By;
import productive.forms.MenuForm;

/**
 * Vitality Internet Privacy Statement page
 */
public class PrivacyStatementForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public PrivacyStatementForm() {
		super(By.xpath("//h1[contains(., 'Vitality Internet Privacy Statement')]"), "Privacy Statement");
	}

}
