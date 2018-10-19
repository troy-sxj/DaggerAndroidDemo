package com.mika.dagger.di;

import com.mika.dagger.DemoApp;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * @Author: mika
 * @Time: 2018/10/17 下午7:07
 * @Description:
 */
@Component(modules = {
        AndroidSupportInjectionModule.class,
        NewActivityBindingModule.class,
//        ActivityBindingModule.class
})
public interface AppComponent extends AndroidInjector<DemoApp> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<DemoApp> {

    }
}
