package productive.tests.navigation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import productive.forms.*;
import productive.forms.footer.ContactUsForm;
import productive.forms.footer.FormsForm;
import productive.forms.footer.PrivacyStatementForm;
import productive.forms.footer.TermsAndConditionsForm;
import productive.forms.home.*;
import productive.forms.myprofile.MyAccountForm;
import productive.tests.base.ProductiveParamTest;
import webdriver.controller.*;
import webdriver.controller.UsersController.User;

/**
 * Opening main page
 */
public class DashboardTest extends ProductiveParamTest {

	private UsersController users = UsersController.getInstance();
	private String userName, vitalityId, status;

	/**
	 * Read parameters method
	 * @param user User Name
	 * @param id User Id
	 * @param state User status
	 * @throws Throwable Exception
	 */
	@Test
	@Parameters({ "userName", "vitalityId", "status" })
	private void readparams(final String user, final String id, final String state) throws Throwable {
		userName = user;
		vitalityId = id;
		status = state;
		xTest();
	}

	/**
	 * Run method
	 */
	public void runTest() {
		LoginForm loginForm = new LoginForm();
		User admin = users.getUserByType(UserType.ADMIN);

		// Enter valid credentials
		// Click login button
		DashboardForm dashForm = loginForm.loginEngagedAccount(admin.getLogin(), admin.getPassword());

		// 1. Check User name and Vitality Id
		LogStep();
		dashForm.checkUserNameAndId(userName, vitalityId);

		// 2. Check Vitality Status
		LogStep();
		dashForm.checkVitalityStatus(status);

		// 3. Click "Give us feedback" link
		LogStep();
		FeedbackForm feedBackForm = dashForm.giveUsFeedback();

		// 4. Click Vitality logo
		LogStep();
		dashForm = feedBackForm.goDashboard();

		// 5. Click Terms&Conditions in page footer
		LogStep();
		TermsAndConditionsForm termsForm = dashForm.showTermsAndConditions();

		// 6. Return to Dashboard
		// Click Privacy Statement in page footer
		LogStep();
		dashForm = termsForm.goDashboard();
		PrivacyStatementForm privacyForm = dashForm.showPrivacyStatement();

		// 7. Return to Dashboard
		// Click FAQ in page footer
		LogStep();
		dashForm = privacyForm.goDashboard();
		FAQForm faqForm = dashForm.showFAQ();

		// 8. Return to Dashboard
		// Click Contact Us in page footer
		LogStep();
		dashForm = faqForm.goDashboard();
		ContactUsForm contactForm = dashForm.showContacts();

		// 9. Return to Dashboard
		// Click Id Card in page footer
		LogStep();
		dashForm = contactForm.goDashboard();
		MyAccountForm myAccForm = dashForm.showIdCard();

		// 10. Return to Dashboard
		// Click Forms in page footer
		LogStep();
		dashForm = myAccForm.goDashboard();
		dashForm.showForms();
		new FormsForm();
	}

	@Override
	public void invokeAnalys(final Throwable exc, final String bodyText) throws Throwable {
	}

	@Override
	public boolean shouldAnalys() {
		return false;
	}

}
