package cn.readsense.daggersample.login

import cn.readsense.daggersample.DLog
import cn.readsense.daggersample.datasource.UserRepository
import javax.inject.Inject


class LoginViewModel @Inject constructor(userRepository: UserRepository) {

    init {
        DLog.d("LoginViewModel init")
    }
}

