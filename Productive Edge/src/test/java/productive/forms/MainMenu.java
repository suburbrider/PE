package productive.forms;

import org.openqa.selenium.By;
import productive.forms.geteducated.*;
import productive.forms.gethealthy.*;
import productive.forms.getrewarded.*;
import productive.forms.home.*;
import productive.forms.myprofile.*;
import webdriver.BaseEntity;
import webdriver.elements.Link;

/**
 * Common class implements all page with header and footer
 */
public class MainMenu extends BaseEntity {

	private static final String HOME_ID = "home";
	private static final String MY_PROFILE_ID = "profile";
	private static final String GET_HEALTHY_ID = "healthy";
	private static final String GET_EDUCATED_ID = "educated";
	private static final String GET_REWARDED_ID = "rewarded";

	@Override
	protected String formatLogMsg(final String message) {
		return null;
	}

	/**
	 * Navigates to the given Tab
	 * @param menu Menu Top item
	 * @param item Menu sub item
	 * @return one of Menu Forms
	 */
	public static MenuForm navigateTo(final MenuItems menu, final Items item) {
		switch (menu) {
		case HOME:
			new Link(By.id(HOME_ID), "Home").moveMouseToElement();
			new Link(By.partialLinkText(item.toString()), item.toString()).clickExtAndWait();
			switch ((HomeItems) item) {
			case SITE_OVERVIEW:
				return new SiteOverviewForm();
			case EARNING_POINTS:
				return new EarningPointsForm();
			case FAQ:
				return new FAQForm();
			case FORM_SUBMISSION:
				return new OnlineSubmissionForm();
			default:
				return null;
			}
		case MY_PROFILE:
			new Link(By.id(MY_PROFILE_ID), "My Profile").moveMouseToElement();
			new Link(By.partialLinkText(item.toString()), item.toString()).clickExtAndWait();
			switch ((MyProfileItems) item) {
			case KIDS_HEALTH_ASSESSMENT:
				return new KidsHealthAssessmentForm();
			case MY_ACCOUNT:
				return new MyAccountForm();
			case MY_GOALS:
				return new MyGoalsForm();
			case MY_HEALTH_RESULTS:
				return new MyHealthResultsForm();
			case MY_POINTS_STATEMENT:
				return new MyPointsStatementForm();
			case OVERVIEW:
				return new OverviewForm();
			case VITALITY_HEALTH_REVIEW:
				return new VHRForm();
			default:
				break;
			}
		case GET_HEALTHY:
			new Link(By.id(GET_HEALTHY_ID), "Get Healthy").moveMouseToElement();
			new Link(By.partialLinkText(item.toString()), item.toString()).clickExtAndWait();
			switch ((GetHealthyItems) item) {
			case FITNESS_EXERCISE:
				return new FitnessExerciseForm();
			case HEALTHY_LIVING:
				return new HealthyLivingForm();
			case MENTAL_WELL_BEING:
				return new MentalWellBeingForm();
			case NUTRITION_HEALTHY_EATING:
				return new NutritionHealthyEatingForm();
			case OVERVIEW:
				return new GetHealthyOverviewForm();
			case VITALITY_CHECK:
				return new VitalityCheckForm();
			default:
				return null;
			}
		case GET_EDUCATED:
			new Link(By.id(GET_EDUCATED_ID), "Get Educated").moveMouseToElement();
			new Link(By.partialLinkText(item.toString()), item.toString()).clickExtAndWait();
			switch ((GetEducatedItems) item) {
			case OVERVIEW:
				return new GetEducatedOverviewForm();
			case CALCULATORS:
				browser.getDriver().switchTo().frame(0);
				CalculatorsForm calc = new CalculatorsForm();
				browser.getDriver().switchTo().defaultContent();
				return calc;
			case CAMPAINGS:
				browser.getDriver().switchTo().frame(0);
				CampaignsForm camp = new CampaignsForm();
				browser.getDriver().switchTo().defaultContent();
				return camp;
			case CERTIFICATIONS:
				return new CertificationsForm();
			case CONVERSATIONS:
				browser.getDriver().switchTo().frame(0);
				ConversationsForm conv = new ConversationsForm();
				browser.getDriver().switchTo().defaultContent();
				return conv;
			case COURSES:
				browser.getDriver().switchTo().frame(0);
				CoursesForm co = new CoursesForm();
				browser.getDriver().switchTo().defaultContent();
				return co;
			case HEALTH_FYI:
				return new HealthFYIForm();
			case LIBRARY:
				browser.getDriver().switchTo().frame(0);
				LibraryForm lib = new LibraryForm();
				browser.getDriver().switchTo().defaultContent();
				return lib;
			default:
				return null;
			}
		case GET_REWARDED:
			new Link(By.id(GET_REWARDED_ID), "Get Rewarded").moveMouseToElement();
			new Link(By.partialLinkText(item.toString()), item.toString()).clickExtAndWait();

			switch ((GetRewardedItems) item) {
			case OVERVIEW:
				return new GetRewardedOverviewForm();
			case VITALITY_JACKPOT:
				return new VitalityJackpotForm();
			case VITALITY_SQUARES:
				return new VitalitySquaresForm();
			case WELLNESS_REBATES:
				return new WellnessRebatesForm();
			case VITALITY_MALL:
				return new VitalityMallForm();
			default:
				return null;
			}
		default:
			return null;
		}
	}

	/**
	 * @param menu Menu item
	 * @return boolean value, is tab selected
	 */
	public static boolean checkSelected(final MenuItems menu) {
		String classname;
		switch (menu) {
		case HOME:
			classname = new Link(By.id(HOME_ID), "Home").getAttribute("class");
			break;
		case MY_PROFILE:
			classname = new Link(By.id(MY_PROFILE_ID), "My Profile").getAttribute("class");
			break;
		case GET_HEALTHY:
			classname = new Link(By.id(GET_HEALTHY_ID), "Get Healthy").getAttribute("class");
			break;
		case GET_EDUCATED:
			classname = new Link(By.id(GET_EDUCATED_ID), "Get Educated").getAttribute("class");
			break;
		case GET_REWARDED:
			classname = new Link(By.id(GET_REWARDED_ID), "Get Rewarded").getAttribute("class");
			break;
		default:
			classname = "";
		}
		return classname.contains("selected");
	}

	/**
	 * Menu items list
	 */
	public enum MenuItems {
		HOME("Home"), MY_PROFILE("My Profile"), GET_HEALTHY("Get Healthy"), GET_EDUCATED("Get Educated"), GET_REWARDED(
				"Get Rewarded");

		/**
		 * @param value value
		 */
		private MenuItems(final String value) {
			text = value;
		}

		private final String text;

		@Override
		public String toString() {
			return text;
		}
	}

	/**
	 * Common interface for menu items
	 */
	interface Items {
	}

	/**
	 * Home menu items list
	 */
	public enum HomeItems implements Items {
		SITE_OVERVIEW("Site Overview"), EARNING_POINTS("Earning Points"), FORM_SUBMISSION("Online Form Submission"), FAQ(
				"FAQ");

		/**
		 * @param value value
		 */
		private HomeItems(final String value) {
			text = value;
		}

		private final String text;

		@Override
		public String toString() {
			return text;
		}
	}

	/**
	 * Get Educated menu items list
	 */
	public enum GetEducatedItems implements Items {
		OVERVIEW("Overview"), COURSES("Courses"), CAMPAINGS("Campaigns"), CALCULATORS("Calculators"), CONVERSATIONS(
				"Conversations"), CERTIFICATIONS("Certifications"), HEALTH_FYI("Health FYI"), LIBRARY("Library");

		/**
		 * @param value value
		 */
		private GetEducatedItems(final String value) {
			text = value;
		}

		private final String text;

		@Override
		public String toString() {
			return text;
		}
	}

	/**
	 * Get Healthy menu items list
	 */
	public enum GetHealthyItems implements Items {
		OVERVIEW("Overview"), HEALTHY_LIVING("Healthy Living"), VITALITY_CHECK("Vitality Check"), FITNESS_EXERCISE(
				"Fitness & Exercise"), MENTAL_WELL_BEING("Mental Well-being"), NUTRITION_HEALTHY_EATING(
				"Nutrition & Healthy Eating");

		/**
		 * @param value value
		 */
		private GetHealthyItems(final String value) {
			text = value;
		}

		private final String text;

		@Override
		public String toString() {
			return text;
		}
	}

	/**
	 * Get Rewarded menu items list
	 */
	public enum GetRewardedItems implements Items {
		OVERVIEW("Overview"), VITALITY_SQUARES("Vitality Squares"), VITALITY_MALL("Vitality Mall"), VITALITY_JACKPOT(
				"Vitality Jackpot"), WELLNESS_REBATES("Wellness Rebates");

		/**
		 * @param value value
		 */
		private GetRewardedItems(final String value) {
			text = value;
		}

		private final String text;

		@Override
		public String toString() {
			return text;
		}
	}

	/**
	 * My Profile menu items list
	 */
	public enum MyProfileItems implements Items {
		OVERVIEW("Overview"), VITALITY_HEALTH_REVIEW("Vitality Health Review"), KIDS_HEALTH_ASSESSMENT(
				"Kids Health Assessment"), MY_HEALTH_RESULTS("My Health Results"), MY_POINTS_STATEMENT(
				"My Points Statement"), MY_GOALS("My Goals"), MY_ACCOUNT("My Account");

		/**
		 * @param value value
		 */
		private MyProfileItems(final String value) {
			text = value;
		}

		private final String text;

		@Override
		public String toString() {
			return text;
		}
	}
}
