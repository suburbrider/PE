package productive.forms.gethealthy;

import org.openqa.selenium.By;
import productive.forms.MenuForm;

/**
 * Fitness & Exercise page
 */
public class FitnessExerciseForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public FitnessExerciseForm() {
		super(By.xpath("//div[@id='breadcrumb'][contains(., 'Get Healthy') and contains(., 'Fitness & Exercise')]"),
				"Fitness & Exercise Form");
	}

}
