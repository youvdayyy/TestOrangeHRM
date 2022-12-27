package com.juaracoding.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy.FirstCharBasedValidator;

public class RecruitmentPage {
	 private WebDriver driver;

	    public RecruitmentPage() {
	        this.driver = DriverSingleton.getDriver();
	        PageFactory.initElements(driver, this);
	    }
	    
	    @FindBy(xpath = "//span[normalize-space()='Recruitment']")
	    WebElement btnRec;
	    
	    @FindBy(xpath = "//button[normalize-space()='Add']")
	    WebElement btnAdd;
	    
	    @FindBy(xpath = "//input[@placeholder='First Name']")
	    WebElement fname;
	    
	    @FindBy(xpath = "//input[@placeholder='Middle Name']")
	    WebElement mname;
	   
	    @FindBy(xpath = "//input[@placeholder='Last Name']")
	    WebElement lname;
	  
	    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/div[1]")
	    WebElement svacancy;
	    
	    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
	    WebElement bvacancy;
	  
	    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div")
	    WebElement cvacancy;
	    				
	    @FindBy(xpath = " //*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")
	    WebElement emails;
	                    
	    @FindBy(xpath = " //*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input")
	    WebElement contacts;
	  	
	    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div/div[2]/input")
	    WebElement btnBrowse;
	  
	    @FindBy(xpath = "//input[@placeholder='Enter comma seperated words...']")
	    WebElement keywords;
	    
	    @FindBy(xpath = "//input[@placeholder='yyyy-mm-dd']")
	    WebElement dates;
	    
	    @FindBy(xpath = "//textarea[@placeholder='Type here']")
	    WebElement notes;
	    
	    @FindBy(xpath = "//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
	    WebElement consent;
	    
	    @FindBy(xpath = "//button[@type='submit']")
	    WebElement btnSave;
	    
	    @FindBy(xpath = "//h6[normalize-space()='Application Stage']")
	    WebElement txtAppStage;
	  
	    public void clickbtnRec () {
	    	 btnRec.click();
	    }
	    public void clickbtnAdd () {
	    	 btnAdd.click();
	    }
	  
	    public void InputFullname(String firsname,String middlename, String lastname){
	        this.fname.sendKeys(firsname);
	        this.mname.sendKeys(middlename);
	        this.lname.sendKeys(lastname);
	    }
	    
	    public void SelectVacancy () {
	    	//Select quantity2 = new Select(driver.findElement(By.xpath("//select[@class='oxd-select-text-input']")));
	    	//quantity2.selectByValue("Associate IT Manager");
	    	bvacancy.sendKeys("Associate IT Manager");
	    	bvacancy.click();
	    }
	    
	    public void InputEmail_and_Contact(String email,String contact){
	    	//emails.click();
	    	this.emails.sendKeys(email);
	    	//contacts.click();
	        this.contacts.sendKeys(contact);
	    }
	    
	    public void clickbtnBrowse () {
	    	//WebElement fileInput = driver.findElement(By.name("test"));
	    	btnBrowse.sendKeys("C:\\Users\\yovrday\\filetest\\test.pdf");
	    }
	    
	    public void InputKeyword_Date_and_Notes (String kword, String date, String note) {
	    	this.keywords.sendKeys(kword);
	        this.dates.sendKeys(date);
	        this.notes.sendKeys(note);
	    }
	    
	    public void clickConsent () {
	    	 consent.click();
	    }
	    
	    public void clickbtnSave () {
	    	 btnSave.click();
	    }
	    
	    public String txtAppStage () {
	    	return txtAppStage.getText();
	    }
}
