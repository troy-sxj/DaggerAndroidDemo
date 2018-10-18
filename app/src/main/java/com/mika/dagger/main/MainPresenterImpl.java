package com.mika.dagger.main;

import android.util.Log;

import javax.inject.Inject;

/**
 * @Author: mika
 * @Time: 2018/10/18 下午4:35
 * @Description:
 */
public class MainPresenterImpl implements MainPresenter{

    @Inject
    public MainPresenterImpl() {
    }

    @Override
    public void loadData() {
        Log.e("MainPresenterImpl", "MainPresenterImpl ---- loadData " );
    }
}
