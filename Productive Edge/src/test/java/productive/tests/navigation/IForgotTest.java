package productive.tests.navigation;

import productive.forms.LoginForm;
import productive.forms.notauthorized.ContactUsForm;
import productive.forms.notauthorized.ForgotPasswordForm;
import productive.forms.notauthorized.ForgotUsernameAndPasswordForm;
import productive.forms.notauthorized.ForgotUsernameForm;
import productive.forms.notauthorized.IForgotMyLoginForm;
import productive.forms.notauthorized.RegisterForm;
import productive.forms.notauthorized.IForgotMyLoginForm.Forgot;
import productive.forms.notauthorized.NotAuthorizedBaseForm.Tabs;
import productive.tests.base.ProductiveBaseTest;

/**
 *
 * Navigation for not authorized user
 *
 */
public class IForgotTest extends ProductiveBaseTest {

	/**
	 * Run method
	 */

	public void runTest() {
		LoginForm loginForm = new LoginForm();

		// Go to I Forgot My Login page
		// Open Home tab
		LogStep();
		IForgotMyLoginForm ifml = loginForm.forgotCredentials();
		ifml.moveTo(Tabs.HOME);
		loginForm = new LoginForm();

		// 2. Go to I Forgot My Login page
		// Open Log in tab
		LogStep();
		ifml = loginForm.forgotCredentials();
		ifml.moveTo(Tabs.LOG_IN);
		loginForm = new LoginForm();

		// 3. Go to I Forgot My Login page
		// Open Register tab
		LogStep();
		ifml = loginForm.forgotCredentials();
		ifml.moveTo(Tabs.REGISTER);
		RegisterForm re = new RegisterForm();

		// 4. Open Contact us tab
		LogStep();
		re.moveTo(Tabs.CONTACT_US);
		ContactUsForm co = new ContactUsForm();

		// 5. Open I Forgot My Login tab
		// Go to I forgot my password page
		LogStep();
		co.moveTo(Tabs.I_FORGOT_MY_LOG_IN);
		ifml = new IForgotMyLoginForm();
		ifml.navigateTo(Forgot.PASSWORD);
		ForgotPasswordForm fp = new ForgotPasswordForm();

		// 6. Open I Forgot My Login tab
		// Go to I forgot my login page
		LogStep();
		fp.moveTo(Tabs.I_FORGOT_MY_LOG_IN);
		ifml = new IForgotMyLoginForm();
		ifml.navigateTo(Forgot.USERNAME);
		ForgotUsernameForm fu = new ForgotUsernameForm();

		// 7. Open I Forgot My Login tab
		// Go to I forgot my username and password page
		LogStep();
		fu.moveTo(Tabs.I_FORGOT_MY_LOG_IN);
		ifml = new IForgotMyLoginForm();
		ifml.navigateTo(Forgot.USERNAME_PASSWORD);
		ForgotUsernameAndPasswordForm fup = new ForgotUsernameAndPasswordForm();

		// 8. Open I Forgot My Login tab
		// Go to Register page
		LogStep();
		fup.moveTo(Tabs.I_FORGOT_MY_LOG_IN);
		ifml = new IForgotMyLoginForm();
		ifml.navigateTo(Forgot.REGISTER);
		re = new RegisterForm();


	}

	@Override
	public boolean shouldAnalys() {
		return false;
	}

	@Override
	public void invokeAnalys(final Throwable exc, final String bodyText) throws Throwable {
	}

}
