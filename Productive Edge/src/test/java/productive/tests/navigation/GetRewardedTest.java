package productive.tests.navigation;

import productive.forms.LoginForm;
import productive.forms.MainMenu;
import productive.forms.MainMenu.GetRewardedItems;
import productive.forms.MainMenu.MenuItems;
import productive.forms.getrewarded.*;
import productive.forms.getrewarded.GetRewardedOverviewForm.Sections;
import productive.tests.base.ProductiveBaseTest;
import webdriver.controller.UserType;
import webdriver.controller.UsersController;
import webdriver.controller.UsersController.User;

/**
 * Navigation in Get Rewarded module
 */
public class GetRewardedTest extends ProductiveBaseTest {
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

		// 2. Go to Get Rewarded->Overview
		LogStep();
		GetRewardedOverviewForm gro = (GetRewardedOverviewForm) MainMenu.navigateTo(MenuItems.GET_REWARDED,
				GetRewardedItems.OVERVIEW);
		gro.assertControls(MenuItems.GET_REWARDED);

		// 3. Click 'Learn more' in Vitality Squares section
		LogStep();
		gro.learnMore(Sections.VITALITY_SQUARES);
		VitalitySquaresForm vs = new VitalitySquaresForm();
		vs.assertControls(MenuItems.GET_REWARDED);

		// 4. Go to Get Rewarded->Overview
		// Click 'Learn more' in Vitality JackPot section
		LogStep();
		gro = (GetRewardedOverviewForm) MainMenu.navigateTo(MenuItems.GET_REWARDED, GetRewardedItems.OVERVIEW);
		gro.learnMore(Sections.VITALITY_JACKPOT);
		VitalityJackpotForm vj = new VitalityJackpotForm();
		vj.assertControls(MenuItems.GET_REWARDED);

		// 5. Go to Get Rewarded->Overview
		// Click 'Learn more' in Wellness Rebates section
		LogStep();
		gro = (GetRewardedOverviewForm) MainMenu.navigateTo(MenuItems.GET_REWARDED, GetRewardedItems.OVERVIEW);
		gro.learnMore(Sections.WELLNESS_REBATES);
		WellnessRebatesForm wr = new WellnessRebatesForm();
		wr.assertControls(MenuItems.GET_REWARDED);

		// TODO need to handle mall service in new browser instance
		/*
		 * LogStep();
		 * MainMenu.navigateTo(MenuItems.GET_REWARDED, "Overview");
		 * gro.learnMore(Sections.VITALITY_MALL);
		 * browser.selectNewWindow();
		 * VitalityMallForm vm = new VitalityMallForm();
		 */

		// 7. Go to Get Rewarded->Vitality Squares
		LogStep();
		vs = (VitalitySquaresForm) MainMenu.navigateTo(MenuItems.GET_REWARDED, GetRewardedItems.VITALITY_SQUARES);
		vs.assertControls(MenuItems.GET_REWARDED);

		// 8. Go to Get Rewarded->Vitality JackPot
		LogStep();
		vj = (VitalityJackpotForm) MainMenu.navigateTo(MenuItems.GET_REWARDED, GetRewardedItems.VITALITY_JACKPOT);
		vj.assertControls(MenuItems.GET_REWARDED);

		// 9. Go to Get Rewarded->Wellness Rebates
		LogStep();
		wr = (WellnessRebatesForm) MainMenu.navigateTo(MenuItems.GET_REWARDED, GetRewardedItems.WELLNESS_REBATES);
		wr.assertControls(MenuItems.GET_REWARDED);

		// TODO need to handle mall service in new browser instance
		// 10. Go to Get Rewarded->Vitality Mall
		// Vitality Mall is opened in new window
		/*
		 * LogStep();
		 * MainMenu.navigateTo(MenuItems.GET_REWARDED, "Vitality Mall");
		 * browser.selectNewWindow();
		 * VitalityMallForm vm = new VitalityMallForm();
		 */

	}

	@Override
	public boolean shouldAnalys() {
		return false;
	}

	@Override
	public void invokeAnalys(final Throwable exc, final String bodyText) throws Throwable {
	}

}
