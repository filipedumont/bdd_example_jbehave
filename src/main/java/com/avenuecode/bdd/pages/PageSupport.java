package com.avenuecode.bdd.pages;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.web.selenium.WebDriverProvider;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Filipe on 3/19/2015.
 */
public class PageSupport {
    private final WebDriverProvider driverProvider;

    private HomePage home;

    public PageSupport(WebDriverProvider driverProvider){
        this.driverProvider = driverProvider;

    }

    public HomePage homePage(){

     if(!(home instanceof HomePage))
        home = new HomePage(driverProvider);

      return home;
    }
}
