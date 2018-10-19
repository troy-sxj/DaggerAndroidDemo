package com.mika.dagger.di;

import android.app.Activity;

import com.mika.dagger.main.MainActivity;
import com.mika.dagger.main.MainComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * @Author: mika
 * @Time: 2018/10/17 下午7:14
 * @Description:
 */
//@Module(subcomponents = {MainComponent.class})
//public abstract class ActivityBindingModule {
//
//    @Binds
//    @IntoMap
//    @ActivityKey(MainActivity.class)
//    abstract AndroidInjector.Factory<? extends Activity> bindMainActivityInjectorFactory(MainComponent.Builder builder);
//
//
//    @Binds
//    @IntoMap
//    @ActivityKey(DetailActivity.class)
//    abstract AndroidInjector.Factory<? extends Activity> bindDetailActivityInjectorFactory(DetailComponent.Builder builder);
//
//}
