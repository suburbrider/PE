package productive.forms.getrewarded;

import org.openqa.selenium.By;

import productive.forms.MenuForm;
import webdriver.elements.Link;

/**
 * Get Rewarded Overview page
 */
public class GetRewardedOverviewForm extends MenuForm {

	/**
	 * Constructor by default
	 */
	public GetRewardedOverviewForm() {
		super(By.xpath("//div[@id='breadcrumb'][contains(., 'Get Rewarded') and contains(., 'Overview')]"),
				"Get Rewarded Overview page");

	}
	/**
	 * Clicks learnMore
	 * @param part link title
	 */
	public void learnMore(final Sections part) {
		String locator = "//p[contains(@class, 'header_bucket')][contains(., '%1$s')]/../a[contains(., 'Learn More')]";
		new Link(By.xpath(String.format(locator, part.toString())), part.toString() + " > Learn More").clickAndWait();
	}

	/**
	 *
	 * sections on Get Rewarded Overview page
	 *
	 */
	public enum Sections {
		VITALITY_MALL("Vitality Mall"), VITALITY_SQUARES("Vitality Squares"), WELLNESS_REBATES("Wellness Rebates"), VITALITY_JACKPOT("Vitality JackPot");

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
