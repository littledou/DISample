package cn.readsense.hiltsample.main

import cn.readsense.hiltsample.DLog
import javax.inject.Inject

class AnalyticsServiceImpl @Inject constructor() : AnalyticsService {

    override fun analyticsMethods() {

    }

    init {
        DLog.d("AnalyticsServiceImpl init")
    }
}