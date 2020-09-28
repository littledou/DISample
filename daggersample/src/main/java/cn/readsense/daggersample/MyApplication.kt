package cn.readsense.daggersample

import android.app.Application
import cn.readsense.daggersample.components.DaggerApplicationComponent

class MyApplication : Application() {
    val applicationComponet = DaggerApplicationComponent.create()
}