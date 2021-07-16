package io.swagger.petstore.testing.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.swagger.petstore.testing.models.CreateOrder;
import net.serenitybdd.rest.SerenityRest;

import java.util.List;

public class CreateOrderStepDefinition {

    @Given("^I want to send some information to service\"([^\"]*)\"$")
    public void iWantToSendSomeInformationToService(String url, List<CreateOrder> createOrderList) {
        String body = "{\n" +
                "  \"id\": " + createOrderList.get(0).getId() + ",\n"                  +
                "  \"petId\": " + createOrderList.get(0).getPetId() + ",\n"            +
                "  \"quantity\": " + createOrderList.get(0).getQuantity() + " ,\n"     +
                "  \"shipDate\": \" " + createOrderList.get(0).getShipDate() + "\",\n" +
                "  \"status\": \" " + createOrderList.get(0).getStatus() + "\",\n"     +
                "  \"complete\": " + createOrderList.get(0).getComplete() + " \n"      +
                "}";
        SerenityRest.given().body(body).baseUri(url).header("Content-Type","application/json").post();
    }

    @Then("^I validate the status code (\\d+) for the request$")
    public void iValidateTheStatusCodeForTheRequest(int status) {
        SerenityRest.lastResponse().then().statusCode(status);
        System.out.println("The status code is: " + SerenityRest.lastResponse().getStatusCode());
    }
}
