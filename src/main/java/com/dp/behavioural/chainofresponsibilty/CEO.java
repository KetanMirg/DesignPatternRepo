package com.dp.behavioural.chainofresponsibilty;

public class CEO extends RequestHandler{

    @Override
    public void handleRequest(Request request) {
        System.out.println("CEO can handle all the request");
    }
}
