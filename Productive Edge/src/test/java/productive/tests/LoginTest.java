package productive.tests;

import productive.forms.*;
import productive.tests.base.ProductiveBaseTest;
import webdriver.controller.*;
import webdriver.controller.UsersController.User;

/**
 * Opening main page
 */
public class LoginTest extends ProductiveBaseTest {

	private UsersController users = UsersController.getInstance();

	/**
	 * Running test
	 */
	public void runTest() {
		LoginForm loginForm = new LoginForm();
		User admin = users.getUserByIndex(UserType.ADMIN, 2);

		// 1. Enter valid credentials
		// 2. Click login button
		LogStep();
		WelcomeForm welcomeForm = loginForm.loginNewAccount(admin.getLogin(), admin.getPassword());

		// Take the VHR link is displayed under widget
		// Status bar is displayed
		LogStep();
		welcomeForm.assertIsOpened();
	}

	@Override
	public void invokeAnalys(final Throwable exc, final String bodyText) throws Throwable {
	}

	@Override
	public boolean shouldAnalys() {
		return false;
	}

}
