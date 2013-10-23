package productive.forms.home;

import org.openqa.selenium.By;
import productive.forms.MenuForm;

/**
 * Give us feedback page
 */
public class FeedbackForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public FeedbackForm() {
		super(By.name("other_feedback"), "Survey");
	}


}
