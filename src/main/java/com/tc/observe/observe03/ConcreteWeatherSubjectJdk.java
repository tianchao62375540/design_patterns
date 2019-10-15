package com.tc.observe.observe03;

import java.util.Observable;

/**
 * Description:目标
 * <p>
 * ModelName:【】模块
 *
 * @author: TianChao
 * Create at:  2019/10/15 14:21
 * Company: 沈阳艾尔时代科技发展有限公司
 * Copyright: (c)2018 AIR Times Inc. All rights reserved.
 * @version: 1.0
 */

public class ConcreteWeatherSubjectJdk extends Observable {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        setChanged();
        notifyObservers(content);
    }
}
