package productive.tests.navigation;

import productive.forms.*;
import productive.forms.MainMenu.GetEducatedItems;
import productive.forms.MainMenu.MenuItems;
import productive.forms.geteducated.*;
import productive.forms.geteducated.GetEducatedOverviewForm.Sections;
import productive.tests.base.ProductiveBaseTest;
import webdriver.controller.UserType;
import webdriver.controller.UsersController;
import webdriver.controller.UsersController.User;

/**
 * Navigation in Get Educated module
 */
public class GetEducatedTest extends ProductiveBaseTest {

	private UsersController users = UsersController.getInstance();

	/**
	 * Run method
	 */
	public void runTest() {
		User admin = users.getUserByType(UserType.ADMIN);
		LoginForm loginForm = new LoginForm();

		// 1. Enter valid credentials
		// Click login button
		LogStep();
		loginForm.loginEngagedAccount(admin.getLogin(), admin.getPassword());

		// 2. Go to Get Educated->Overview
		LogStep();
		GetEducatedOverviewForm geo = (GetEducatedOverviewForm) MainMenu.navigateTo(MenuItems.GET_EDUCATED,
				GetEducatedItems.OVERVIEW);
		geo.assertControls(MenuItems.GET_EDUCATED);

		// 3. Click 'Learn more' in Courses section
		LogStep();
		geo.learnMore(Sections.COURSES);
		CoursesForm co = new CoursesForm();
		switchToDefaultContent();
		co.assertControls(MenuItems.GET_EDUCATED);

		// 4. Go to Get Educated->Overview
		// Click 'Learn more' in Conversations section
		LogStep();
		geo = (GetEducatedOverviewForm) MainMenu.navigateTo(MenuItems.GET_EDUCATED, GetEducatedItems.OVERVIEW);
		geo.learnMore(Sections.CONVERSATIONS);
		ConversationsForm conv = new ConversationsForm();
		switchToDefaultContent();
		conv.assertControls(MenuItems.GET_EDUCATED);

		// 5. Go to Get Educated->Overview
		// Click 'Learn more' in Certifications section
		LogStep();
		geo = (GetEducatedOverviewForm) MainMenu.navigateTo(MenuItems.GET_EDUCATED, GetEducatedItems.OVERVIEW);
		geo.learnMore(Sections.CERTIFICATIONS);
		CertificationsForm cert = new CertificationsForm();
		cert.assertControls(MenuItems.GET_EDUCATED);

		// 6. Go to Get Educated->Overview
		// Click 'Learn more' in Campaigns section
		LogStep();
		geo = (GetEducatedOverviewForm) MainMenu.navigateTo(MenuItems.GET_EDUCATED, GetEducatedItems.OVERVIEW);
		geo.learnMore(Sections.CAMPAIGNS);
		CampaignsForm camp = new CampaignsForm();
		switchToDefaultContent();
		camp.assertControls(MenuItems.GET_EDUCATED);

		// 7. Go to Get Educated->Overview
		// Click 'Learn more' in Calculators section
		LogStep();
		geo = (GetEducatedOverviewForm) MainMenu.navigateTo(MenuItems.GET_EDUCATED, GetEducatedItems.OVERVIEW);
		geo.learnMore(Sections.CALCULATORS);
		CalculatorsForm calc = new CalculatorsForm();
		switchToDefaultContent();
		calc.assertControls(MenuItems.GET_EDUCATED);

		// 8. Go to Get Educated->Overview
		// Click 'Learn more' in Health FYI section
		LogStep();
		geo = (GetEducatedOverviewForm) MainMenu.navigateTo(MenuItems.GET_EDUCATED, GetEducatedItems.OVERVIEW);
		geo.learnMore(Sections.HEALTH_FYI);
		HealthFYIForm he = new HealthFYIForm();
		he.assertControls(MenuItems.GET_EDUCATED);

		// 9. Go to Get Educated->Courses
		LogStep();
		co = (CoursesForm) MainMenu.navigateTo(MenuItems.GET_EDUCATED, GetEducatedItems.COURSES);
		co.assertControls(MenuItems.GET_EDUCATED);

		// 10. Go to Get Educated->Campaigns
		LogStep();
		camp = (CampaignsForm) MainMenu.navigateTo(MenuItems.GET_EDUCATED, GetEducatedItems.CAMPAINGS);
		camp.assertControls(MenuItems.GET_EDUCATED);

		// 11. Go to Get Educated->Calculators
		LogStep();
		calc = (CalculatorsForm) MainMenu.navigateTo(MenuItems.GET_EDUCATED, GetEducatedItems.CALCULATORS);
		calc.assertControls(MenuItems.GET_EDUCATED);

		// 12. Go to Get Educated->Conversations
		LogStep();
		conv = (ConversationsForm) MainMenu.navigateTo(MenuItems.GET_EDUCATED, GetEducatedItems.CONVERSATIONS);
		conv.assertControls(MenuItems.GET_EDUCATED);

		// 13. Go to Get Educated->Certifications
		LogStep();
		cert = (CertificationsForm) MainMenu.navigateTo(MenuItems.GET_EDUCATED, GetEducatedItems.CERTIFICATIONS);
		cert.assertControls(MenuItems.GET_EDUCATED);

		// 14. Go to Get Educated->Health FYI
		LogStep();
		he = (HealthFYIForm) MainMenu.navigateTo(MenuItems.GET_EDUCATED, GetEducatedItems.HEALTH_FYI);
		he.assertControls(MenuItems.GET_EDUCATED);

		// 15. Go to Get Educated->Conversations
		LogStep();
		LibraryForm lib = (LibraryForm) MainMenu.navigateTo(MenuItems.GET_EDUCATED, GetEducatedItems.LIBRARY);
		lib.assertControls(MenuItems.GET_EDUCATED);

	}

	@Override
	public boolean shouldAnalys() {
		return false;
	}

	@Override
	public void invokeAnalys(final Throwable exc, final String bodyText) throws Throwable {
	}

}
