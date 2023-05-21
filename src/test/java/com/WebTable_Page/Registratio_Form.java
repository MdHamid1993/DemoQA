package com.WebTable_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Registratio_Form {

	WebDriver driver;

	public Registratio_Form(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5")
	private WebElement Element;

	public WebElement getElement() {
		Element.click();
		return Element;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[4]/span")
	private WebElement WebTable;

	public WebElement getWebTables() {
		WebTable.click();
		return WebTable;
	}

	@FindBy(how = How.ID, using = "addNewRecordButton")
	private WebElement AddButton;

	public WebElement getAddButton() {
		AddButton.click();
		return AddButton;
	}

	@FindBy(how = How.ID, using = "firstName")
	private WebElement FirstName;

	public WebElement getFirstName(String enterFirstName) {
		FirstName.sendKeys(enterFirstName);
		return FirstName;
	}

	@FindBy(how = How.ID, using = "lastName")
	private WebElement LaststName;

	public WebElement getLaststName(String enterLaststName) {
		LaststName.sendKeys(enterLaststName);
		return LaststName;
	}

	@FindBy(how = How.ID, using = "userEmail")
	private WebElement getEmail;

	public WebElement getEmail(String enterEmail) {
		getEmail.sendKeys(enterEmail);
		return getEmail;
	}

	@FindBy(how = How.ID, using = "age")
	private WebElement getAge;

	public WebElement getAge(String enterAge) {
		getAge.sendKeys(enterAge);
		return getAge;
	}

	@FindBy(how = How.ID, using = "salary")
	private WebElement getSalary;

	public WebElement getSalary(String enterSalary) {
		getSalary.sendKeys(enterSalary);
		return getSalary;
	}

	@FindBy(how = How.ID, using = "department")
	private WebElement getDepartment;

	public WebElement getDepartment(String enterDepartment) {
		getDepartment.sendKeys(enterDepartment);
		return getDepartment;
	}

	@FindBy(how = How.ID, using = "submit")
	private WebElement SubmitButton;

	public WebElement getSubmitButton() {
		SubmitButton.click();
		return SubmitButton;
	}

}
