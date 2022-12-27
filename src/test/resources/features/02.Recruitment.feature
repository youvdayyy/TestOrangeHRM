Feature: Recruitment Candidate & Vacancy

Scenario: Add Candidate Recruitment
When User on Dashboard page
And User click Menu Recruitment
And User on Recruitment Page
And User click button Add
And User on Add Candidate
And User enter Firstname, Middlename, Lastname, Vacancy, Email, Contact Number, Resume, Keyword, Date of Application, Notes, Check Consent
And User Click save
Then Show a Application Stage