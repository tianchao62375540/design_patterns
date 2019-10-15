package com.tc.observe.observe01;

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

    private String observerState;

    public String getObserverState() {
        return observerState;
    }

    public void setObserverState(String observerState) {
        this.observerState = observerState;
    }

    @Override
    public void update(Subject subject) {
        observerState = ((ConcreteSubject)subject).getSubjectState();
        System.out.println(this+" "+observerState);
    }
}
