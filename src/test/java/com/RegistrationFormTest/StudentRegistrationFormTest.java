package com.RegistrationFormTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.RegistrationFormPage.StudentRegistrationFormPage;

public class StudentRegistrationFormTest extends BaseTest {

	WebDriver driver;

	@BeforeTest
	public void init() {
		// driver= openApp();
		driver = openChrome();
		// driver=openEdge();
		// driver= openFirefox();

	}

	@Test
	public void Registration() throws InterruptedException {
		StudentRegistrationFormPage st = new StudentRegistrationFormPage(driver);
		st.getForms();
		st.getPrectiseForms();
		st.getFirstName("Md.Hamidur");
		st.getLastName("Rahman");
		st.getEmail("abc@gmail.com");
		st.getGender();
		st.getMobile("0171111111");
		st.getHobbies();
		st.getChooseFile();
		st.getSubmit();

	}
	
	
	@AfterTest
	public void CloseApp() {
		driver.quit();
	}

}
