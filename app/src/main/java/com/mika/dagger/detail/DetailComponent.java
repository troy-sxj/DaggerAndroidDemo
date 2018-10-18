package com.mika.dagger.detail;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * @Author: mika
 * @Time: 2018/10/18 下午4:00
 * @Description:
 */
@Subcomponent
public interface DetailComponent extends AndroidInjector<DetailActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DetailActivity>{}
}
