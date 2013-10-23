package productive.forms.myprofile;

import org.openqa.selenium.By;
import productive.forms.MenuForm;

/**
 * Kids Health Assessment page
 */
public class KidsHealthAssessmentForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public KidsHealthAssessmentForm() {
		super(By.xpath("//div[@class='breadcr clearfx pad_l25'][contains(., 'My Health Profile') and contains(., 'Kids HRA')]"),
				"Kids Health Assessment Page");
	}

}
