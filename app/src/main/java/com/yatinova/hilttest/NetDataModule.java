package com.yatinova.hilttest;


import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;

/**
 * author : CYS
 * e-mail : 1584935420@qq.com
 * date : 2021/2/8 9:59
 * desc : 把具有提供注入方法的module类安装给app的组件。
 * version : 1.0
 */

@Module
@InstallIn(ApplicationComponent.class)
public class NetDataModule {
    //居然还要加入构造方法的注入（ @Inject）才可以配合@Provides的相应方法有效性。
    @Inject
    public NetDataModule() {
    }

    @Provides
    public String getData() {
        return "踩到朕的裙子了！！！！！";
    }
}
