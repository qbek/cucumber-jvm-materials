package org.example.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import data.UserAccount;
import steps.AuthorizationSteps;
import steps.TodoManagementSteps;

public class MoreExamplesStepdefs {

    @Steps
    AuthorizationSteps authSteps;

    @Steps
    TodoManagementSteps todoSteps;

    @When("{account} enters his credentials on login screen")
    public void heEntersHisCredetilsOnLoginScreen(UserAccount account) {
        authSteps.userLogsInUsingCredentials(account);
    }

    @Given("{account} is logged in")
    public void heIsLoggedIn(UserAccount account) {
        authSteps.userLogsInUsingCredentials(account.getLogin(), account.getPassword());
        authSteps.userSuccessfullyLogsIn(account.getLogin());
    }

    @When("he creates a {newTodo}")
    public void heCreatesANewTodo(String todoName) {
        todoSteps.userCreatesANewTodo(todoName);
    }


}
