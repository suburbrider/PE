package productive.forms.myprofile.vhr;

import java.util.Random;
import org.openqa.selenium.By;
import productive.forms.myprofile.VHRForm;
import productive.framework.elements.CheckBoxExt;
import webdriver.elements.Button;
import webdriver.elements.RadioButton;
import webdriver.elements.TextBox;

/**
 * Physical Health page
 */
public class PhysicalHealthForm extends VHRForm {

	/**
	 * Constructor by default
	 */
	public PhysicalHealthForm() {
		super(By.xpath("//h2[contains(., 'Physical Health')]"), "Physical Health");
	}

	private CheckBoxExt chbAllergies = new CheckBoxExt("//*[@id='uniform-MedicalHistoryAllergies']/span", "Allergies");
	private CheckBoxExt chbArthritis = new CheckBoxExt("//*[@id='uniform-MedicalArthritis']/span", "Arthritis");
	private CheckBoxExt chbAsthma = new CheckBoxExt("//*[@id='uniform-MedicalAsthma']/span", "Asthma");
	private CheckBoxExt chbBackPain = new CheckBoxExt("//*[@id='uniform-MedicalHistoryBackPain']/span", "BackPain");
	private CheckBoxExt chbCancer = new CheckBoxExt("//*[@id='uniform-MedicalCancer']/span", "Cancer");
	private CheckBoxExt chbChLungDisease = new CheckBoxExt("//*[@id='uniform-MedicalChronicLungDisease']/span",
			"ChronicLungDisease");
	private CheckBoxExt chbChrPain = new CheckBoxExt("//*[@id='uniform-MedicalHistoryChronicPain']/span", "ChronicPain");
	private CheckBoxExt chbDepression = new CheckBoxExt("//*[@id='uniform-MentalHealthDepression']/span", "Depression");
	private CheckBoxExt chbDiabetes = new CheckBoxExt("//*[@id='uniform-MedicalDiabetes']/span", "Diabetes");
	private CheckBoxExt chbHeartBurnRefl = new CheckBoxExt("//*[@id='uniform-MedicalHistoryHeartBurnReflux']/span",
			"Heartburn or acxpath reflux");
	private CheckBoxExt chbHeartDisease = new CheckBoxExt("//*[@id='uniform-MedicalHeartDisease']/span", "HeartDisease");
	private CheckBoxExt chbHypertension = new CheckBoxExt("//*[@id='uniform-MedicalHypertension']/span",
			"High blood pressure");
	private CheckBoxExt chbCholHigh = new CheckBoxExt("//*[@id='uniform-MedicalCholesterolHigh']/span",
			"High Cholesterol");
	private CheckBoxExt chbMigraine = new CheckBoxExt("//*[@id='uniform-MedicalMigraine']/span", "Migraine headaches");
	private CheckBoxExt chbOsteoporosis = new CheckBoxExt(
			"//*[@id='uniform-MedicalBoneDensityConditionOsteoporosis']/span", "Osteoporosis");
	private CheckBoxExt chbSleepDisorder = new CheckBoxExt("//*[@id='uniform-MedicalSleepDisorder']/span",
			"Sleep disorder");
	private CheckBoxExt chbStroke = new CheckBoxExt("//*[@id='uniform-MedicalStroke']/span", "Stroke");
	private CheckBoxExt chbThyroid = new CheckBoxExt("//*[@id='uniform-MedicalHistoryThyroid']/span", "Thyroid disease");
	private TextBox txbFeet = new TextBox(By.id("feet"), "What is your height? Feet");
	private TextBox txbInches = new TextBox(By.id("inches"), "What is your height? Inches");
	private TextBox txbPounds = new TextBox(By.id("pounds"), "What is your current weight?");
	private TextBox txbWaist = new TextBox(By.id("ninches"), "What is the measurement of your natural waist?");
	private CheckBoxExt chbNotSure = new CheckBoxExt("//*[@id='uniform-sure-known']/span", "I’m not sure ");
	private static final String KNOW = "Know";
	private static final String KNOWN = "known";
	private Button btnFinish = new Button(By.id("nextButton"), "Finish");
	private TextBox txbmmHg1 = new TextBox(By.id("systolicInput"), "What was your last blood pressure reading?");
	private TextBox txbmmHg2 = new TextBox(By.id("diastolicInput"), "What was your last blood pressure reading?");
	private TextBox txbmgDL = new TextBox(By.id("glucoseInput"), "What is your fasting blood glucose level?");
	private String bloodPressureTemplate = "//*[@id='uniform-bloodPressure%1$s']/span"; // (Know/DontKnow)
	private String glucoseTemplate = ".//*[@id='uniform-randomGlucose%1$s']/span"; // (Know/DontKnow)
	private String bloodLevelTemplate = "//input[@class='bloodPressureRangeClass' and @value='%1$s']/.."; // (High/Normal/Low/DontKnow)
	private String glucoseLevelTemplate = "//input[@class='randomGlucoseRangeClass' and @value='%1$s']/.."; // (High/Normal/Low/DontKnow)
	private TextBox txbCholesterol = new TextBox(By.id("cholesterol-level-input"),
			"What is your total cholesterol level?");
	private TextBox txbLowLipoprotein = new TextBox(By.id("blood-glucose-level-input2"),
			"What is your low-density lipoprotein level?");
	private TextBox txbHighLipoprotein = new TextBox(By.id("blood-glucose-level-input3"),
			"What is your high-density lipoprotein level?");
	private TextBox txbTriglyceride = new TextBox(By.id("blood-glucose-level-input4"),
			"What is your triglyceride level?");
	private TextBox txbHbA1c = new TextBox(By.id("blood-glucose-level-input5"), "What is your HbA1c level?");
	private String knowCholesterolTemplate = "//*[@id='uniform-cholesterol-level-%1$s']/span"; // known, unknown
	private String cholesterolLevelTemplate = "//input[@class='cholesterolRangeClass' and @value='%1$s']/.."; // (High/Normal/Low/DontKnow)
	private String lipoproteinTemplate = "//*[@id='uniform-lipoprotein-level-%1$s']/span"; // known, unknown
	private String hlipoproteinTemplate = "//*[@id='uniform-hlipoprotein-level-%1$s']/span"; // known, unknown
	private String triglycerideTemplate = "//*[@id='uniform-triglyceride-level-%1$s']/span"; // known, unknown
	private String hbA1cTemplate = "//*[@id='uniform-HbA1c-level-%1$s']/span"; // known, unknown
	private String qGroupTemplate = "(//div[@class='progressive-question']//div[@id='%1$s']/ancestor::div/div[@class='question-group follow-up']//div[@class='label-input-wrapper radio']//span[input[@value[contains(.,'Type')]]])[%2$s]";

	/**
	 * Fills the step 1
	 */
	public void fillStep1() {

		chbAllergies.checkRandomExt();
		chbArthritis.checkRandomExt();
		chbAsthma.checkRandomExt();
		chbBackPain.checkRandomExt();
		chbCancer.checkRandomExt();
		chbChLungDisease.checkRandomExt();
		chbChrPain.checkRandomExt();
		chbDepression.checkRandomExt();
		String answer = new Random().nextBoolean() ? "1" : "2";
		if (chbDiabetes.checkRandomExt()) {
			new RadioButton(By.xpath(String.format(qGroupTemplate, chbDiabetes.getParentID(), answer)),
					String.format("What type of diabetes do you have?")).click();
		}
		chbHeartBurnRefl.checkRandomExt();
		chbHeartDisease.checkRandomExt();
		chbHypertension.checkRandomExt();
		chbCholHigh.checkRandomExt();
		chbMigraine.checkRandomExt();
		chbOsteoporosis.checkRandomExt();
		chbSleepDisorder.checkRandomExt();
		chbStroke.checkRandomExt();
		chbThyroid.checkRandomExt();
		goNext();

	}

	/**
	 * Fills the step 2
	 * @param feet feet height
	 * @param inches inches height
	 * @param pounds pounds weight
	 * @param ninches inches waist
	 * @param waistSure I’m not sure (Yes / No)
	 * @param choice How do you feel about your current weight? ()
	 */
	public void fillStep2(final String feet, final String inches, final String pounds, final String ninches,
			final String waistSure, final String choice) {
		txbFeet.setText(feet);
		txbInches.setText(inches);
		txbPounds.setText(pounds);
		if (waistSure.equals("Yes")) {
			chbNotSure.check();
		} else {
			chbNotSure.uncheck();
			txbWaist.setText(ninches);
		}
		new RadioButton(By.xpath(String.format(getRadio(), choice)), choice).click();
		goNext();
	}

	/**
	 * Fills the step 3
	 * @param knowBlPressure What was your last blood pressure reading? (Know/DontKnow)
	 * @param systolicValue blood pressure mmHg value
	 * @param diastolicValue blood pressure mmHg value
	 * @param blPressureLev Do you know if your blood pressure (High/Normal/Low/DontKnow)
	 * @param knowGlucose What is your fasting blood glucose level? (Know/DontKnow)
	 * @param glucoseValue glucose mg/dL value
	 * @param glucoseLev Do you know if your blood glucose (High/Normal/Low/DontKnow)
	 */
	public void fillStep3(final String knowBlPressure, final String systolicValue, final String diastolicValue,
			final String blPressureLev, final String knowGlucose, final String glucoseValue, final String glucoseLev) {
		if (knowBlPressure.equalsIgnoreCase(KNOW)) {
			new RadioButton(By.xpath(String.format(bloodPressureTemplate, knowBlPressure)),
					"I know my blood pressure and it is").clickViaJS();
			txbmmHg1.setText(systolicValue);
			txbmmHg2.setText(diastolicValue);
		} else {
			new RadioButton(By.xpath(String.format(bloodPressureTemplate, knowBlPressure)), "I'm not sure").clickViaJS();
			new RadioButton(By.xpath(String.format(bloodLevelTemplate, blPressureLev)),
					"Do you know if your blood glucose is").clickViaJS();
		}
		if (knowGlucose.equalsIgnoreCase(KNOW)) {
			new RadioButton(By.xpath(String.format(glucoseTemplate, knowGlucose)),
					"I know my fasting blood glucose level and it is").clickViaJS();
			txbmgDL.setText(glucoseValue);
		} else {
			new RadioButton(By.xpath(String.format(glucoseTemplate, knowGlucose)), "I'm not sure").clickViaJS();
			new RadioButton(By.xpath(String.format(glucoseLevelTemplate, glucoseLev)),
					"Do you know if your blood glucose is").clickViaJS();
		}
		goNext();
	}

	/**
	 * Fills the step 4
	 * @param knowCholesterol Cholesterol (known,unknown)
	 * @param cholesterolValue Cholesterol mg/dL value
	 * @param cholesterolLev Cholesterol Level (High/Normal/Low/DontKnow)
	 * @param knowLowLipoprotein Low Lipoprotein (known,unknown)
	 * @param lowLipoproteinValue Low Lipoprotein mg/dL
	 * @param knowHighLipoprotein HighLipoprotein (known,unknown)
	 * @param highLipoproteinValue HighLipoprotein mg/dL
	 * @param knowTriglyceride Triglyceride (known,unknown)
	 * @param triglycerideValue Triglyceride mg/dL
	 * @param knowHbA1c HbA1c (known,unknown)
	 * @param hbA1cValue HbA1c % value
	 */
	public void fillStep4(final String knowCholesterol, final String cholesterolValue, final String cholesterolLev,
			final String knowLowLipoprotein, final String lowLipoproteinValue, final String knowHighLipoprotein,
			final String highLipoproteinValue, final String knowTriglyceride, final String triglycerideValue,
			final String knowHbA1c, final String hbA1cValue) {

		if (knowCholesterol.equalsIgnoreCase(KNOWN)) {
			new RadioButton(By.xpath(String.format(knowCholesterolTemplate, knowCholesterol)),
					"I know my total cholesterol level").click();
			txbCholesterol.setText(cholesterolValue);
		} else {
			new RadioButton(By.xpath(String.format(knowCholesterolTemplate, knowCholesterol)), "I'm not sure").click();
			new RadioButton(By.xpath(String.format(cholesterolLevelTemplate, cholesterolLev)),
					"Do you know if your total cholesterol is").click();
		}

		if (knowLowLipoprotein.equalsIgnoreCase(KNOWN)) {
			new RadioButton(By.xpath(String.format(lipoproteinTemplate, knowLowLipoprotein)), "I know my LDL").click();
			txbLowLipoprotein.setText(lowLipoproteinValue);
		} else {
			new RadioButton(By.xpath(String.format(lipoproteinTemplate, knowLowLipoprotein)), "I'm not sure").click();
		}

		if (knowHighLipoprotein.equalsIgnoreCase(KNOWN)) {
			new RadioButton(By.xpath(String.format(hlipoproteinTemplate, knowHighLipoprotein)), "I know my HDL")
					.click();
			txbHighLipoprotein.setText(highLipoproteinValue);
		} else {
			new RadioButton(By.xpath(String.format(hlipoproteinTemplate, knowHighLipoprotein)), "I'm not sure").click();
		}

		if (knowTriglyceride.equalsIgnoreCase(KNOWN)) {
			new RadioButton(By.xpath(String.format(triglycerideTemplate, knowTriglyceride)), "I know my triglyceride")
					.click();
			txbTriglyceride.setText(triglycerideValue);
		} else {
			new RadioButton(By.xpath(String.format(triglycerideTemplate, knowTriglyceride)), "I'm not sure").click();
		}

		// TODO remove if
		if (knowHbA1c.equalsIgnoreCase(KNOWN)) {
			new RadioButton(By.xpath(String.format(hbA1cTemplate, knowHbA1c)), "I know my HbA1c").clickIfPresent();
			if (txbHbA1c.isPresent()) {
				txbHbA1c.setText(hbA1cValue);
			}
		} else {
			new RadioButton(By.xpath(String.format(hbA1cTemplate, knowHbA1c)), "I'm not sure").clickIfPresent();
		}

		btnFinish.clickViaJsAndWait();
	}

}
