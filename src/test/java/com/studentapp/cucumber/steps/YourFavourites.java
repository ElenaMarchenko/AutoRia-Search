package com.studentapp.cucumber.steps;

import cucumber.api.java.it.Ma;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;


@RunWith(SerenityRunner.class)


public class YourFavourites {
    @Managed
    WebDriver driver;

    @Test

    @Given("^User navigates to Autoria website$")
    public void user_navigates_to_autoria_website() {
        driver.get("https://auto.ria.com/uk/");
        driver.manage().window().maximize();
    }

    @When("^User opens advanced search page$")
    public void user_opens_advance_search_page() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"mainSearchForm\"]/div[3]/a/span")).click();
    }

    @When("^User clicks on Type of transport accordeon and choose cars$")
    public void user_clicks_on_Type_of_transport_accordeon_and_choose_cars() throws Throwable {
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/form/div[2]/div/select")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/form/div[2]/div/select/option[2]")).click();
    }

    @When("^User clicks on Maker button and choose Ford$")
    public void user_clicks_on_Maker_button_and_choose_Ford() throws Throwable {
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"autocomplete-brand-0\"]/label")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"autocomplete-brand-0\"]/ul/li[6]/a")).click();
    }

    @When("^User enters Cost boundaries till 15000$")
    public void user_enters_Cost_boundaries_till_15000() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"at_price-to\"]")).sendKeys("15000");
    }

    @When("^User clicks on Bargaining is possible button$")
    public void user_clicks_on_Bargaining_is_possible_button() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/form/section[2]/div/div[2]/div[1]/label")).click();
    }

    @When("^User clicks on Odessa region in Region checkbox$")
    public void user_clicks_on_Odessa_region_in_Region_checkbox() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/form/section[3]/div/div/div[2]/div[3]/div[2]/ul/li[3]/label")).click();
    }

    @When("^User clicks on Nikolaev region in Region checkbox$")
    public void user_clicks_on_Nikolaev_region_in_Region_checkbox() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/form/section[3]/div/div/div[2]/div[3]/div[2]/ul/li[2]/label")).click();
    }

    @When("^User clicks on Kiev region in Region checkbox$")
    public void user_clicks_on_Kiev_region_in_Region_checkbox() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/form/section[3]/div/div/div[2]/div[1]/div/ul/li[1]/label")).click();
    }

    @When("^User clicks on Hide button in Auto not in Ukraine checkbox$")
    public void User_clicks_on_Hide_button_in_Auto_not_in_Ukraine_checkbox() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/form/section[4]/div[1]/div/div/label[3]")).click();
    }

    @When("^User clicks on Show button in Uncleared checkbox$")
    public void User_clicks_on_Show_button_in_Uncleared_checkbox() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/form/section[4]/div[2]/div/div/label[2]")).click();
    }

    @When("^User clicks on Hide button in In credit checkbox$")
    public void User_clicks_on_Hide_button_in_In_Credit_checkbox() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/form/section[4]/div[3]/div/div/label[3]")).click();
    }

    @When("^User clicks on Hide button in Confiscated checkbox$")
    public void User_clicks_on_Hide_button_in_Confiscated_checkbox() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/form/section[4]/div[4]/div/div/label[3]")).click();
    }

    @When("^User clicks on Hide button in Broken checkbox$")
    public void User_clicks_on_Hide_button_in_Broken_checkbox() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/form/section[4]/div[5]/div/div/label[3]")).click();
    }

    @When("^User clicks on Hide button in Not on the go checkbox$")
    public void User_clicks_on_Hide_button_in_NotOnTheGo_checkbox() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/form/section[4]/div[6]/div/div/label[3]")).click();
    }

    @When("^User clicks on Petrol button in Fuel checkbox$")
    public void User_clicks_on_Petrol_button_in_Fuel_checkbox() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/form/section[5]/div[1]/div/div/label[1]")).click();
    }

    @When("^User clicks on Diesel button in Fuel checkbox$")
    public void User_clicks_on_Diesel_button_in_Fuel_checkbox() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/form/section[5]/div[1]/div/div/label[2]")).click();
    }

    @When("^User clicks on Manual gearbox button in Gearbox checkbox$")
    public void User_clicks_on_Manual_gearbox_button_in_Gearbox_checkbox() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"gearBlock\"]/div/div/label[1]")).click();
    }

    @When("^User clicks on Automation gearbox button in Gearbox checkbox$")
    public void User_clicks_on_Automation_gearbox_button_in_Gearbox_checkbox() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"gearBlock\"]/div/div/label[2]")).click();
    }

    @When("^User clicks on Comfort accordeon and clicks on Cruise control$")
    public void User_clicks_on_Comfort_accordeon_and_clicks_on_Cruise_control() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/form/section[5]/div[11]/div/div[2]/label/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/form/section[5]/div[11]/div/div[2]/div/div[8]/label")).click();
    }

    @When("^User clicks on From cheap to expensive button in Sorting checkbox$")
    public void User_clicks_on_From_cheap_to_expensive_button_in_Sorting_checkbox() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/form/section[6]/div[1]/div/div/label[2]")).click();
    }

    @When("^User clicks on Hide sold button in Relevance checkbox$")
    public void User_clicks_on_Hide_sold_button_in_Relevance_checkbox() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/form/section[6]/div[3]/div/div/label[2]")).click();
    }

    @When("^User enters Count of doors 5$")
    public void User_enters_Count_of_doors_5() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/form/section[5]/div[8]/div/div/div/input[2]")).sendKeys("5");
    }

    @When("^User clicks search button$")
    public void User_clicks_search_button() throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/form/div[6]/div/div/button")).click();
    }

    @Then("^User choose the car from the list$")
    public void User_choose_the_car_from_the_list() throws Throwable {
        Thread.sleep(7000);
        driver.findElement(By.xpath("//*[@id=\"searchResults\"]/section[3]/div[4]/div[2]/div[1]/div/a")).click();
    }

}