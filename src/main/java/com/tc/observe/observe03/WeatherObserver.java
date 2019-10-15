package com.tc.observe.observe03;


import com.tc.observe.observe02.ConcreteWeatherSubject;

import java.util.Observable;
import java.util.Observer;

/**
 * Description:
 * <p>
 * ModelName:【】模块
 *
 * @author: TianChao
 * Create at:  2019/10/15 15:07
 * Company: 沈阳艾尔时代科技发展有限公司
 * Copyright: (c)2018 AIR Times Inc. All rights reserved.
 * @version: 1.0
 */
public class WeatherObserver implements Observer {
    private String observerName;
    private String remindThings;

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getRemindThings() {
        return remindThings;
    }

    public void setRemindThings(String remindThings) {
        this.remindThings = remindThings;
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable o, Object arg) {
        ConcreteWeatherSubjectJdk weatherSubject=(ConcreteWeatherSubjectJdk) o;
        System.out.println(observerName+"接受了"+arg+"和"+weatherSubject.getContent()+"   ,:"+remindThings);
    }
}
