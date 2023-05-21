package com.demoQA_test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.demoQA_Page.DemoQA_Page;

public class DemoQA_test extends BaseTest {

	WebDriver driver;

	@BeforeTest
	public void init() {
		//driver= openApp();
		driver=openChrome();
		//driver=openEdge();
		//driver= openFirefox();

	}

	@Test
	public void TextBox() {
		DemoQA_Page t = new DemoQA_Page(driver);
		t.getElement();
		t.getTextBox();
		t.getuserName("Hamidur Rahman");
		t.getEmail("abc@gmail.com");
		t.getAddress("Uposhahar,Block-H,Road-02");
		t.getPermanentAddress("Uposhahar,Block-H,Road-02");
		t.SubmitButton();
	}

}
