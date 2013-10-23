package productive.forms.geteducated;

import org.openqa.selenium.By;

import productive.forms.MenuForm;

/**
 * Calculators page
 */
public class CalculatorsForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public CalculatorsForm() {
		super(By.xpath("//h1[contains(.,'Interactive Tool')]"), "Calculators Page");
	}

}
