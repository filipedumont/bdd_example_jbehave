package com.avenuecode.bdd.pages;

import org.jbehave.web.selenium.WebDriverProvider;


import java.util.concurrent.TimeUnit;

/**
 * Created by Filipe on 3/19/2015.
 */
public class HomePage extends Page{

    private static final String pageURL = "http://rails-todo-demo.herokuapp.com/";

    public HomePage(WebDriverProvider driverProvider) {
        super(driverProvider);
    }

    public void navigateToPage(){
        get(pageURL);
        manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
