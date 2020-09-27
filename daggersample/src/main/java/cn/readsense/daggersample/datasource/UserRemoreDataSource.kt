package cn.readsense.daggersample.datasource

import cn.readsense.daggersample.DLog
import javax.inject.Inject

class UserRemoreDataSource @Inject constructor(httpUtil: HttpUtil) {
    init {
        DLog.d("UserRemoreDataSource init")
    }
}