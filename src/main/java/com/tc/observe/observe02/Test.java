package com.tc.observe.observe02;

/**
 * Description:
 * <p>
 * ModelName:【】模块
 *
 * @author: TianChao
 * Create at:  2019/10/14 17:21
 * Company: 沈阳艾尔时代科技发展有限公司
 * Copyright: (c)2018 AIR Times Inc. All rights reserved.
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //观察者
        ConcreteObserver observer1 = new ConcreteObserver();
        observer1.setObserverName("小美");
        observer1.setRemindThings("不能出门");
        ConcreteObserver observer2 = new ConcreteObserver();
        observer2.setObserverName("小强");
        observer2.setRemindThings("可以去游泳");
        ConcreteWeatherSubject subject = new ConcreteWeatherSubject();
        subject.attach(observer1);
        subject.attach(observer2);
        subject.setWeatherContent("天气不好");
    }
}
