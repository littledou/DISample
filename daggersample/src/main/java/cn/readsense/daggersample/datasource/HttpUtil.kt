package cn.readsense.daggersample.datasource

import cn.readsense.daggersample.DLog
import javax.inject.Inject

class HttpUtil @Inject constructor() {
    init {
        DLog.d("HttpUtil init")
    }
}