package productive.forms.myprofile.vhr;

import org.openqa.selenium.By;
import productive.forms.myprofile.VHRForm;
import productive.framework.elements.Slider;
import webdriver.elements.*;

/**
 * Fitness & Exercise Page
 */
public class FitnessExerciseForm extends VHRForm {

	private TextBox txbPerWeek = new TextBox(By.id("excercise-days-per-week"), "How many days a week do you exercise");
	private TextBox txbMinutes = new TextBox(By.id("excercise-minutes"), "How many minutes do you spend doing so");
	private Slider slIntensity = new Slider("//div[@id='slider-1']", "How intense are these exercise sessions");
	private Slider slStrength = new Slider("//div[@id='slider-1']",
			"How often do you do strength-training exercises such as push-ups, pull-ups, or weight training");
	private Slider slFlexibility = new Slider("//div[@id='slider-2']",
			"How often do you do flexibility exercises such as stretching, yoga, or Tai Chi");

	private TextBox txbHoursTv = new TextBox(By.id("hours-at-tv"), "watching TV hours");
	private TextBox txbMinutesTv = new TextBox(By.id("minutes-at-tv"), "watching TV minutes");
	private TextBox txbHoursPC = new TextBox(By.id("hours-in-computer"), "hours in computer");
	private TextBox txbMinutesPC = new TextBox(By.id("minutes-in-computer"), "minutes in computer");
	private TextBox txbHoursMeeting = new TextBox(By.id("hours-in-meetings"), "hours in meetings");
	private TextBox txbMinutesMeeting = new TextBox(By.id("minutes-in-meetings"), "minutes in meetings");

	/**
	 * Constructor by default
	 */
	public FitnessExerciseForm() {
		super(By.xpath("//h2[contains(., 'Fitness & Exercise')]"), "Fitness & Exercise");
	}

	/**
	 * Fills the step 1
	 * @param perWeek How many days a week do you exercise
	 * @param minutes How many minutes do you spend doing so
	 * @param intense How intense are these exercise sessions
	 */
	public void fillStep1(final String perWeek, final String minutes, final String intense) {
		txbPerWeek.setText(perWeek);
		txbMinutes.setText(minutes);
		slIntensity.selectValue(intense);
		goNext();
	}

	/**
	 * Fills the step 2
	 * @param str How often do you do strength-training exercises such as push-ups, pull-ups, or weight training
	 * @param flex How often do you do flexibility exercises such as stretching, yoga, or Tai Chi
	 */
	public void fillStep2(final String str, final String flex) {
		slStrength.selectValue(str);
		slFlexibility.selectValue(flex);
		goNext();
	}

	/**
	 * Fills the step 3
	 * @param hoursTV TV Hours
	 * @param minutesTV TV Minutes
	 * @param hoursPC PC Hours
	 * @param minutesPC PC Minutes
	 * @param hoursMeeting Meeting Hours
	 * @param minutesMeeting Meeting Minutes
	 */
	public void fillStep3(final String hoursTV, final String minutesTV, final String hoursPC, final String minutesPC,
			final String hoursMeeting, final String minutesMeeting) {
		txbHoursTv.jsType(hoursTV);
		txbMinutesTv.jsType(minutesTV);
		txbHoursPC.jsType(hoursPC);
		txbMinutesPC.jsType(minutesPC);
		txbHoursMeeting.jsType(hoursMeeting);
		txbMinutesMeeting.jsType(minutesMeeting);
		goNext();
	}

	/**
	 * How do you feel about your current level of exercise?
	 * @param choice Choice as String or part of String
	 * @return EatingHabitsForm
	 */
	public EatingHabitsForm fillStep4(final String choice) {
		new RadioButton(By.xpath(String.format(getRadio(), choice)), choice).clickViaJS();
		goNext();
		return new EatingHabitsForm();
	}
}
