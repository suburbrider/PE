package productive.forms;

import org.openqa.selenium.By;
import productive.forms.myprofile.VHRForm;
import webdriver.BaseForm;
import webdriver.elements.*;

/**
 * login page
 */
public class WelcomeForm extends BaseForm {

	private Button btnTakeTheVHR = new Button(By.xpath("//img[contains(@src, 'take_vhr')]"), "Take The VHR");
	private Label lblStatusBar = new Label(By.id("status_bar"), "Status Bar");

	/**
	 * Constructor by default
	 */
	public WelcomeForm() {
		super(By.xpath("//h1[contains(., 'Welcome to Vitality!')]"), "Welcome Page");
	}

	/**
	 * Asserts critical controls on the page
	 */
	public void assertIsOpened() {
		btnTakeTheVHR.assertIsPresent();
		info("Take the VHR link is displayed");
		lblStatusBar.assertIsPresent();
		info("Status bar is displayed");
	}

	/**
	 * Opens My Profile page
	 * @return VHRForm
	 */
	public VHRForm goHome() {
		btnTakeTheVHR.clickAndWait();
		return new VHRForm();
	}
}
