package cn.readsense.hiltsample.main

import cn.readsense.hiltsample.DLog
import javax.inject.Inject

class AnalyticsAdapter @Inject constructor(
    private val service: AnalyticsService
) {

    init {
        DLog.d("AnalyticsAdapter init")
    }
}