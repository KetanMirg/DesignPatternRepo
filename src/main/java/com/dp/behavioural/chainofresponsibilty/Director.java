package com.dp.behavioural.chainofresponsibilty;

public class Director extends RequestHandler {
    @Override
    public void handleRequest(Request request) {
        if(request.getType() == RequestType.CONFERENCE){
            System.out.println("Director can handle conference request");
        }else {
            successor.handleRequest(request);
        }
    }
}
