package productive.forms.myprofile;

import org.openqa.selenium.By;

import productive.forms.MenuForm;

/**
 * My Goals page
 */
public class MyGoalsForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public MyGoalsForm() {
		super(By.xpath("//div[@class='breadcr clearfx pad_l25'][contains(., 'My Profile') and contains(., 'My Goals')]"), "My Goals Page");
	}

}
