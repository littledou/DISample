package cn.readsense.hiltsample

import android.util.Log

class DLog {

    companion object {
        fun d(log: String) {
            Log.e("DLog", log)
        }

        fun e(log: String) {
            Log.e("DLog", log)
        }
    }

}