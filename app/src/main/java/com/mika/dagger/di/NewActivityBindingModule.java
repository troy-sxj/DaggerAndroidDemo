package com.mika.dagger.di;

import com.mika.dagger.detail.DetailActivity;
import com.mika.dagger.main.MainActivity;
import com.mika.dagger.main.MainModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * @Author: mika
 * @Time: 2018/10/18 下午4:12
 * @Description:
 */
@Module
public abstract class NewActivityBindingModule {

    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity mainActivity();

    @ContributesAndroidInjector
    abstract DetailActivity detailActivity();
}
