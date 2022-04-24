package com.planit.pages;

import com.planit.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends BasePage{

    public static void wait(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("something happened in sleep method");

        }
    }

   public int quantity(int itemRowNumber){
        wait(3);
       WebElement quantity = Driver.getDriver().findElement(By.xpath("//tbody/tr["+itemRowNumber+"]/td[3]/input"));
       String test = quantity.getAttribute("value");
        return Integer.parseInt(test);
   }


    public double PriceTable(int itemRowNumber){
       WebElement Price = Driver.getDriver().findElement(By.xpath("//tbody/tr["+itemRowNumber+"]/td[2]"));
       return Double.parseDouble((Price.getText().replace("$","")));
    }


    public double subtotalTable(int itemRowNumber) {
        WebElement subtotal = Driver.getDriver().findElement(By.xpath("//tr["+itemRowNumber+"]/td[4]/font"));
        String totalValue = subtotal.getText().replace("$", "");
        return Double.parseDouble(totalValue);
    }

    public double getTotalPrice() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        WebElement Total = Driver.getDriver().findElement(By.xpath("/html/body/div[2]/div/form/table/tfoot/tr[1]/td/strong"));
        wait.until(ExpectedConditions.visibilityOf(Total)).isDisplayed();
        return Double.parseDouble(Total.getText().replace("Total: ", ""));
    }

    public double actualStuffedFrogSubTotal(){
        wait(3);
        return quantity(1)*PriceTable(1);
    }

    public double actualFluffyBunnySubTotal(){
        return quantity(2)*PriceTable(2);
    }

    public double actualValentineBearSubTotal(){
        return quantity(3)*PriceTable(3);
    }

    public double sumOfAllItems(){
        return actualStuffedFrogSubTotal()+actualFluffyBunnySubTotal()+actualValentineBearSubTotal();
    }








}
