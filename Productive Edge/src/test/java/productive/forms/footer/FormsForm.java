package productive.forms.footer;

import org.openqa.selenium.By;
import productive.forms.MenuForm;

/**
 * Forms page
 */
public class FormsForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public FormsForm() {
		super(By.xpath("//div[@class='cnt_help']"), "Forms");
	}

}
