package productive.forms.geteducated;

import org.openqa.selenium.By;

import productive.forms.MenuForm;

/**
 * Certifications page
 */
public class CertificationsForm extends MenuForm {
	/**
	 * Constructor by default
	 */
	public CertificationsForm() {
		super(By.xpath("//div[@class='breadcr clearfx pad_l25'][contains(., 'Get Educated') and contains(., 'Certifications')]"),
				"Certifications Page");

	}

}
