package productive.forms.home;

import org.openqa.selenium.By;
import productive.forms.MenuForm;
import webdriver.elements.*;

/**
 * Dashboard page
 */
public class DashboardForm extends MenuForm {

	private Label userGreet = new Label(By.className("user_greet"), "User greeting");
	private Label userId = new Label(By.className("user_vid"), "User id");
	private Label userPoints = new Label(By.id("points_val"), "Points");
	private Link lnkGiveFeedback = new Link(By.xpath("//a[contains(., 'Give Us')]"), "Give Us Feedback");

	/**
	 * Constructor by default
	 */
	public DashboardForm() {
		super(By.xpath("//div[@class='caption5' and contains(., 'My Vitality')]"), "Home Dashboard");
	}

	/**
	 * Check if the user name and id are correct
	 * @param name User's name
	 * @param id User's Vitality ID
	 */
	public void checkUserNameAndId(final String name, final String id) {
		String actualValue = userGreet.getText();
		assertEquals("User Name is incorrect", name, actualValue.replace("Hi, ", ""));
		info("User name is correct: " + name);
		actualValue = userId.getText();
		assertEquals("User Id is incorrect", id, actualValue);
		info("User id is correct: " + id);
	}

	/**
	 * Check if Vitality status is correct
	 * @param status Status to check
	 */
	public void checkVitalityStatus(final String status) {
		assertEquals("Vitality status is incorrect", status, userPoints.getText().trim());
		info("Vitality status is correct: " + status);
	}

	/**
	 * Goes to the feedback form
	 * @return Feedback Form
	 */
	public FeedbackForm giveUsFeedback() {
		lnkGiveFeedback.clickAndWait();
		return new FeedbackForm();
	}
}
