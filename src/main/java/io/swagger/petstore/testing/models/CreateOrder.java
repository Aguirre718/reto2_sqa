package io.swagger.petstore.testing.models;

public class CreateOrder {

    String id;
    String petId;
    String quantity;
    String shipDate;
    String status;
    String complete;

    public CreateOrder(String id, String petId, String quantity, String shipDate, String status, String complete) {
        this.id = id;
        this.petId = petId;
        this.quantity = quantity;
        this.shipDate = shipDate;
        this.status = status;
        this.complete = complete;
    }

    public String getId() {
        return id;
    }

    public String getPetId() {
        return petId;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getShipDate() {
        return shipDate;
    }

    public String getStatus() {
        return status;
    }

    public String getComplete() {
        return complete;
    }
}
