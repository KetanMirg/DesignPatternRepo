package com.dp.behavioural.observer;

import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof String){
            System.out.println(arg);
        }
    }
}
