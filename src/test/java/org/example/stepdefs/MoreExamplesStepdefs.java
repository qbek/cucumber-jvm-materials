package org.example.stepdefs;

import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import org.example.data.UserAccount;

public class MoreExamplesStepdefs {

    @When("he enters his credentials on login screen")
    public void heEntersHisCredetilsOnLoginScreen() {
        var account = (UserAccount) Serenity.sessionVariableCalled("userAccount");
        System.out.println("Enter login into login input, login: " + account.getLogin());
        System.out.println("Enter pas into pass input, pass: " + account.getPassword());
    }
}
