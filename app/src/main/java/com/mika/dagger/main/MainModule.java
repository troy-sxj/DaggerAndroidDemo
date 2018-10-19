package com.mika.dagger.main;

import com.mika.dagger.data.GetUserDataRepositoryImpl;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * @Author: mika
 * @Time: 2018/10/17 下午7:11
 * @Description:
 */
@Module
public abstract class MainModule {

    @Binds
    abstract MainView mainView(MainActivity mainActivity);

    /**
     * 注意： Provides方法一定要用static修饰
     * @param mainView
     * @param getUserDataRepository
     * @return
     */
    @Provides
    static MainPresenter mainPresenter(MainView mainView, GetUserDataRepositoryImpl getUserDataRepository){
        return new MainPresenter(mainView, getUserDataRepository);
    }

}
