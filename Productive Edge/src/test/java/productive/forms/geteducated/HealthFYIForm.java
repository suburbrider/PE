package productive.forms.geteducated;

import org.openqa.selenium.By;

import productive.forms.MenuForm;

/**
 * Health FYI page
 */
public class HealthFYIForm extends MenuForm {
	/**
	 * Constructor by default
	 */
	public HealthFYIForm() {
		super(
				By.xpath("//div[@class='breadcr clearfx pad_l25'][contains(., 'Get Educated') and contains(., ' Health FYI')]"),
				"Health FYI Page");
	}

}
