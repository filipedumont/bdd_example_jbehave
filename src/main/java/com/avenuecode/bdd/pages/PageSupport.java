package com.avenuecode.bdd.pages;

import org.jbehave.core.annotations.AfterScenario;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Filipe on 3/19/2015.
 */
public class PageSupport {

    protected static WebDriver driver;

    public PageSupport(){
        driver = new FirefoxDriver();
    }

    public void openURL(String url){
        driver.get(url);
    }

    @AfterScenario
    public void finishScenario(){
        driver.close();
    }

    @After
    public void dispose(){
        driver.quit();
    }
}
