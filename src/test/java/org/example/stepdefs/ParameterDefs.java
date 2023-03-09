package org.example.stepdefs;

import io.cucumber.java.ParameterType;
import org.example.data.UserAccount;

public class ParameterDefs {


    @ParameterType("true|false")
    public boolean bool(String s) {
        if (s.equals("true")) {
            return true;
        }
        return false;
    }

    @ParameterType("standard|premium")
    public UserAccount accountType(String s) {
        if (s.equals("standard")) {
            return new UserAccount("standard", "passStandard");
        } else {
            return new UserAccount("premium", "premium");
        }
    }
}
