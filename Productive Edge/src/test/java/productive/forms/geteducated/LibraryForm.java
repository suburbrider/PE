package productive.forms.geteducated;

import org.openqa.selenium.By;

import productive.forms.MenuForm;

/**
 * Library page
 */
public class LibraryForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public LibraryForm() {
		super(By.xpath("//a[@class='active'][contains(.,'Alcohol')]"),
				"Library Page");
	}

}
