package cn.readsense.daggersample.datasource

import cn.readsense.daggersample.DLog
import javax.inject.Inject

class UserLocalDataSource @Inject constructor() {

    init {
        DLog.d("UserLocalDataSource init")
    }
}