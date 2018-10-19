package com.mika.dagger.mvp;

import com.mika.dagger.data.DataRepository;

/**
 * @Author: mika
 * @Time: 2018/10/19 下午3:09
 * @Description: <p>
 * 处理P层通用逻辑
 * </p>
 */
public abstract class MvpPresenter<V extends BaseView> implements BasePresenter<V> {

    private boolean isViewAttach;
    private V view;

    public MvpPresenter(V view, DataRepository ... dataRepositories){
        this(view);
    }

    public MvpPresenter(V view){
        this.view = view;
    }

    @Override
    public void attachView() {
        isViewAttach = true;
    }

    @Override
    public void detachView() {
        isViewAttach = false;
    }

    @Override
    public boolean isViewAttach() {
        return isViewAttach;
    }

    @Override
    public V getView() {
        return view;
    }
}
