package productive.forms.geteducated;

import org.openqa.selenium.By;

import productive.forms.MenuForm;
/**
 *Courses page
 *
 */
public class CoursesForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public CoursesForm() {
		super(By.xpath("//*[@id='left_navigation']/a[@class='tier1 selected' and contains(.,'COURSES')]"),
				"Courses Page");
	}

}
