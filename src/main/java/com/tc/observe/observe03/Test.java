package com.tc.observe.observe03;

/**
 * Description:
 * <p>
 * ModelName:【】模块
 *
 * @author: TianChao
 * Create at:  2019/10/15 15:15
 * Company: 沈阳艾尔时代科技发展有限公司
 * Copyright: (c)2018 AIR Times Inc. All rights reserved.
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        ConcreteWeatherSubjectJdk subjectJdk = new ConcreteWeatherSubjectJdk();
        WeatherObserver weatherObserver1 = new WeatherObserver();
        weatherObserver1.setObserverName("小红");
        weatherObserver1.setRemindThings("逛街");
        WeatherObserver weatherObserver2 = new WeatherObserver();
        weatherObserver2.setObserverName("小强");
        weatherObserver2.setRemindThings("吃饭");
        subjectJdk.addObserver(weatherObserver1);
        subjectJdk.addObserver(weatherObserver2);
        subjectJdk.setContent("1块钱");
        System.out.println("test=====================fff===ffff===ff==========");
    }
}
