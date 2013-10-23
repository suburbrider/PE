package productive.forms.gethealthy;

import org.openqa.selenium.By;

import productive.forms.MenuForm;

/**
 * Mental Well-being page
 */
public class MentalWellBeingForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public MentalWellBeingForm() {
		super(By.xpath("//div[@class='breadcr clearfx pad_l25'][contains(., 'Get Healthy') and contains(., 'Mental Well-being')]"),
				"Healthy Living Page");
	}

}
