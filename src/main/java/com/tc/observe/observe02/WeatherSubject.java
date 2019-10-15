package com.tc.observe.observe02;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * <p>
 * ModelName:【】模块
 *
 * @author: TianChao
 * Create at:  2019/10/14 17:01
 * Company: 沈阳艾尔时代科技发展有限公司
 * Copyright: (c)2018 AIR Times Inc. All rights reserved.
 * @version: 1.0
 */
public class WeatherSubject {

    public List<Observer> observers = new ArrayList<>();
   /* public Subject(Observer observer){
        super();
    }*/
    public void attach(Observer observer){
        observers.add(observer);
    }
    public void detach(Observer observer){
        observers.remove(observer);
    }
    protected void notifyObservers(){
        for(Observer observer:observers ){
            observer.update(this);
        }
    }
}
