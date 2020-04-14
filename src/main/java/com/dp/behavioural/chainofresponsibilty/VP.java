package com.dp.behavioural.chainofresponsibilty;

public class VP extends RequestHandler {
    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.PURCHASE && request.getAmount() < 1000) {
            System.out.println("VP can handle less amount request");
        } else {
            successor.handleRequest(request);
        }
    }
}
