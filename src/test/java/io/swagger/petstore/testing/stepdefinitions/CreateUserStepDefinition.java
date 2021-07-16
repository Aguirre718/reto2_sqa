package io.swagger.petstore.testing.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.swagger.petstore.testing.models.CreateUser;
import net.serenitybdd.rest.SerenityRest;

import java.util.List;

public class CreateUserStepDefinition {

    @Given("^I want to send next information to service \"([^\"]*)\"$")
    public void iWantToSendNextInformationToService(String url, List<CreateUser> createUserList) {

        String body = "{\n" +
                "    \"id\": " + createUserList.get(0).getId()+ ",\n"                      +
                "    \"username\": \" " + createUserList.get(0).getUsername()+ " \",\n"    +
                "    \"firstName\": \" " + createUserList.get(0).getFirstName() + " \",\n" +
                "    \"lastName\": \" " + createUserList.get(0).getLastName()+ " \",\n"    +
                "    \"email\": \" " + createUserList.get(0).getEmail()+ " \",\n"          +
                "    \"password\": \" " + createUserList.get(0).getPassword()+ " \",\n"    +
                "    \"phone\": \" " + createUserList.get(0).getPhone() + " \",\n"         +
                "    \"userStatus\": " + createUserList.get(0).getUserStatus()+ " \n"      +
                "  }";
        SerenityRest.given().body(body).baseUri(url).header("Content-Type","application/json").post();
    }

    @Then("^I validate the code status (\\d+)$")
    public void iValidateTheCodeStatus(int status) {
        SerenityRest.lastResponse().then().statusCode(status);
        System.out.println("The status code is: " + SerenityRest.lastResponse().getStatusCode());
    }
}
