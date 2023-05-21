package com.demoQA_Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DemoQA_Page {

	WebDriver driver;

	public DemoQA_Page(WebDriver driver) {
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

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[1]/span")
	private WebElement TextBox;

	public WebElement getTextBox() {
		TextBox.click();
		return TextBox;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"userName\"]")
	private WebElement UserName;

	public WebElement getuserName(String enterUserName) {
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		UserName.sendKeys(enterUserName);
		return UserName;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"userEmail\"]")
	private WebElement Email;

	public WebElement getEmail(String enterEmail) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Email.sendKeys(enterEmail);
		return Email;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"currentAddress\"]")
	private WebElement Address;

	public WebElement getAddress(String enterAddress) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Address.sendKeys(enterAddress);
		return Address;

	}

	@FindBy(how = How.ID, using = "permanentAddress")
	private WebElement PermanentAddress;

	public WebElement getPermanentAddress(String enterPermanentAddress) {

		PermanentAddress.sendKeys(enterPermanentAddress);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return PermanentAddress;

	}

	public void SubmitButton() {
		
		//driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		driver.findElement(By.id("submit")).click();
	}
	
	
	
	
}
