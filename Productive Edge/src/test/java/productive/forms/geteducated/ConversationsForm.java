package productive.forms.geteducated;

import org.openqa.selenium.By;

import productive.forms.MenuForm;

/**
 * Conversations page
 */
public class ConversationsForm extends MenuForm {
	/**
	 * Constructor by default
	 */
	public ConversationsForm() {
		super(By.xpath("//a[@class='tier1 selected'][contains(.,'CONVERSATIONS')]"),
				"Conversations Page");
	}

}
