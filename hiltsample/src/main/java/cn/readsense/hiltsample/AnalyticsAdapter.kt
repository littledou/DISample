package cn.readsense.hiltsample

import javax.inject.Inject

class AnalyticsAdapter @Inject constructor(
    private val service: AnalyticsService
) {

    init {
        DLog.d("AnalyticsAdapter init")
    }
}