package productive.tests.navigation;

import productive.forms.LoginForm;
import productive.forms.MainMenu;
import productive.forms.MainMenu.*;
import productive.forms.gethealthy.*;
import productive.forms.gethealthy.GetHealthyOverviewForm.Sections;
import productive.tests.base.ProductiveBaseTest;
import webdriver.controller.UserType;
import webdriver.controller.UsersController;
import webdriver.controller.UsersController.User;

/**
 * Navigation in Get Healthy module
 */
public class GetHealthyTest extends ProductiveBaseTest {

	private UsersController users = UsersController.getInstance();

	/**
	 * Run method
	 */
	public void runTest() {
		LoginForm loginForm = new LoginForm();
		User admin = users.getUserByType(UserType.ADMIN);

		// 1. Enter valid credentials
		// Click login button
		LogStep();
		loginForm.loginEngagedAccount(admin.getLogin(), admin.getPassword());

		// 2. Go to Get Healthy->Overview
		LogStep();
		GetHealthyOverviewForm gho = (GetHealthyOverviewForm) MainMenu.navigateTo(MenuItems.GET_HEALTHY,
				GetHealthyItems.OVERVIEW);
		gho.assertControls(MenuItems.GET_HEALTHY);

		// 3. Click 'Learn more' in Healthy Living section
		LogStep();
		gho.learnMore(Sections.HEALTH_LEAVING);
		HealthyLivingForm hl = new HealthyLivingForm();
		hl.assertControls(MenuItems.GET_HEALTHY);

		// 4. Go to Get Healthy->Overview
		// Click 'Learn more' in Vitality Check section
		LogStep();
		gho = (GetHealthyOverviewForm) MainMenu.navigateTo(MenuItems.GET_HEALTHY, GetHealthyItems.OVERVIEW);
		gho.learnMore(Sections.VITALITY_CHECK);
		VitalityCheckForm vc = new VitalityCheckForm();
		vc.assertControls(MenuItems.GET_HEALTHY);

		// 5. Go to Get Healthy->Overview
		// Click 'Learn more' in Mental Well-being section
		LogStep();
		gho = (GetHealthyOverviewForm) MainMenu.navigateTo(MenuItems.GET_HEALTHY, GetHealthyItems.OVERVIEW);
		gho.learnMore(Sections.MENTALL_WELLBEING);
		MentalWellBeingForm mwb = new MentalWellBeingForm();
		mwb.assertControls(MenuItems.GET_HEALTHY);

		// 6. Go to Get Healthy->Overview
		// Click 'Learn more' in Fitness & Exercises section
		LogStep();
		gho = (GetHealthyOverviewForm) MainMenu.navigateTo(MenuItems.GET_HEALTHY, GetHealthyItems.OVERVIEW);
		gho.learnMore(Sections.FITNESS_EXERCISES);
		FitnessExerciseForm fi = new FitnessExerciseForm();
		fi.assertControls(MenuItems.GET_HEALTHY);

		// 7. Go to Get Healthy->Overview
		// Click 'Learn more' in Nutrition & Healthy Eating section
		LogStep();
		gho = (GetHealthyOverviewForm) MainMenu.navigateTo(MenuItems.GET_HEALTHY, GetHealthyItems.OVERVIEW);
		gho.learnMore(Sections.NUTRITION_HEALTH_EATING);
		NutritionHealthyEatingForm nte = new NutritionHealthyEatingForm();
		nte.assertControls(MenuItems.GET_HEALTHY);

		// 8. Go to Get Healthy->Healthy Living
		LogStep();
		hl = (HealthyLivingForm) MainMenu.navigateTo(MenuItems.GET_HEALTHY, GetHealthyItems.HEALTHY_LIVING);
		hl.assertControls(MenuItems.GET_HEALTHY);

		// 9. Go to Get Healthy->Vitality Check
		LogStep();
		vc = (VitalityCheckForm) MainMenu.navigateTo(MenuItems.GET_HEALTHY, GetHealthyItems.VITALITY_CHECK);
		vc.assertControls(MenuItems.GET_HEALTHY);

		// 10. Go to Get Healthy->Fitness & Exercises
		LogStep();
		fi = (FitnessExerciseForm) MainMenu.navigateTo(MenuItems.GET_HEALTHY, GetHealthyItems.FITNESS_EXERCISE);
		fi.assertControls(MenuItems.GET_HEALTHY);

		// 11. Go to Get Healthy->Mental Well-being
		LogStep();
		mwb = (MentalWellBeingForm) MainMenu.navigateTo(MenuItems.GET_HEALTHY, GetHealthyItems.MENTAL_WELL_BEING);
		mwb.assertControls(MenuItems.GET_HEALTHY);

		// 12. Go to Get Healthy->Nutrition & Healthy Eating
		LogStep();
		nte = (NutritionHealthyEatingForm) MainMenu.navigateTo(MenuItems.GET_HEALTHY,
				GetHealthyItems.NUTRITION_HEALTHY_EATING);
		nte.assertControls(MenuItems.GET_HEALTHY);
	}

	@Override
	public boolean shouldAnalys() {
		return false;
	}

	@Override
	public void invokeAnalys(final Throwable exc, final String bodyText) throws Throwable {
	}

}
