package com.planit.pages;

import com.planit.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    public void navigateTo(String tab){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);
        String tabXpath = "//*[@id=\"nav-"+tab+"\"]";
        WebElement tabElement = Driver.getDriver().findElement(By.xpath(tabXpath));
        tabElement.click();
        System.out.println("Clicking on "+tab);
    }
}
