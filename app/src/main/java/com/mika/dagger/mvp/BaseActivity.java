package com.mika.dagger.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;

import dagger.android.support.DaggerAppCompatActivity;

/**
 * @Author: mika
 * @Time: 2018/10/19 下午3:24
 * @Description:
 */
public abstract class BaseActivity<P extends BasePresenter> extends DaggerAppCompatActivity {

    P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initView();
        initListener();
        mPresenter = initPresenter();
        initData(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(mPresenter != null) {
            mPresenter.attachView();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(mPresenter != null) {
            mPresenter.detachView();
        }
    }

    @Override
    protected void onDestroy() {
        if(mPresenter != null) {
            mPresenter.release();
        }
        super.onDestroy();
    }

    protected abstract int getLayoutId();

    protected abstract void initView();

    protected abstract void initListener();

    protected abstract P initPresenter();

    protected abstract void initData(Bundle bundle);

}
