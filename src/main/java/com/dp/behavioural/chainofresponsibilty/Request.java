package com.dp.behavioural.chainofresponsibilty;

public class Request {

    private int amount;
    private RequestType type;

    public Request(int amount, RequestType type) {
        this.amount = amount;
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public RequestType getType() {
        return type;
    }

    public void setType(RequestType type) {
        this.type = type;
    }
}
