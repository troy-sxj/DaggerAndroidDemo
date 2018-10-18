package com.mika.dagger;

import com.mika.dagger.di.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

/**
 * @Author: mika
 * @Time: 2018/10/17 下午7:04
 * @Description:
 */
public class DemoApp extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }
}
