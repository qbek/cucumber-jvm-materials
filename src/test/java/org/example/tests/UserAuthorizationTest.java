package org.example.tests;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Steps;
import data.UserAccount;
import steps.AuthorizationSteps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


@ExtendWith(SerenityJUnit5Extension.class)
public class UserAuthorizationTest {

    @Steps
    AuthorizationSteps authSteps;

    @Test
    public void userCannotLoginWithInvalidPass() {
        var invalidPasswordAccount = new UserAccount("standard", "invalidpassword");
        authSteps.userLogsInUsingCredentials(invalidPasswordAccount);
        authSteps.userDoesNotLogsIn();
    }
}
