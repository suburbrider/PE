package productive.forms;

import org.openqa.selenium.By;
import productive.forms.home.DashboardForm;
import productive.forms.notauthorized.IForgotMyLoginForm;
import webdriver.BaseForm;
import webdriver.elements.*;

/**
 * login page
 */
public class LoginForm extends BaseForm {

	private final TextBox txbLogin = new TextBox(By.id("inputUsername"), "Username");
	private final TextBox txbPassword = new TextBox(By.id("inputPassword"), "Username");
	private final Button btnLogin = new Button(By.id("loginButton"), "Login");
	private final Link lnkForgot = new Link(By.linkText("forgot my username or password"), "forgot my username or password");

	/**
	 * Constructor by default
	 */
	public LoginForm() {
		super(By.id("inputUsername"), "Login Page");
	}

	/**
	 * Performs login action
	 * @param user User name
	 * @param pwd User password
	 */
	public void doLogin(final String user, final String pwd) {
		txbLogin.setText(user);
		txbPassword.setText(pwd);
		btnLogin.clickAndWait();

	}

	/**
	 * Performs login action for new accounts
	 * @param user User Login
	 * @param pwd User Password
	 * @return Welcome Form
	 */
	public WelcomeForm loginNewAccount(final String user, final String pwd) {
		doLogin(user, pwd);
		return new WelcomeForm();
	}

	/**
	 * Performs login action for new engaged accounts
	 * @param user User Login
	 * @param pwd User Password
	 * @return Dashboard Form
	 */
	public DashboardForm loginEngagedAccount(final String user, final String pwd) {
		doLogin(user, pwd);
		return new DashboardForm();
	}

	/**
	 * Opens I Forgot My Log in page
	 * @return IForgotMyLogin Form
	 */
	public IForgotMyLoginForm forgotCredentials(){
		lnkForgot.clickAndWait();
		return new IForgotMyLoginForm();
	}
}
