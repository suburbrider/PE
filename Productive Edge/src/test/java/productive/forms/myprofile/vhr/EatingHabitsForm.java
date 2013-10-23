package productive.forms.myprofile.vhr;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import productive.forms.myprofile.VHRForm;
import productive.framework.elements.DropDown;
import productive.framework.elements.Slider;
import webdriver.elements.*;

/**
 * Eating Habits Page
 */
public class EatingHabitsForm extends VHRForm {

	// Text Box
	private TextBox frVgBox = new TextBox(By.id("fruits-vegetables"),
			"How many servings of vegetables and fruit do you eat per day");
	private TextBox whGrBox = new TextBox(By.id("whole-grains"), "How many servings of whole grains do you eat per day");
	// Slider
	private Slider slMeat = new Slider("//div[@id='slider-1']",
			"How often is it lean meats such as skinless chicken, turkey, fish, and lean red meats");
	private Slider slDairy = new Slider("//div[@id='slider-dairy']",
			"How often do you consume low fat or fat-free dairy products");
	private Slider slFats = new Slider("//div[@id='slider-2']", "How often do you add fats");
	private Slider slSalty = new Slider("//div[@id='slider-3']", "How often do you eat salty foods");
	// Dropdown
	private DropDown cbxSalt = new DropDown("//div[@id='uniform-salt-quantity']",
			"how much salt would you say you consume in an average day?");
	// Strings
	private String meatFishTemplate = "//div[@id='meat-or-fish']" + getRadio();
	private String dTpl = "//div[@id='dairy']" + getRadio();
	private String sectionTemplate = "//div[@class='question clearfix']";
	private String txbTemplate = "//input[@type='text']";
	private String chkTemplate = "//div[@class='checker']/span";
	private String lblTemplate = "//p";
	// etc
	private RemoteWebDriver driver = browser.getDriver();
	private static final int MAX = 10;

	/**
	 * Constructor by default
	 */
	public EatingHabitsForm() {
		super(By.xpath("//h2[contains(.,'Eating Habits')]"), "Eating Habits");
	}

	/**
	 * Fill the form at step 1
	 * @param frVg Fresh Vegetables number
	 * @param whGr Whole Grains number
	 * @param mof Meat or Fish yes/no
	 * @param dairy Dairy yes/no
	 * @param meat meat\fish Value
	 * @param dairyP dairy Value
	 */
	public void fillStep1(final String frVg, final String whGr, final String mof, final String dairy,
			final String meat, final String dairyP) {
		frVgBox.setText(frVg);
		whGrBox.setText(whGr);
		String loc = String.format(meatFishTemplate, mof);
		new RadioButton(By.xpath(loc), "Do you eat any meat or fish? " + mof).clickAndWait();
		if (mof.equals("Yes")) {
			slMeat.selectValue(meat);
		}

		loc = String.format(dTpl, dairy);
		new RadioButton(By.xpath(loc), "Do you eat or drink any dairy products? " + dairy).click();
		if (dairy.equals("Yes")) {
			slDairy.selectValue(dairyP);
		}
		goNext();
	}

	/**
	 * Fill the form at step 2
	 * @param fats How often do you add fats
	 * @param saltQty Salt Quantity number
	 * @param saltyFoods How often do you eat salty foods
	 */
	public void fillStep2(String fats, String saltQty, String saltyFoods) {
		slFats.selectValue(fats);
		cbxSalt.selectByValue(saltQty);
		slSalty.selectValue(saltyFoods);
		goNext();
	}

	/**
	 * Fill the form at step 3
	 * @param feelings How do you feel about your current eating habits
	 * @return WorkAndHomeLifeForm
	 */
	public WorkAndHomeLifeForm fillStep3(String feelings) {
		int size = driver.findElements(By.xpath(sectionTemplate + chkTemplate)).size();
		for (int i = 1; i <= size; i++) {
			String rnd = String.valueOf(Math.round(Math.random() * MAX));
			String template = String.format(sectionTemplate + "[%1$s]", i);
			String lbl = driver.findElementByXPath(template + lblTemplate).getText();
			CheckBox chk = new CheckBox(By.xpath(template + chkTemplate), lbl + ": I do not consume on a daily basis");
			if (new Random().nextBoolean()) {
				chk.click();
			}
			TextBox txb = new TextBox(By.xpath(template + txbTemplate), lbl);
			if (txb.isEnabled()) {
				txb.setText(rnd);
			}
		}
		new RadioButton(By.xpath(String.format(getRadio(), feelings)), feelings).click();
		goNext();
		return new WorkAndHomeLifeForm();
	}

}
