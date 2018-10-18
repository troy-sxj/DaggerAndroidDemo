package com.mika.dagger.main;

import dagger.Binds;
import dagger.Module;

/**
 * @Author: mika
 * @Time: 2018/10/17 下午7:11
 * @Description:
 */
@Module
public abstract class MainModule {

    @Binds
    abstract MainPresenter mainPresenterImpl(MainPresenterImpl mainPresenter);

}
