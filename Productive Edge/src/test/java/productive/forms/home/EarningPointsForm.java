package productive.forms.home;

import org.openqa.selenium.By;

import productive.forms.MenuForm;

/**
 * Earning Points page
 *
 */
public class EarningPointsForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public EarningPointsForm() {
		super(By.xpath("//div[@id='breadcrumb'][contains(., 'Home') and contains(., 'Earning Points')]"),
				"Earning Points Page");
	}

}
