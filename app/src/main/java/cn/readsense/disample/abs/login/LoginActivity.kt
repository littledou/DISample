package cn.readsense.disample.abs.login

import android.app.Activity
import android.os.Bundle
import cn.readsense.disample.abs.AppContainer
import cn.readsense.disample.abs.MyApplication

class LoginActivity : Activity() {

    private lateinit var loginViewModel: LoginViewModel
    private lateinit var appContainer: AppContainer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        appContainer = (application as MyApplication).appContainer
        appContainer.loginContainer = LoginContainer(appContainer.userRepository)
        loginViewModel = appContainer.loginContainer!!.loginViewModelFactory.create()

    }

    override fun onDestroy() {
        super.onDestroy()
        appContainer.loginContainer = null
    }
}