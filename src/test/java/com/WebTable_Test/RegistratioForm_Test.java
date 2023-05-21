package com.WebTable_Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.WebTable_Page.Registratio_Form;

public class RegistratioForm_Test extends BaseTest {

	WebDriver driver;

	@BeforeTest
	public void init() throws InterruptedException {
		driver =openApp();
		//driver = openChrome();
		//driver = openEdge();
		//driver = openFirefox();
	}

	@Test
	public void AddCustomer() {
		Registratio_Form a = new Registratio_Form(driver);
		a.getElement();
		a.getWebTables();
		a.getAddButton();
		a.getFirstName("MD.Hamidur");
		a.getLaststName("Rahman");
		a.getEmail("abc@gmail.com");
		a.getAge("20");
		a.getSalary("100000");
		a.getDepartment("IT Department");
		a.getSubmitButton();

	}

	@AfterTest
	public void CloseApp() {
		driver.close();
	}

}
