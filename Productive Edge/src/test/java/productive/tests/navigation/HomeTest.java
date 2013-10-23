package productive.tests.navigation;

import productive.forms.*;
import productive.forms.MainMenu.*;
import productive.forms.home.*;
import productive.forms.home.SiteOverviewForm.Sections;
import productive.tests.base.ProductiveBaseTest;
import webdriver.controller.*;
import webdriver.controller.UsersController.User;

/**
 * Opening main page
 */
public class HomeTest extends ProductiveBaseTest {

	private UsersController users = UsersController.getInstance();

	/**
	 * Run method
	 */
	public void runTest() {
		LoginForm loginForm = new LoginForm();
		User admin = users.getUserByType(UserType.ADMIN);

		// Enter valid credentials
		// Click login button
		loginForm.loginEngagedAccount(admin.getLogin(), admin.getPassword());

		// 1. Go to Home->Site Overview
		LogStep();
		SiteOverviewForm siteOverView = (SiteOverviewForm) MainMenu.navigateTo(MenuItems.HOME, HomeItems.SITE_OVERVIEW);

		// 2. Click 'Learn more' in My Profile section
		LogStep();
		siteOverView.learnMore(Sections.MY_PROFILE);

		// 3. Go to Home->Site Overview
		// Click 'Learn more' in Get Healthy section
		LogStep();
		MainMenu.navigateTo(MenuItems.HOME, HomeItems.SITE_OVERVIEW);
		siteOverView.learnMore(Sections.GET_HEALTHY);

		// 4. Go to Home->Site Overview
		// Click 'Learn more' in Get Educated section
		LogStep();
		MainMenu.navigateTo(MenuItems.HOME, HomeItems.SITE_OVERVIEW);
		siteOverView.learnMore(Sections.GET_EDUCATED);

		// 5. Go to Home->Site Overview
		// Click 'Learn more' in Get Rewarded section
		LogStep();
		MainMenu.navigateTo(MenuItems.HOME, HomeItems.SITE_OVERVIEW);
		siteOverView.learnMore(Sections.GET_REWARDED);

		// 6. Go to Home->Earning Points
		LogStep();
		MainMenu.navigateTo(MenuItems.HOME, HomeItems.EARNING_POINTS);

		// 7. Go to Home->Online Form Submission
		LogStep();
		MainMenu.navigateTo(MenuItems.HOME, HomeItems.FORM_SUBMISSION);

		// 8.Go to Home->FAQ
		LogStep();
		MainMenu.navigateTo(MenuItems.HOME, HomeItems.FAQ);
	}

	@Override
	public void invokeAnalys(final Throwable exc, final String bodyText) throws Throwable {
	}

	@Override
	public boolean shouldAnalys() {
		return false;
	}

}
