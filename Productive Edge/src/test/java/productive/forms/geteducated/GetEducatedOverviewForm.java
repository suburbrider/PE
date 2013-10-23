package productive.forms.geteducated;

import org.openqa.selenium.By;
import productive.forms.MenuForm;
import webdriver.elements.Link;

/**
 * Get Educated Overview page
 */
public class GetEducatedOverviewForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public GetEducatedOverviewForm() {
		super(
				By.xpath("//div[@id='breadcrumb'][contains(., 'Get Educated') and contains(., 'Overview')]"),
				"Get Educated Overview Page");
	}
	/**
	 * Clicks learnMore
	 * @param part link title
	 */
	public void learnMore(final Sections part) {
		String locator = "//p[contains(@class, 'header_bucket')][contains(., '%1$s')]/../a[contains(., 'Learn More')]";
		new Link(By.xpath(String.format(locator, part.toString())), part.toString() + " > Learn More").clickAndWait();
		if (part!=Sections.CERTIFICATIONS && part!=Sections.HEALTH_FYI){
			browser.getDriver().switchTo().frame(0);
		}
	}

	/**
	 *
	 * sections on Get Educated Overview page
	 *
	 */
	public enum Sections {
		COURSES("Courses"), CONVERSATIONS("Conversations"), CERTIFICATIONS("Certifications"), CAMPAIGNS("Campaigns"),
		CALCULATORS("Calculators"), HEALTH_FYI("Health FYI"), LIBRARY("Library");

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
