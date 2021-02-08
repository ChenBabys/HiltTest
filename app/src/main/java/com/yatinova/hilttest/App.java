package com.yatinova.hilttest;

import android.app.Application;
import dagger.hilt.android.HiltAndroidApp;

/**
 * author : CYS
 * e-mail : 1584935420@qq.com
 * date : 2021/2/8 9:55
 * desc : 所有使用 Hilt 的应用都必须包含一个带有 @HiltAndroidApp 注释的 Application 类。
 * 生成的这一 Hilt 组件会附加到 Application 对象的生命周期，并为其提供依赖项。此外，它也是应用的父组件，这意味着，其他组件可以访问它提供的依赖项。
 * version : 1.0
 */
@HiltAndroidApp
public class App extends Application {


}
