package com.mika.dagger.mvp;

import android.support.annotation.UiThread;

/**
 * @Author: mika
 * @Time: 2018/10/19 下午3:09
 * @Description:
 */
public interface BasePresenter<V extends BaseView> {

    @UiThread
    void attachView();

    @UiThread
    V getView();

    @UiThread
    void detachView();

    boolean isViewAttach();

    void release();
}
