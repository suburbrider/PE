package productive.forms.home;

import org.openqa.selenium.By;

import productive.forms.MenuForm;

/**
 * FAQ page
 */
public class FAQForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public FAQForm() {
		super(By.xpath("//div[@id='breadcrumb'][contains(., 'Home') and contains(., 'FAQ')]"), "FAQ Page");
	}

}
