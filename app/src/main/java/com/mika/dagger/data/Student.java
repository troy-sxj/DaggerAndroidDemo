package com.mika.dagger.data;

import javax.inject.Inject;

/**
 * @Author: mika
 * @Time: 2018/10/17 下午7:09
 * @Description:
 */
public class Student {

    private String name;

    @Inject
    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
