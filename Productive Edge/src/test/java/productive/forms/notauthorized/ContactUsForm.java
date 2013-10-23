package productive.forms.notauthorized;

import org.openqa.selenium.By;

/**
 * ContactUs page for not not authorized users
 *
 */
public class ContactUsForm extends NotAuthorizedBaseForm {

	/**
	 * Constructor by default
	 */
	public ContactUsForm() {
		super(By.xpath("//h2[contains(.,'Contact Us')]"), "Contact Us page");
	}

}
