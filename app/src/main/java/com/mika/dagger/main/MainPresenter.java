package com.mika.dagger.main;

import android.util.Log;

import com.mika.dagger.data.GetUserDataRepositoryImpl;
import com.mika.dagger.mvp.MvpPresenter;

import javax.inject.Inject;

/**
 * @Author: mika
 * @Time: 2018/10/19 下午3:30
 * @Description:
 */
public class MainPresenter extends MvpPresenter<MainView> {

    private GetUserDataRepositoryImpl getUserDataRepository;

    @Inject
    public MainPresenter(MainView view, GetUserDataRepositoryImpl getUserDataRepository) {
        super(view);
        this.getUserDataRepository = getUserDataRepository;
    }

    @Override
    public void release() {
        if (getUserDataRepository != null) {
            getUserDataRepository.release();
        }
    }

    public void loadData() {
        Log.e("aaa", "load data");
        getView().onLoadData(getUserDataRepository.getUser().toString());
    }
}
