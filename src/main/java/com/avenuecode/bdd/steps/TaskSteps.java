package com.avenuecode.bdd.steps;

import com.avenuecode.bdd.pages.HomePage;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;


/**
 * Created by Filipe on 3/19/2015.
 */
public class TaskSteps {

    public HomePage homePage;

    public TaskSteps(){
        this.homePage = new HomePage();
    }

    @Given("user is on $page")
    @Alias("I am on $page")
    public void userIsOnPage(String page) {
        homePage.navigateToPage();
    }

    @When("user authenticates on system with $username and $password")
    public void whenUserAuthenticatesOnSystemWithUsernameAndPassword(String username, String password) {
        homePage.signInWithUser(username, password);
    }

}
