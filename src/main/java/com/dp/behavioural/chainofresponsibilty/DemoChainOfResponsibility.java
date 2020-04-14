package com.dp.behavioural.chainofresponsibilty;

public class DemoChainOfResponsibility {

    public static void main(String[] args) {
        RequestHandler ceo = new CEO();
        RequestHandler vp = new VP();
        RequestHandler director = new Director();

        director.setSuccessor(vp);
        vp.setSuccessor(ceo);

        Request request1 = new Request(500,RequestType.CONFERENCE);
        Request requestPurchase = new Request(500,RequestType.PURCHASE);
        Request requestPurchase1 = new Request(5000,RequestType.PURCHASE);

        director.handleRequest(request1);
        director.handleRequest(requestPurchase);
        director.handleRequest(requestPurchase1);
    }
}
