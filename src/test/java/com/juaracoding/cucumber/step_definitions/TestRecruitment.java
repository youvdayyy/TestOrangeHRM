package com.juaracoding.cucumber.step_definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.juaracoding.cucumber.pages.LoginPage;
import com.juaracoding.cucumber.pages.RecruitmentPage;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestRecruitment {
 
	private static WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage = new LoginPage();
    private RecruitmentPage recPage = new RecruitmentPage();
    public TestRecruitment() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
	@When("User on Dashboard page")
	public void user_on_dashboard_page() {
		Assert.assertEquals(loginPage.getTxtDashboard(), "Dashboard");
		extentTest.log(LogStatus.PASS, "User on Dashboard Page");
	}
	@And("User click Menu Recruitment")
	public void user_click_menu_dashboard_choose_recruitment() {
	   recPage.clickbtnRec();
	   extentTest.log(LogStatus.PASS, "User click Menu Recruitment");
	}
	@And("User on Recruitment Page")
	public void user_on_recruitment_page() {
		try {
	    	Thread.sleep(1000);
	    } catch (InterruptedException e) {
	    	// TODO Auto-generated catch block
	    	e.printStackTrace();
	    }
		extentTest.log(LogStatus.PASS, "User on Recruitment Page");
	}
	@And("User click button Add")
	public void user_click_button_add() {
	    recPage.clickbtnAdd();
	    extentTest.log(LogStatus.PASS, "User Click Button Add");
	}
	@And("User on Add Candidate")
	public void user_on_add_candidate() {
		try {
	    	Thread.sleep(1000);
	    } catch (InterruptedException e) {
	    	// TODO Auto-generated catch block
	    	e.printStackTrace();
	    }
		extentTest.log(LogStatus.PASS, "User on Add Candidate");
	}
	@And("User enter Firstname, Middlename, Lastname, Vacancy, Email, Contact Number, Resume, Keyword, Date of Application, Notes, Check Consent")
	public void user_enter_firstname_middlename_lastname_vacancy_email_contact_number_resume_keyword_date_of_application_notes_check_consent() {
		recPage.InputFullname("Ahmad","","Chaidar");
		recPage.SelectVacancy();
		recPage.InputEmail_and_Contact("chaidarjc@gmail.com","0899989897");
		recPage.clickbtnBrowse();
		recPage.InputKeyword_Date_and_Notes("qwerty","","qwerty");
		recPage.clickConsent();
		extentTest.log(LogStatus.PASS, "User Enter Form Data Candidates");
	}
	@And("User Click save")
	public void user_click_save() {
	   recPage.clickbtnSave();
	   extentTest.log(LogStatus.PASS, "User Click save");
	}
	@Then("Show a Application Stage")
	public void show_a_application_stage() {
		Assert.assertEquals(recPage.txtAppStage(), "Application Stage");
        extentTest.log(LogStatus.PASS, "Show a Application Stage");
	}
}
