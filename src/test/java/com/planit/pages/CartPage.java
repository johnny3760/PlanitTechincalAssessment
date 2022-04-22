package com.planit.pages;

import com.planit.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage{

    public static void wait(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("something happened in sleep method");

        }
    }

   public double Quantity(double numOfItem){
        wait(5);
       WebElement Quantity = Driver.getDriver().findElement(By.xpath("//input[@value=\"+numOfItem+\"]"));
        return Double.parseDouble(Quantity.getText());
   }


    public double PriceTable(double itemRowNumber){
       WebElement Price = Driver.getDriver().findElement(By.xpath("//tbody/tr[itemRowNumber]/td[2]"));
       return Double.parseDouble(Price.getText());
    }


    public double SubtotalTable(double itemRowNumber) {
        WebElement Subtotal = Driver.getDriver().findElement(By.xpath("//tr[itemRowNumber]/td[4]/font"));
        return Double.parseDouble(Subtotal.getText());
    }

//    WebElement Total = Driver.getDriver().findElement(By.xpath("//tfoot/tr[1]/td//font/font"));

    public double actualStuffedFrogSubTotal(){
        return Quantity(2)*PriceTable(1);
    }

    public double actualFluffyBunnySubTotal(){
        return Quantity(5)*PriceTable(2);
    }

    public double actualValentineBearSubTotal(){
        return Quantity(3)*PriceTable(3);
    }

    public double sumOfAllItems(){
        return actualStuffedFrogSubTotal()+actualFluffyBunnySubTotal()+actualValentineBearSubTotal();
    }








}
