package com.tc.observe.observe02;

/**
 * Description:
 * <p>
 * ModelName:【】模块
 *
 * @author: TianChao
 * Create at:  2019/10/15 10:20
 * Company: 沈阳艾尔时代科技发展有限公司
 * Copyright: (c)2018 AIR Times Inc. All rights reserved.
 * @version: 1.0
 */
public class Main {
    public String search(){
        try {
            int i = 1/1;
        }catch (Exception e){
            System.out.println("catch");
            throw new RuntimeException("异常了。。。");
        }finally {
            System.out.println("finally");
        }
        return "success";
    }

    public static void main(String[] args) {
        Main main = new Main();
        String search = main.search();
        System.out.println(search);
    }
}
