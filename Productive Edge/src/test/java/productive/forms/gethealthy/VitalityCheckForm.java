package productive.forms.gethealthy;

import org.openqa.selenium.By;

import productive.forms.MenuForm;

/**
 * Vitality Check page
 */
public class VitalityCheckForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public VitalityCheckForm() {
		super(
				By.xpath("//div[@id='breadcrumb'][contains(., 'Get Healthy') and contains(., 'Vitality Check')]"),
				"Vitality Check Page");
	}

}
