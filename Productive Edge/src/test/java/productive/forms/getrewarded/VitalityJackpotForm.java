package productive.forms.getrewarded;

import org.openqa.selenium.By;

import productive.forms.MenuForm;

/**
 * Vitality Jackpot page
 */
public class VitalityJackpotForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public VitalityJackpotForm() {
		super(By.xpath("//div[@id='breadcrumb'][contains(., 'Get Rewarded') and contains(., 'Vitality Jackpot')]"),
				"Vitality Jackpot page");
	}

}
