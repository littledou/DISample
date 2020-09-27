package cn.readsense.daggersample.datasource

import cn.readsense.daggersample.login.LoginActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface ApplicationComponet {
    fun repository(): UserRepository

    fun inject(activity: LoginActivity)

}