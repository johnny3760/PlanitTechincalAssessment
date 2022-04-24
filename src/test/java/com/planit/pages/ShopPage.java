package com.planit.pages;

import com.planit.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopPage extends BasePage{
    public void buyItem(int itemNum){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        WebElement item = Driver.getDriver().findElement(By.xpath("//*[@id=\"product-"+itemNum+"\"]/div/p/a"));
        wait.until(ExpectedConditions.visibilityOf(item)).isDisplayed();
        item.click();
    }

    public void buyItemNumberOfTime(int itemNum, int numOfItem){
        for (int i = 0; i < numOfItem; i++) {
            buyItem(itemNum);

        }
    }



}
