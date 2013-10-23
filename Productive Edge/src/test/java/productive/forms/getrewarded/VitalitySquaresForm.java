package productive.forms.getrewarded;

import org.openqa.selenium.By;

import productive.forms.MenuForm;

/**
 * Vitality Squares page
 */
public class VitalitySquaresForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public VitalitySquaresForm() {
		super(By.xpath("//div[@id='breadcrumb'][contains(., 'Get Rewarded') and contains(., 'Vitality Squares')]"),
				"Vitality Squares Page");
	}

}
