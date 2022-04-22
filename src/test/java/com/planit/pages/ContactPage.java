package com.planit.pages;

import com.github.javafaker.Faker;
import com.planit.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactPage extends BasePage {

    @FindBy(xpath = "//a[@class='btn-contact btn btn-primary']")
    private WebElement submitBtn;

    @FindBy(id = "forename")
    private WebElement foreNameInput;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "message")
    private WebElement messageInput;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    private WebElement successMessage;

    public void verifySuccessMessage(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOf(successMessage)).isDisplayed();

    }

    public void clickOnSubmitBtn(){
        submitBtn.click();
        System.out.println("Clicking on 'Submit' button");
    }

    public boolean verifyErrorMessage(String error){
        // WebElement element = Driver.getDriver().findElement(By.xpath("//span[.='"+error+"']"));
        WebElement element = Driver.getDriver().findElement(By.id(error+"-err"));
        return element.isDisplayed();
    }

    public boolean validErrorMessage(String errorMessage){
        boolean valid = false;
        try{verifyErrorMessage(errorMessage);
        }catch(NoSuchElementException e){
            String error = e.getMessage();
            valid = error.contains("no such element");
        }
        return valid;
    }



    public void enterInfo(){
        Faker faker = new Faker();
        String foreName = faker.name().firstName();
        String email = faker.internet().emailAddress();
        String message = faker.chuckNorris().fact();

        foreNameInput.sendKeys(foreName);
        System.out.println("Entering foreName " + foreName);

        emailInput.sendKeys(email);
        System.out.println("Entering Email " + email);

        messageInput.sendKeys(message);
        System.out.println("Entering Message " + message);

    }
    public void enterInvalidInfo(){
        Faker faker = new Faker();
        String foreName = faker.name().firstName();
        String email = foreName;
        String message = faker.chuckNorris().fact();

        foreNameInput.sendKeys(foreName);
        System.out.println("Entering foreName " + foreName);

        emailInput.sendKeys(email);
        System.out.println("Entering Email " + email);

        messageInput.sendKeys(message);
        System.out.println("Entering Message " + message);

    }
}
