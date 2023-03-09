package org.example.stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.ParameterType;
import net.serenitybdd.core.Serenity;
import data.UserAccount;

public class ParameterDefs {

    private static Faker generator = new Faker();

    @ParameterType("true|false")
    public boolean bool(String s) {
        if (s.equals("true")) {
            return true;
        }
        return false;
    }

    @ParameterType("standard|premium")
    public UserAccount accountType(String s) {
        UserAccount account;
        if (s.equals("standard")) {
            account = new UserAccount("standard", "passStandard");
        } else {
            account = new UserAccount("premium", "premium");
        }
        Serenity.setSessionVariable("userAccount").to(account);
        return account;
    }

    @ParameterType("he|user|she")
    public UserAccount account(String s) {
        return (UserAccount) Serenity.sessionVariableCalled("userAccount");
    }

    @ParameterType("new todo")
    public String newTodo(String s) {
        return generator.programmingLanguage().creator();
    }
}
