package steps;

import net.thucydides.core.annotations.Step;
import data.UserAccount;

public class AuthorizationSteps {

    private String accountType = "Standard";

    @Step("User logs in using '{0}' as login, and '{1}' as password")
    public void userLogsInUsingCredentials(String login, String pass) {
        System.out.println("Enter login into login input, login: " + login);
        System.out.println("Enter pas into pass input, pass: " + pass);
        System.out.println("Press login button");
    }

    public void userLogsInUsingCredentials(UserAccount account) {
        userLogsInUsingCredentials(account.getLogin(), account.getPassword());
    }

    @Step("User has logged in, his account is: #accountType")
    public void userSuccessfullyLogsIn(String login) {
        System.out.println("Checking if on main scree1n");
        System.out.println("Logged user is: " + login);
    }

    @Step
    public void userDoesNotLogsIn() {
        System.out.println("User stays on login screen");
        System.out.println("Invalid credentials error displayed");
    }
}
