package productive.forms.gethealthy;

import org.openqa.selenium.By;
import productive.forms.MenuForm;
import webdriver.elements.Link;

/**
 * Get Healthy Overview page
 */
public class GetHealthyOverviewForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public GetHealthyOverviewForm() {
		super(By.xpath("//div[@id='breadcrumb'][contains(., 'Get Healthy') and contains(., 'Overview')]"),
				"Get Healthy Overview Page");
	}

	/**
	 * Clicks learnMore
	 * @param part Section
	 */
	public void learnMore(final Sections part) {
		String locator = "//p[contains(@class, 'header_bucket')][contains(., '%1$s')]/../a[contains(., 'Learn More')]";
		new Link(By.xpath(String.format(locator, part.toString())), part.toString() + " > Learn More").clickAndWait();
	}

	/**
	 * sections on Get Healthy Overview page
	 */
	public enum Sections {
		HEALTH_LEAVING("Healthy Living"), VITALITY_CHECK("Vitality Check"), MENTALL_WELLBEING("Mental Well-being"), FITNESS_EXERCISES(
				"Fitness & Exercises"), NUTRITION_HEALTH_EATING("Nutrition & Healthy Eating");

		/**
		 * @param value Value
		 */
		private Sections(final String value) {
			text = value;
		}

		private final String text;

		@Override
		public String toString() {
			return text;
		}
	}

}
