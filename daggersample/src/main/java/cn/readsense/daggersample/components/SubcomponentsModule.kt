package cn.readsense.daggersample.components

import cn.readsense.daggersample.login.LoginComponent
import dagger.Module
import dagger.hilt.migration.DisableInstallInCheck

@DisableInstallInCheck
@Module(subcomponents = [LoginComponent::class])
class SubcomponentsModule {}