package productive.forms.getrewarded;

import org.openqa.selenium.By;

import productive.forms.MenuForm;

/**
 * Wellness Rebates page
 */
public class WellnessRebatesForm extends MenuForm {

	/**
	 *  Constructor by default
	 */
	public WellnessRebatesForm() {
		super(By.xpath("//div[@id='breadcrumb'][contains(., 'Get Rewarded') and contains(., 'Wellness Rebates')]"),
				"Wellness Rebates page");
	}

}
