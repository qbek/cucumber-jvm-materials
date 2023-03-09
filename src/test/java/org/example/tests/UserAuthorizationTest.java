package org.example.tests;

import com.github.javafaker.Faker;
import com.google.common.util.concurrent.FakeTimeLimiter;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Steps;
import data.UserAccount;
import org.awaitility.Awaitility;
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

    @Test
    public void fakerExample() {
        var generator = new Faker();
        System.out.println(generator.numerify("1234 1234 2102 ####"));
        generator.chuckNorris().fact();


    }
}
