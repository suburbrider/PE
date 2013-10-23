package productive.forms.footer;

import org.openqa.selenium.By;
import productive.forms.MenuForm;

/**
 * Contact Us page
 */
public class ContactUsForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public ContactUsForm() {
		super(By.xpath("//h1[contains(., 'Contact Us')]"), "Contact Us");
	}

}
