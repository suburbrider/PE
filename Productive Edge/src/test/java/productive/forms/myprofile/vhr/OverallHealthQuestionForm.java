package productive.forms.myprofile.vhr;

import org.openqa.selenium.By;
import productive.forms.myprofile.VHRForm;
import webdriver.elements.RadioButton;

/**
 * Overall Health Question Page
 */
public class OverallHealthQuestionForm extends VHRForm {

	/**
	 * Constructor by default
	 */
	public OverallHealthQuestionForm() {
		super(By.id("saveAndExitButton"), "Overall Health Question");
		goToStart();
	}

	/**
	 * Opens the start survey form
	 */
	private void goToStart() {
		info("Going to start form...");
		while (!isFirstPage()) {
			goPrev();
		}
	}

	/**
	 * Answers the first question
	 * @param answer Answer as String
	 * @return FitnessExerciseForm
	 */
	public FitnessExerciseForm doAnswer(final String answer) {
		new RadioButton(By.xpath(String.format(getRadio(), answer)), answer).clickExt();
		goNext();
		return new FitnessExerciseForm();
	}
}
