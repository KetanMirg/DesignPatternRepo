package com.dp.behavioural.observer;

import java.util.Observable;

public class EventSource extends Observable {

    public void notifyListeners(){
        addObserver(new MyObserver());
        setChanged();
        notifyObservers("how you doin!");
    }
    public static void main(String[] args) {
        EventSource src = new EventSource();
        src.notifyListeners();
    }
}
