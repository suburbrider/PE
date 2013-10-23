package productive.forms.home;

import org.openqa.selenium.By;
import productive.forms.MenuForm;
import productive.forms.geteducated.GetEducatedOverviewForm;
import productive.forms.gethealthy.GetHealthyOverviewForm;
import productive.forms.getrewarded.GetRewardedOverviewForm;
import productive.forms.myprofile.OverviewForm;
import webdriver.elements.Link;

/**
 * Site Overview page
 */
public class SiteOverviewForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public SiteOverviewForm() {
		super(By.xpath("//div[@id='breadcrumb'][contains(., 'Home') and contains(., 'Site Overview')]"),
				"Site Overview Page");
	}

	/**
	 * Clicks learnMore
	 * @param part Section
	 * @return one of Menu forms
	 */
	public MenuForm learnMore(final Sections part) {
		String locator = "//p[contains(@class, 'header_bucket')][contains(., '%1$s')]/../a[contains(., 'Learn More')]";
		new Link(By.xpath(String.format(locator, part.toString())), part.toString() + " > Learn More").clickAndWait();
		switch (part) {
		case MY_PROFILE:
			return new OverviewForm();
		case GET_EDUCATED:
			return new GetEducatedOverviewForm();
		case GET_REWARDED:
			return new GetRewardedOverviewForm();
		case GET_HEALTHY:
			return new GetHealthyOverviewForm();
		default:
			return null;
		}

	}

	/**
	 * sections on Home Site Overview page
	 */
	public enum Sections {
		MY_PROFILE("My Profile"), GET_HEALTHY("Get Healthy"), GET_EDUCATED("Get Educated"), GET_REWARDED("Get Rewarded");

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
