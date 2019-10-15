package com.tc.observe.observe02;

/**
 * Description:
 * <p>
 * ModelName:【】模块
 *
 * @author: TianChao
 * Create at:  2019/10/14 17:12
 * Company: 沈阳艾尔时代科技发展有限公司
 * Copyright: (c)2018 AIR Times Inc. All rights reserved.
 * @version: 1.0
 */
public class ConcreteObserver implements Observer {

    private String observerName;
    /**
     * 从目标获得
     */
    private String weatherContent;

    private String remindThings;

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
    }

    public String getRemindThings() {
        return remindThings;
    }

    public void setRemindThings(String remindThings) {
        this.remindThings = remindThings;
    }

    @Override
    public void update(WeatherSubject subject) {
        weatherContent = ((ConcreteWeatherSubject)subject).getWeatherContent();
        System.out.println(observerName+"收到了"+weatherContent+","+remindThings);
    }
}
