package productive.forms.myprofile.vhr;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import productive.forms.myprofile.VHRForm;
import productive.framework.elements.CheckBoxExt;
import webdriver.elements.RadioButton;
import webdriver.elements.TextBox;

/**
 * Lifestyle Habits page
 */
public class LifestyleHabitsForm extends VHRForm {

	private RemoteWebDriver driver = browser.getDriver();
	private TextBox txbAlcoholDrinks = new TextBox(By.id("alcohol_inc"), "alcoholic drinks per week");
	private TextBox txbCigarettesPerDay = new TextBox(By.id("how-many-cigarettes"), "Cigarettes on average per day");
	private TextBox txbSmokingMonth = new TextBox(By.id("months_y"), " Smoking months period");
	private TextBox txbSmokingYears = new TextBox(By.id("years_y"), " Smoking years period");
	private String cigarettesLbl = "Cigarettes";
	private String cigarLbl = "Cigar, pipe, or other smoking tobacco";
	private String snuffLbl = "Chewing tobacco, snuff, or other smokeless tobacco";
	private String checkTemplate = "//div[@style[contains(.,'block')]]//label[contains(.,'%s')]//input[@type='checkbox']/..";
	private String sectionTemlate = "//div[p[contains(.,'%s')]]";
	private String radioSectionTemplate = "//div[@class='question requiredMessageTooltipHandler']";

	/**
	 * Constructor by default
	 */
	public LifestyleHabitsForm() {
		super(By.xpath("//h2[contains(.,'Lifestyle')]"), "Lifestyle Habits");

	}

	/**
	 * Gets template for check boxes
	 * @return x-path template
	 */
	private String getCheckbox() {
		return checkTemplate;
	}

	/**
	 * Clicks radio button
	 * @param answer radio button text
	 */
	public void doAnswer(final String answer) {
		new RadioButton(By.xpath(String.format(getRadio(), answer)), answer).click();
	}

	/**
	 * Set check box value
	 * @param label check box title
	 * @param value (true/false)
	 */
	public void checkAnswer(final String label, final String value) {
		new CheckBoxExt(String.format(getCheckbox(), label), label).check(value);
	}

	/**
	 * Fills the step 1
	 * @param doYouSmoke Do you currently use any tobacco products? ( No/ Not currently / Yes)
	 * @param cigarettesUse Do you currently use cigarettes? (true / false)
	 * @param cigarUse Do you currently use cigar, pipe, or other smoking tobacco? (true / false)
	 * @param snuffUse Do you currently use chewing tobacco, snuff, or other smokeless tobacco? (true / false)
	 * @param cigarettesCount Cigarettes on average per day
	 * @param smokeMonths Smoking month period
	 * @param smokeYears Smoking years period
	 * @param smokingHabits Current smoking habits ( no intention of quitting / plan to stop / like to know how to begin
	 *            the process of quitting)
	 */
	public void fillStep1(String doYouSmoke, String cigarettesUse, String cigarUse, String snuffUse,
			String cigarettesCount, String smokeMonths, String smokeYears, String smokingHabits) {
		doAnswer(doYouSmoke);
		if (!doYouSmoke.contains("No")) {
			checkAnswer(cigarettesLbl, cigarettesUse);
			if (cigarettesUse.equals("true")) {
				txbCigarettesPerDay.setText(cigarettesCount);
				txbSmokingMonth.setText(smokeMonths);
				txbSmokingYears.setText(smokeYears);
				if (doYouSmoke.contains("Yes")) {
					doAnswer(smokingHabits);
				}
			}
			checkAnswer(cigarLbl, cigarUse);
			checkAnswer(snuffLbl, snuffUse);
		}
		goNext();
	}

	/**
	 * Fills the step 2
	 * @param doYouDrink Do you drink alcohol? (Yes/No)
	 */
	public void fillStep2(final String doYouDrink) {
		new RadioButton(By.xpath(String.format(sectionTemlate, "Do you drink alcohol?")
				+ String.format(getRadio(), doYouDrink)), String.format("Do you drink alcohol? - '%s'", doYouDrink))
				.clickViaJS();
		if (doYouDrink.equals("Yes")) {
			int size = driver.findElements(By.xpath(radioSectionTemplate)).size();
			for (int i = 1; i <= size; i++) {
				String rnd = new Random().nextBoolean() ? "Yes" : "No";
				new RadioButton(By.xpath("(" + radioSectionTemplate + String.format(getRadio(), rnd)
						+ String.format(")[%s]", i)), rnd).clickViaJS();
			}
		}
		goNext();
	}

	/**
	 * Fills the step 3
	 * @param alcoholCount alcohol Drinks per week
	 * @param alcoholAnswer four or more drinks on one occasion (Never/Once/Two to Four times/Five or more times)
	 * @return PhysicalHealthForm
	 */
	public PhysicalHealthForm fillStep3(final String alcoholCount, final String alcoholAnswer) {
		txbAlcoholDrinks.setText(alcoholCount);
		doAnswer(alcoholAnswer);
		goNext();
		return new PhysicalHealthForm();
	}
}
