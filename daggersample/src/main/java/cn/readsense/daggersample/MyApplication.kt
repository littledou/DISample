package cn.readsense.daggersample

import android.app.Application
import cn.readsense.daggersample.datasource.DaggerApplicationComponet

class MyApplication : Application() {
    val applicationComponet = DaggerApplicationComponet.create()
}