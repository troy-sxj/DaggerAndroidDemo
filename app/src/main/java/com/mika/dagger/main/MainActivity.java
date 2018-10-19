package com.mika.dagger.main;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mika.dagger.R;
import com.mika.dagger.mvp.BaseActivity;

import javax.inject.Inject;

public class MainActivity extends BaseActivity<MainPresenter> implements MainView {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    MainPresenter mainPresenter;

    private Button btn;
    private TextView tv;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        btn = findViewById(R.id.btn);
        tv = findViewById(R.id.tv);
    }

    @Override
    protected void initListener() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.loadData();
            }
        });
    }

    @Override
    protected MainPresenter initPresenter() {
        return mainPresenter;
    }

    @Override
    protected void initData(Bundle bundle) {

    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void onLoadData(String data) {
        tv.setText(data);
    }
}
