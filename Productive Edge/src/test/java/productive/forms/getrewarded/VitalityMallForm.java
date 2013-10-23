package productive.forms.getrewarded;

import org.openqa.selenium.By;
import productive.forms.MenuForm;

/**
 * Vitality Mall page
 */
public class VitalityMallForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public VitalityMallForm() {
		super(By.xpath("//a[contains(.,'Order History')]"), "Vitality Mall page");
	}

}
