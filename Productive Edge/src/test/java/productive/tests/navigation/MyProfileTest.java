package productive.tests.navigation;

import productive.forms.LoginForm;
import productive.forms.MainMenu;
import productive.forms.MainMenu.*;
import productive.forms.myprofile.*;
import productive.forms.myprofile.OverviewForm.Sections;
import productive.tests.base.ProductiveBaseTest;
import webdriver.controller.UserType;
import webdriver.controller.UsersController;
import webdriver.controller.UsersController.User;

/**
 * Navigation in My Profile module
 */
// TODO test is not completed.
public class MyProfileTest extends ProductiveBaseTest {

	private UsersController users = UsersController.getInstance();

	/**
	 * Run method
	 */

	public void runTest() {
		User admin = users.getUserByType(UserType.ADMIN);
		LoginForm loginForm = new LoginForm();

		// Enter valid credentials
		// Click login button
		loginForm.loginEngagedAccount(admin.getLogin(), admin.getPassword());

		// 1. Go to My Profile->Overview
		LogStep();
		OverviewForm mp = (OverviewForm) MainMenu.navigateTo(MenuItems.MY_PROFILE, MyProfileItems.OVERVIEW);
		mp.assertControls(MenuItems.MY_PROFILE);

		// 2. Click 'Learn more' in Vitality Health Review section
		LogStep();
		mp.learnMore(Sections.VITALITY_HEALTY_REVIEW);
		VHRForm vhr = new VHRForm();
		browser.getDriver().switchTo().defaultContent();
		vhr.assertControls(MenuItems.MY_PROFILE);

		// 3. Go to My Profile->Overview
		// Click 'Learn more' in My Health Results section
		LogStep();
		mp = (OverviewForm) MainMenu.navigateTo(MenuItems.MY_PROFILE, MyProfileItems.OVERVIEW);
		mp.learnMore(Sections.MY_HEALTH_RESULTS);
		MyHealthResultsForm mhr = new MyHealthResultsForm();
		mhr.assertControls(MenuItems.MY_PROFILE);

		// 4. Go to My Profile->Overview
		// Click 'Learn more' in My Account section
		LogStep();
		mp = (OverviewForm) MainMenu.navigateTo(MenuItems.MY_PROFILE, MyProfileItems.OVERVIEW);
		mp.learnMore(Sections.MY_ACCOUNT);
		MyAccountForm ma = new MyAccountForm();
		ma.assertControls(MenuItems.MY_PROFILE);

		// 5. Go to My Profile->Overview
		// Click 'Learn more' in My Points Statement section
		LogStep();
		mp = (OverviewForm) MainMenu.navigateTo(MenuItems.MY_PROFILE, MyProfileItems.OVERVIEW);
		mp.learnMore(Sections.MY_POINTS_STATEMENT);
		MyPointsStatementForm mps = new MyPointsStatementForm();
		mps.assertControls(MenuItems.MY_PROFILE);

		// 6. Go to My Profile->Overview
		// Click 'Learn more' in My Goals section
		LogStep();
		mp = (OverviewForm) MainMenu.navigateTo(MenuItems.MY_PROFILE, MyProfileItems.OVERVIEW);
		mp.learnMore(Sections.MY_GOALS);
		MyGoalsForm mg = new MyGoalsForm();
		mg.assertControls(MenuItems.MY_PROFILE);

		// 7. Go to My Profile->Overview
		// Click 'Learn more' in Kids Health Assessment section
		LogStep();
		mp = (OverviewForm) MainMenu.navigateTo(MenuItems.MY_PROFILE, MyProfileItems.OVERVIEW);
		mp.learnMore(Sections.MY_KIDS_HEALTH_ASSESSMENT);
		KidsHealthAssessmentForm kha = new KidsHealthAssessmentForm();
		kha.assertControls(MenuItems.MY_PROFILE);

		// 8. Go to My Profile->Vitality Health Review
		LogStep();
		MainMenu.navigateTo(MenuItems.MY_PROFILE, MyProfileItems.VITALITY_HEALTH_REVIEW);

		// 9. Go to My Profile->Kids Health Assessment
		LogStep();
		MainMenu.navigateTo(MenuItems.MY_PROFILE, MyProfileItems.KIDS_HEALTH_ASSESSMENT);

		// 10. Go to My Profile->My Health Results
		LogStep();
		MainMenu.navigateTo(MenuItems.MY_PROFILE, MyProfileItems.MY_HEALTH_RESULTS);

		// 11. Go to My Profile->My Points Statement
		LogStep();
		MainMenu.navigateTo(MenuItems.MY_PROFILE, MyProfileItems.MY_POINTS_STATEMENT);

		// 12. Go to My Profile->My Goals
		LogStep();
		MainMenu.navigateTo(MenuItems.MY_PROFILE, MyProfileItems.MY_GOALS);

		// 13. Go to My Profile->My Account
		LogStep();
		MainMenu.navigateTo(MenuItems.MY_PROFILE, MyProfileItems.MY_ACCOUNT);

	}

	@Override
	public boolean shouldAnalys() {
		return false;
	}

	@Override
	public void invokeAnalys(final Throwable exc, final String bodyText) throws Throwable {
	}

}
