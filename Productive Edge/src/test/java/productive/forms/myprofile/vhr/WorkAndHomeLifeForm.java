package productive.forms.myprofile.vhr;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import productive.forms.myprofile.VHRForm;
import productive.framework.elements.Slider;
import webdriver.elements.*;

/**
 * Fitness & Exercise Page
 */
public class WorkAndHomeLifeForm extends VHRForm {

	private Slider slFallingAsleep = new Slider("//div[@id='slider-1']",
			"How often have you had difficulty falling asleep or staying asleep, or feeling poorly rested in the morning");
	private TextBox txbSleepHours = new TextBox(By.id("hours-do-you-get"),
			"How many hours of sleep do you get daily, including naps");
	private Slider slTiredOut = new Slider("//div[@id='tired']", "Tired out for no good reason");
	private Slider slNervous = new Slider("//div[@id='nervous']", "Nervous");
	private Slider slSoNervous = new Slider("//div[@id='nothing']", "So nervous that nothing could calm you down");
	private Slider slHopeless = new Slider("//div[@id='hopeless']", "Hopeless");
	private Slider slRestless = new Slider("//div[@id='restless']", "Restless or fidgety");
	private Slider slSit = new Slider("//div[@id='sit']", "So restless that you could not sit still");
	private Slider slDepressed = new Slider("//div[@id='depressed']", "Depressed");
	private Slider slEffort = new Slider("//div[@id='effort']", "That everything is an effort");
	private Slider slSad = new Slider("//div[@id='sad']", "So sad that nothing could cheer you up");
	private Slider slWorthless = new Slider("//div[@id='worthless']", "Worthless");
	private TextBox txbWorkDays = new TextBox(By.id("work-days-per-week"), "How many hours altogether did you work");
	private TextBox txbWork2Days = new TextBox(By.id("work2-days-per-week"), "How many hours does your employer expect");
	private TextBox txbHealthDays = new TextBox(By.id("health-days-per-week"),
			"How many days did you miss an entire workday ");
	private TextBox txbWorst = new TextBox(By.id("q1"), "The worst job performance");
	private Slider slLevel = new Slider("//div[@id='slider-1']", "What is your highest level of education");
	private String sectionTemplate = "//div[@class='progressive-question']";
	private String txbTemplate = "//input[@type='text']";
	private String lblTemplate = "//p";
	private RemoteWebDriver driver = browser.getDriver();
	private static final int MAX = 10;

	/**
	 * Constructor by default
	 */
	public WorkAndHomeLifeForm() {
		super(By.xpath("//h2[contains(., 'Work and Home Life')]"), "Work and Home Life");
	}

	/**
	 * Fills the step 1
	 * @param sleep How often have you had difficulty falling asleep or staying asleep
	 * @param sleepHours On average, how many hours of sleep do you get daily, including naps
	 */
	public void fillSleepingHabits(String sleep, String sleepHours) {
		slFallingAsleep.selectValue(sleep);
		txbSleepHours.setText(sleepHours);
		goNext();
	}

	/**
	 * Fill the step 2
	 * @param tired Tired out for no good reason
	 * @param nerv Nervous
	 * @param nerv2 So nervous that nothing could calm you down
	 * @param hope Hopeless
	 * @param rest Restless or fidgety
	 * @param sit So restless that you could not sit still
	 * @param depress Depressed
	 * @param effort That everything is an effort
	 * @param sad So sad that nothing could cheer you up
	 * @param worth Worthless
	 */
	public void fillStep2(String tired, String nerv, String nerv2, String hope, String rest, String sit,
			String depress, String effort, String sad, String worth) {
		slTiredOut.selectValue(tired);
		slNervous.selectValue(nerv);
		slSoNervous.selectValue(nerv2);
		slHopeless.selectValue(hope);
		slRestless.selectValue(rest);
		slSit.selectValue(sit);
		slDepressed.selectValue(depress);
		slEffort.selectValue(effort);
		slSad.selectValue(sad);
		slWorthless.selectValue(worth);
		goNext();
	}

	/**
	 * Fills the step 3
	 * @param answer Stress answer
	 */
	public void fillStress(String answer) {
		new RadioButton(By.xpath(String.format(getRadio(), answer)), answer).clickViaJS();
		goNext();
	}

	/**
	 * Fills the step 4
	 * @param workDays Work days per week
	 */
	public void fillStep4(String workDays) {
		txbWorkDays.setText(workDays);
		txbWork2Days.setText(workDays);
		goNext();
	}

	/**
	 * Fills all the text boxes with random values
	 */
	private void fillRandomTextBoxes() {
		int size = driver.findElements(By.xpath(sectionTemplate)).size();
		for (int i = 1; i < size; i++) {
			String rnd = String.valueOf(Math.round(Math.random() * MAX));
			String temp = String.format(sectionTemplate + "[%1$s]", i);
			String lbl = driver.findElementByXPath(temp + lblTemplate).getText();
			TextBox txb = new TextBox(By.xpath(temp + txbTemplate), lbl);
			txb.setText(rnd);
		}
	}

	/**
	 * Fills the step 5
	 */
	public void fillStep5() {
		txbHealthDays.setText(String.valueOf(Math.round(Math.random() * MAX)));
		fillRandomTextBoxes();
		goNext();
	}

	/**
	 * Fills the step 6
	 * @param level What is your highest level of education?
	 * @return LifestyleHabitsForm
	 */
	public LifestyleHabitsForm fillStep6(String level) {
		txbWorst.setText(String.valueOf(Math.round(Math.random() * MAX)));
		fillRandomTextBoxes();
		slLevel.selectValue(level);
		goNext();
		return new LifestyleHabitsForm();
	}
}
