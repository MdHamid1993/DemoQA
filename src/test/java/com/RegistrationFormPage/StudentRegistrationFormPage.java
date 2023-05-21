package com.RegistrationFormPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class StudentRegistrationFormPage {

	WebDriver driver;

	public StudentRegistrationFormPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[3]/h5")
	private WebElement Forms;

	public WebElement getForms() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Forms.click();
		return Forms;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li/span")
	private WebElement PrectiseForms;

	public WebElement getPrectiseForms() {
		PrectiseForms.click();
		return PrectiseForms;

	}

	@FindBy(how = How.ID, using = "firstName")
	private WebElement FirstName;

	public WebElement getFirstName(String enterFirstName) {
		FirstName.sendKeys(enterFirstName);
		return FirstName;
	}

	@FindBy(how = How.ID, using = "lastName")
	private WebElement LastName;

	public WebElement getLastName(String enterLaststName) {
		LastName.sendKeys(enterLaststName);
		return LastName;
	}

	@FindBy(how = How.ID, using = "userEmail")
	private WebElement getEmail;

	public WebElement getEmail(String enterEmail) {
		getEmail.sendKeys(enterEmail);
		return getEmail;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\'genterWrapper\']/div[2]/div[1]/label")
	private WebElement getGender;

	public WebElement getGender() {
		getGender.click();
		return getGender;
	}

	@FindBy(how = How.ID, using = "userNumber")
	private WebElement getMobile;

	public WebElement getMobile(String enterMobile) {
		getMobile.sendKeys(enterMobile);
		return getMobile;

	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")
	private WebElement getHobbies;

	public WebElement getHobbies() {
		getHobbies.click();
		return getHobbies;

	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"uploadPicture\"]")
	private WebElement getChooseFile;

	public WebElement getChooseFile() {
		getChooseFile.sendKeys("C:\\Users\\Hamidur Rahman\\Pictures\\Screenshots\\Screenshot (2).png");
		return getChooseFile;

	}

	@FindBy(how = How.XPATH, using = "//*[@id=\'submit\']")
	private WebElement getSubmit;

	public WebElement getSubmit() {
		
		getSubmit.click();
		return getSubmit;

	}

}
