package productive.forms.myprofile;

import org.openqa.selenium.By;
import productive.forms.MenuForm;
import webdriver.elements.Link;

/**
 * My Profile Overview page
 */
public class OverviewForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public OverviewForm() {
		super(By.xpath("//div[@id='breadcrumb'][contains(., 'My Profile') and contains(., 'Overview')]"),
				"My Profile > Overview Page");
	}

	/**
	 * Clicks learnMore
	 * @param part
	 *            link title
	 */
	public void learnMore(final Sections part) {
		String locator = "//p[contains(@class, 'header_bucket')][contains(., '%1$s')]/../a[contains(., 'Learn More')]";
		new Link(By.xpath(String.format(locator, part.toString())), part.toString() + " > Learn More").clickAndWait();
	}

	/**
	 * sections on My Profile Overview page
	 */
	public enum Sections {
		VITALITY_HEALTY_REVIEW("Vitality Health Review"), MY_POINTS_STATEMENT("My Points Statement"), MY_HEALTH_RESULTS(
				"My Health Results"), MY_ACCOUNT("My Account"), MY_GOALS("My Goals"), MY_KIDS_HEALTH_ASSESSMENT(
				"My Kid");

		/**
		 * @param value value
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
