package com.mika.dagger.data;

import javax.inject.Inject;

/**
 * @Author: mika
 * @Time: 2018/10/19 下午4:05
 * @Description:
 */
public class GetUserDataRepositoryImpl implements DataRepository {

    @Inject
    public GetUserDataRepositoryImpl(){

    }

    public User getUser(){
        return new User("aaa");
    }

    @Override
    public void release() {

    }
}
