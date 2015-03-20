package com.avenuecode.bdd.pages;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Filipe on 3/19/2015.
 */
public class HomePage extends PageSupport{

    private final String pageURL = "http://rails-todo-demo.herokuapp.com/";

    public void navigateToPage() {
        openURL(pageURL);
    }

    public void signInWithUser(String username, String password) {
//        driver.findElement(By.linkText("Sign In")).click();
//        driver.findElement(By.id("user_email")).sendKeys(username);
//        driver.findElement(By.id("user_password")).sendKeys(password);
//
//        driver.findElement(By.cssSelector(".btn")).click();
    }
}
