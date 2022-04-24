package com.planit.step_definitions;

import com.planit.pages.CartPage;
import com.planit.pages.ShopPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ShopPageStepDefinitions {
    ShopPage shopPage = new ShopPage();
    CartPage cartPage = new CartPage();

    @Then("user buy Fluffy Bunny <{int}> times")
    public void user_buy_fluffy_bunny_times(int quantity) {
        shopPage.buyItemNumberOfTime(4,quantity);
    }

    @Then("user buy Stuffed Frog <{int}> times")
    public void userBuyStuffedFrogTimes(int quantity) {
        shopPage.buyItemNumberOfTime(2,quantity);
    }

    @Then("user buy Valentine Bear <{int}> times")
    public void user_buy_funny_cow_times(int quantity) {
        shopPage.buyItemNumberOfTime(7,quantity);
    }

    @And("And user navigate to {string}")
    public void user_navigate_to_CartPage(){
        shopPage.navigateTo("cart");
    }


    @Then("user verify the subtotal for each product is correct")
    public void user_verify_the_subtotal_for_each_product_is_correct() {
        double expectedStuffedFrog = 21.98;
        double actualStuffedFrog = cartPage.actualStuffedFrogSubTotal();
        Assert.assertEquals("Actual and Expected result does not match!", expectedStuffedFrog, actualStuffedFrog, 0.01);

        double expectedFluffyBunny = 49.95 ;
        double actualFluffyBunny = cartPage.actualFluffyBunnySubTotal();
        Assert.assertEquals("Actual and Expected result does not match!",expectedFluffyBunny,actualFluffyBunny,0.01);

        double expectedValentineBear = 44.97 ;
        double actualValentineBear = cartPage.actualValentineBearSubTotal();
        Assert.assertEquals("Actual and Expected result does not match!",expectedValentineBear,actualValentineBear,0.01);

    }
    @Then("verify the price for each product")
    public void verify_the_price_for_each_product() {
        double expectedStuffedFrogPrice = 10.99;
        double actualStuffedFrogPrice = cartPage.PriceTable(1) ;
        Assert.assertEquals("Actual and Expected result does not match!",expectedStuffedFrogPrice,actualStuffedFrogPrice, 0.01);

        double expectedFluffyBunnyPrice = 9.99;
        double actualFluffyBunnyPrice = cartPage.PriceTable(2) ;
        Assert.assertEquals("Actual and Expected result does not match!",expectedFluffyBunnyPrice,actualFluffyBunnyPrice,0.01);

        double expectedValentineBearPrice = 14.99;
        double actualValentineBearPrice = cartPage.PriceTable(3) ;
        Assert.assertEquals("Actual and Expected result does not match!",expectedValentineBearPrice,actualValentineBearPrice,0.01);


    }
    @Then("verify sub totals")
    public void verify_sub_totals() {
        double expectedTotal = cartPage.sumOfAllItems();
        double actualTotal = cartPage.getTotalPrice();
        Assert.assertEquals("Actual and Expected result does not match!",expectedTotal,actualTotal, 0.01);
    }



}
