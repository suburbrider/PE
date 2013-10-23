package productive.forms.gethealthy;

import org.openqa.selenium.By;

import productive.forms.MenuForm;

/**
 * Healthy Living page
 */
public class HealthyLivingForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public HealthyLivingForm() {
		super(
				By.xpath("//div[@class='breadcr clearfx pad_l25'][contains(., 'Get Healthy') and contains(., 'Healthy Living')]"),
				"Healthy Living Page");
	}

}
