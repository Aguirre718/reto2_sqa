package io.swagger.petstore.testing.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/io.swagger.petstore.testing.features/create_user.feature"},
        glue = {"io.swagger.petstore.testing.stepdefinitions"},
        snippets = SnippetType.CAMELCASE)

public class CreateUserRunner {
}
