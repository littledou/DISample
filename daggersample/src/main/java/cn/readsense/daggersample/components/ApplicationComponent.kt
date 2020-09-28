package cn.readsense.daggersample.components

import cn.readsense.daggersample.datasource.UserRepository
import cn.readsense.daggersample.login.LoginActivity
import cn.readsense.daggersample.login.LoginComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [SubcomponentsModule::class])
interface ApplicationComponent {

    fun repository(): UserRepository

    fun inject(activity: LoginActivity)

    fun loginComponent(): LoginComponent.Factory
}