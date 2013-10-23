package productive.tests.vhr;

import org.testng.annotations.*;
import productive.forms.*;
import productive.forms.MainMenu.*;
import productive.forms.myprofile.vhr.*;
import productive.tests.base.ProductiveParamTest;
import webdriver.controller.*;
import webdriver.controller.UsersController.User;

/**
 * Opening main page
 */
public class VitalityHealthReviewTest extends ProductiveParamTest {

	private UsersController users = UsersController.getInstance();
	private String overallStatus, daysPerWeek, spendMinutes, intense, strenth, flexibility, tvHours, tvMinutes,
			pcHours, pcMinutes, meetingHours, meetingMinutes, currentLevel, fruitVegetables, wholeGrains, meatOrFish,
			dairyYesNo, meatValue, dairyValue, fats, saltQty, saltyFoods, feelings, sleepHours, sleep, tired, nerv,
			nerv2, hope, rest, sit, depress, effort, sad, worth, stress, workDays, level, doYouSmoke, cigarettesUse,
			cigarUse, snuffUse, cigarettesCount, smokeMonths, smokeYears, smokingHabits, doYouDrink, alcoholCount,
			alcoholAnswer, userFeet, userInches, userPounds, userNinches, waistSure, feelWeight, knowBlPressure,
			systolicValue, diastolicValue, blPressureLevel, knowGlucose, glucoseValue, glucoseLevel, knowCholesterol,
			cholesterolValue, cholesterolLevel, knowLowLipoprotein, lowLipoproteinValue, knowHighLipoprotein,
			highLipoproteinValue, knowTriglyceride, triglycerideValue, knowHbA1c, hbA1cValue;

	/**
	 * Read parameters method
	 * @param overall overall
	 * @param dayPerWeek dayPerWeek
	 * @param spendMinute spendMinute
	 * @param intens intens
	 * @param str str
	 * @param flex flex
	 * @param tvh tvh
	 * @param tvm tvm
	 * @param pch pch
	 * @param pcm pcm
	 * @param mHours mHours
	 * @param mMinutes mMinutes
	 * @param cLevel cLevel
	 * @param fruitVeget fruitVeget
	 * @param grains grains
	 * @param meatFish meatFish
	 * @param dairy dairy
	 * @param meatVal meatVal
	 * @param dairyVal dairyVal
	 * @param fat fat
	 * @param salt salt
	 * @param saltyFood saltyFood
	 * @param feels feels
	 * @param habits habits
	 * @param sHours sHours
	 * @param tiredS tiredS
	 * @param nervS nervS
	 * @param nervS2 nervS2
	 * @param hopeS hopeS
	 * @param restS restS
	 * @param sitS sit
	 * @param depressS depress
	 * @param effortS effort
	 * @param sadS sad
	 * @param worthS worthS
	 * @param stressS stressS
	 * @param workDay workDay
	 * @param levelS levelS
	 * @param doSmoke doSmoke
	 * @param cigarettes cigarettes
	 * @param cigar cigar
	 * @param snuff snuff
	 * @param cigNumber cigNumber
	 * @param smokingMonths smokingMonths
	 * @param smokingYears smokingYears
	 * @param smokeHabits smokeHabits
	 * @param doDrink doDrink
	 * @param alcoholNumber alcoholNumber
	 * @param alcoholAnswr alcoholAnswr
	 * @param feet feet
	 * @param inches inches
	 * @param pounds pounds
	 * @param ninches ninches
	 * @param waist waist
	 * @param weight weight
	 * @param blPressure BlPressure
	 * @param systolicVal systolicVal
	 * @param diastolicVal diastolicVal
	 * @param blPressureLev blPressureLev
	 * @param glucose glucose
	 * @param glucoseVal glucoseVal
	 * @param glucoseLev glucoseLev
	 * @param cholesterol cholesterol
	 * @param cholesterolVal cholesterolVal
	 * @param cholesterolLev cholesterolLev
	 * @param lowLipoprotein lowLipoprotein
	 * @param lowLipoproteinVal lowLipoproteinVal
	 * @param highLipoprotein highLipoprotein
	 * @param highLipoproteinVal highLipoproteinVal
	 * @param triglyceride triglyceride
	 * @param triglycerideVal triglycerideVal
	 * @param hbA1c hbA1c
	 * @param hbA1cVal hbA1cVal
	 * @throws Throwable Exception
	 */
	@Test
	@Parameters({ "overall", "daysPerWeek", "spendMinutes", "intense", "strenth", "flexibility", "tvHours",
			"tvMinutes", "pcHours", "pcMinutes", "meetingHours", "meetingMinutes", "currentLevel", "fruitVegetables",
			"wholeGrains", "meatOrFish", "dairyYesNo", "meatValue", "dairyValue", "fats", "saltQty", "saltyFoods",
			"feelings", "habits", "sleepHours", "tired", "nerv", "nerv2", "hope", "rest", "sit", "depress", "effort",
			"sad", "worth", "stress", "workDays", "level", "doSmoke", "cigarettes", "cigar", "snuff", "cigNumber",
			"smokingMonths", "smokingYears", "smokeHabits", "doDrink", "alcoholNumber", "alcoholAnswr", "feet",
			"inches", "pounds", "ninches", "waist", "weight", "blPressure", "systolicVal", "diastolicVal",
			"blPressureLev", "glucose", "glucoseVal", "glucoseLev", "cholesterol", "cholesterolVal", "cholesterolLev",
			"lowLipoprotein", "lowLipoproteinVal", "highLipoprotein", "highLipoproteinVal", "triglyceride",
			"triglycerideVal", "hbA1c", "hbA1cVal" })
	private void readparams(String overall, String dayPerWeek, String spendMinute, String intens, String str,
			String flex, String tvh, String tvm, String pch, String pcm, String mHours, String mMinutes, String cLevel,
			String fruitVeget, String grains, String meatFish, String dairy, String meatVal, String dairyVal,
			String fat, String salt, String saltyFood, String feels, String habits, String sHours, String tiredS,
			String nervS, String nervS2, String hopeS, String restS, String sitS, String depressS, String effortS,
			String sadS, String worthS, String stressS, String workDay, String levelS, String doSmoke,
			String cigarettes, String cigar, String snuff, String cigNumber, String smokingMonths, String smokingYears,
			String smokeHabits, String doDrink, String alcoholNumber, String alcoholAnswr, String feet, String inches,
			String pounds, String ninches, String waist, String weight, String blPressure, String systolicVal,
			String diastolicVal, String blPressureLev, String glucose, String glucoseVal, String glucoseLev,
			String cholesterol, String cholesterolVal, String cholesterolLev, String lowLipoprotein,
			String lowLipoproteinVal, String highLipoprotein, String highLipoproteinVal, String triglyceride,
			String triglycerideVal, String hbA1c, String hbA1cVal) throws Throwable {
		overallStatus = overall;
		daysPerWeek = dayPerWeek;
		spendMinutes = spendMinute;
		intense = intens;
		strenth = str;
		flexibility = flex;
		tvHours = tvh;
		tvMinutes = tvm;
		pcHours = pch;
		pcMinutes = pcm;
		meetingHours = mHours;
		meetingMinutes = mMinutes;
		currentLevel = cLevel;
		fruitVegetables = fruitVeget;
		wholeGrains = grains;
		meatOrFish = meatFish;
		dairyYesNo = dairy;
		meatValue = meatVal;
		dairyValue = dairyVal;
		fats = fat;
		saltQty = salt;
		saltyFoods = saltyFood;
		feelings = feels;
		tired = tiredS;
		nerv = nervS;
		nerv2 = nervS2;
		hope = hopeS;
		rest = restS;
		sit = sitS;
		depress = depressS;
		effort = effortS;
		sad = sadS;
		worth = worthS;
		stress = stressS;
		workDays = workDay;
		level = levelS;
		sleep = habits;
		sleepHours = sHours;
		doYouSmoke = doSmoke;
		cigarettesUse = cigarettes;
		cigarUse = cigar;
		snuffUse = snuff;
		cigarettesCount = cigNumber;
		smokeMonths = smokingMonths;
		smokeYears = smokingYears;
		smokingHabits = smokeHabits;
		doYouDrink = doDrink;
		alcoholCount = alcoholNumber;
		alcoholAnswer = alcoholAnswr;
		userFeet = feet;
		userInches = inches;
		userPounds = pounds;
		userNinches = ninches;
		waistSure = waist;
		feelWeight = weight;
		knowBlPressure = blPressure;
		systolicValue = systolicVal;
		diastolicValue = diastolicVal;
		blPressureLevel = blPressureLev;
		knowGlucose = glucose;
		glucoseValue = glucoseVal;
		glucoseLevel = glucoseLev;
		knowCholesterol = cholesterol;
		cholesterolValue = cholesterolVal;
		cholesterolLevel = cholesterolLev;
		knowLowLipoprotein = lowLipoprotein;
		lowLipoproteinValue = lowLipoproteinVal;
		knowHighLipoprotein = highLipoprotein;
		highLipoproteinValue = highLipoproteinVal;
		knowTriglyceride = triglyceride;
		triglycerideValue = triglycerideVal;
		knowHbA1c = hbA1c;
		hbA1cValue = hbA1cVal;
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
		loginForm.loginEngagedAccount(admin.getLogin(), admin.getPassword());

		// 1.
		LogStep();
		MainMenu.navigateTo(MenuItems.MY_PROFILE, MyProfileItems.VITALITY_HEALTH_REVIEW);
		OverallHealthQuestionForm overAll = new OverallHealthQuestionForm();

		// 2.
		LogStep();
		FitnessExerciseForm fitness = overAll.doAnswer(overallStatus);
		fitness.fillStep1(daysPerWeek, spendMinutes, intense);

		// 3.
		LogStep();
		fitness.fillStep2(strenth, flexibility);

		// 4.
		LogStep();
		fitness.fillStep3(tvHours, tvMinutes, pcHours, pcMinutes, meetingHours, meetingMinutes);

		// 5.
		LogStep();
		EatingHabitsForm ehForm = fitness.fillStep4(currentLevel);

		// 6.
		LogStep();
		ehForm.fillStep1(fruitVegetables, wholeGrains, meatOrFish, dairyYesNo, meatValue, dairyValue);

		// 7.
		LogStep();
		ehForm.fillStep2(fats, saltQty, saltyFoods);

		// 8.
		LogStep();
		WorkAndHomeLifeForm work = ehForm.fillStep3(feelings);
		work.fillSleepingHabits(sleep, sleepHours);

		// 9.
		LogStep();
		work.fillStep2(tired, nerv, nerv2, hope, rest, sit, depress, effort, sad, worth);

		// 10.
		LogStep();
		work.fillStress(stress);

		// 11.
		LogStep();
		work.fillStep4(workDays);

		// 12.
		LogStep();
		work.fillStep5();

		// 13.
		LogStep();
		LifestyleHabitsForm life = work.fillStep6(level);

		// 14.
		LogStep();
		life.fillStep1(doYouSmoke, cigarettesUse, cigarUse, snuffUse, cigarettesCount, smokeMonths, smokeYears,
				smokingHabits);

		// 15.
		LogStep();
		life.fillStep2(doYouDrink);

		// 16.
		LogStep();
		PhysicalHealthForm phys = life.fillStep3(alcoholCount, alcoholAnswer);

		// 17.
		LogStep();
		phys.fillStep1();

		// 18.
		LogStep();
		phys.fillStep2(userFeet, userInches, userPounds, userNinches, waistSure, feelWeight);

		// 19.
		LogStep();
		phys.fillStep3(knowBlPressure, systolicValue, diastolicValue, blPressureLevel, knowGlucose, glucoseValue,
				glucoseLevel);

		// 20.
		LogStep();
		phys.fillStep4(knowCholesterol, cholesterolValue, cholesterolLevel, knowLowLipoprotein, lowLipoproteinValue,
				knowHighLipoprotein, highLipoproteinValue, knowTriglyceride, triglycerideValue, knowHbA1c, hbA1cValue);

	}

	@Override
	public void invokeAnalys(final Throwable exc, final String bodyText) throws Throwable {
	}

	@Override
	public boolean shouldAnalys() {
		return false;
	}

}
