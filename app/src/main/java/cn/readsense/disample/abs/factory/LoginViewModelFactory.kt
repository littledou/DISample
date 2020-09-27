package cn.readsense.disample.abs.factory

import cn.readsense.disample.abs.login.LoginViewModel
import cn.readsense.disample.abs.UserRepository

class LoginViewModelFactory(private val userRepository: UserRepository) : Factory<LoginViewModel> {
    override fun create(): LoginViewModel {
        return LoginViewModel(userRepository)
    }
}