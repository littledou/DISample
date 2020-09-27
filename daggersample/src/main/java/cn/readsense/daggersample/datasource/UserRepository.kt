package cn.readsense.daggersample.datasource

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor(
    private val localDataSource: UserLocalDataSource,
    private val remoreDataSource: UserRemoreDataSource
) {


}