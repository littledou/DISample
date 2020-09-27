package cn.readsense.disample.abs

import cn.readsense.disample.abs.factory.LoginViewModelFactory
import cn.readsense.disample.abs.login.LoginContainer

class AppContainer {

    private val httpUtil = HttpUtil()
    private val remoreDataSource = UserRemoreDataSource(httpUtil)
    private val localDataSource = UserLocalDataSource()
    val userRepository = UserRepository(localDataSource, remoreDataSource)

    var loginContainer: LoginContainer? = null

}