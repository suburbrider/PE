package productive.forms.geteducated;

import org.openqa.selenium.By;

import productive.forms.MenuForm;

/**
 * Campaigns page
 */
public class CampaignsForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public CampaignsForm() {
		super(By.xpath("//a[@class='tier1 selected'][contains(.,'CAMPAIGNS')]"),
				"Campaigns Page");
	}

}
