package com.mika.dagger.data;

/**
 * @Author: mika
 * @Time: 2018/10/19 下午4:06
 * @Description:
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
