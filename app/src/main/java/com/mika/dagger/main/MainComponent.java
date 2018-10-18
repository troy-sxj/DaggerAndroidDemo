package com.mika.dagger.main;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * @Author: mika
 * @Time: 2018/10/17 下午7:10
 * @Description:
 */
@Subcomponent
public interface MainComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{}

}
