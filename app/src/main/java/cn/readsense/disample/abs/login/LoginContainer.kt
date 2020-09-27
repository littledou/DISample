package cn.readsense.disample.abs.login

import cn.readsense.disample.abs.UserRepository
import cn.readsense.disample.abs.factory.LoginViewModelFactory

class LoginContainer(val userRepository: UserRepository) {
    val loginData = LoginData()
    val loginViewModelFactory = LoginViewModelFactory(userRepository)
}