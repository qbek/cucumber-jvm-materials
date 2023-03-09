package org.example.stepdefs;

import com.google.gson.JsonObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.data.UserAccount;
import org.json.JSONObject;

import java.util.List;
import java.util.Map;

public class HelloWorldStepdef {

    @Given("Hello I'm Jakub")
    public void hello_i_m_jakub() {
        System.out.println("hello!!!");
    }
    @When("Welcome everyone")
    public void welcome_everyone() {
        System.out.println("welcome");
    }

    @Given("I can have a {string}")
    public void iCanHaveA(String inputValue) {
        System.out.println("I can have a string");
        System.out.println(inputValue);
    }

    @And("I can have a {int} number")
    public void iCanHaveANumber(int number) {
        System.out.println("I can have a number");
        System.out.println(number);
    }

    @And("I know the pi {float}")
    public void iKnowThePi(float number) {
        System.out.println("I can have a float");
        System.out.println(number);
    }

    @And("any {word} can be a variable")
    public void anyWordCanBeAVariable(String word) {
        System.out.println("Word: " + word);
    }

    @And("we can build own boolean with value {bool}")
    public void weCanBuildOwnBooleanWithValueTrue(boolean bool) {
        System.out.println("Boolean: " + bool );
    }

    @Given("a {accountType} user account")
    public void aStandardUserAccount(UserAccount user) {
        System.out.println("User enter as login: " + user.getLogin());
        System.out.println("User enter as password: " + user.getPassword());
    }

    @Given("step with some list")
    public void stepWithSomeList(List<String> arr) {
        System.out.println(arr);
    }

    @And("step with 2d array")
    public void stepWithDArray(List<List<String>> arr) {
        System.out.println(arr);
    }

    @And("array with headers")
    public void arrayWithHeaders(List<Map<String, String>> listOfMap) {
        System.out.println(listOfMap);
    }

    @And("array with names in rows")
    public void arrayWithNamesInRows(Map<String, List<String>> mapOfList) {
        System.out.println(mapOfList);
    }

    @Given("huge amount of text")
    public void hugeAmountOfText(String text) {
        System.out.println(text);
    }

    @And("or plain json")
    public void orPlainJson(String json) {
        JSONObject obj = new JSONObject(json);
        System.out.println(obj.toString(4));
    }
}
