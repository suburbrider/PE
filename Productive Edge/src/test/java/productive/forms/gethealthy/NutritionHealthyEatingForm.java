package productive.forms.gethealthy;

import org.openqa.selenium.By;

import productive.forms.MenuForm;

/**
 * Nutrition & Healthy Eating page
 */
public class NutritionHealthyEatingForm extends MenuForm {
	/**
	 * Constructor by default
	 */
	public NutritionHealthyEatingForm() {
		super(
				By.xpath("//div[@class='breadcr clearfx pad_l25'][contains(., 'Get Healthy') and contains(., 'Nutrition & Healthy Eating')]"),
				"Nutrition & Healthy Eating Page");
	}

}
