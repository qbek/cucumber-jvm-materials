package steps;

import data.SecretData;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.devtools.v85.audits.model.SameSiteCookieExclusionReason;

public class TodoManagementSteps {

    @Steps(shared = true)
    SecretData data;

    public void userCreatesANewTodo(String todoName) {
        System.out.println("Creating new todo: " + todoName);
        System.out.println( data.getData());
    }
}
