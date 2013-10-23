package productive.forms;

import org.openqa.selenium.By;
import productive.forms.MainMenu.MenuItems;
import productive.forms.footer.ContactUsForm;
import productive.forms.footer.FormsForm;
import productive.forms.footer.PrivacyStatementForm;
import productive.forms.footer.TermsAndConditionsForm;
import productive.forms.home.DashboardForm;
import productive.forms.home.FAQForm;
import productive.forms.myprofile.MyAccountForm;
import webdriver.BaseForm;
import webdriver.elements.*;

/**
 * Menu template page
 */
public class MenuForm extends BaseForm {

	private Link imgLogo = new Link(By.xpath("//img[@alt='Vitality']"), "Vitality logo");
	private Link lnkTermsAndConditions = new Link(By.xpath("//a[contains(., 'Terms & Conditions')]"),
			"Terms & Conditions");
	private Link lnkPrivacyStatement = new Link(By.xpath("//a[contains(., 'Privacy Statement')]"), "Privacy Statement");
	private Link lnkFAQ = new Link(By.xpath("//li[@class='right']/a[contains(., 'FAQ')]"), "FAQ");
	private Link lnkContactUs = new Link(By.xpath("//li[@class='right']/a[contains(., 'Contact Us')]"), "Contact Us");
	private Link lnkIdCard = new Link(By.xpath("//li[@class='right']/a[contains(., 'ID Card')]"), "ID Card");
	private Link lnkForms = new Link(By.xpath("//li[@class='right']/a[contains(., 'Forms')]"), "Forms");

	/**
	 * Base constructor
	 * @param locator By Locator
	 * @param formTitle Form title
	 */
	protected MenuForm(final By locator, final String formTitle) {
		super(locator, formTitle);
	}

	/**
	 * Asserts the main controls
	 * @param item Menu item
	 */
	public void assertControls(final MenuItems item) {
		if (MainMenu.checkSelected(item)) {
			info(item.toString() + " menu is selected");
		} else {
			error(item.toString() + " menu is not selected");
		}
	}

	/**
	 * Opens Dashboard form by clicking on Vitality logo
	 * @return DashboardForm
	 */
	public DashboardForm goDashboard() {
		imgLogo.clickAndWait();
		return new DashboardForm();
	}

	/**
	 * Opens My Account page
	 * @return MyAccountForm Form
	 */
	public MyAccountForm showIdCard() {
		lnkIdCard.clickAndWait();
		return new MyAccountForm();
	}

	/**
	 * Opens Forms page
	 * @return FormsForm Form
	 */
	public FormsForm showForms() {
		lnkForms.clickAndWait();
		return new FormsForm();
	}

	/**
	 * Opens Terms and Conditions page
	 * @return TermsAndConditions Form
	 */
	public TermsAndConditionsForm showTermsAndConditions() {
		lnkTermsAndConditions.clickAndWait();
		return new TermsAndConditionsForm();
	}

	/**
	 * Opens Vitality Internet Privacy Statement page
	 * @return PrivacyStatement Form
	 */
	public PrivacyStatementForm showPrivacyStatement() {
		lnkPrivacyStatement.clickAndWait();
		return new PrivacyStatementForm();
	}

	/**
	 * Opens FAQ Form
	 * @return FAQ Form
	 */
	public FAQForm showFAQ() {
		lnkFAQ.clickAndWait();
		return new FAQForm();
	}

	/**
	 * Opens Contact Us form
	 * @return ContactUs Form
	 */
	public ContactUsForm showContacts() {
		lnkContactUs.clickAndWait();
		return new ContactUsForm();
	}
}
