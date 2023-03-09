package org.example;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


//@ExtendWith(SerenityJUnit5Extension.class)
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "classpath:features")
public class CucumberTest {
}
