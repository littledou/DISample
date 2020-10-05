package cn.readsense.hiltsample.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cn.readsense.hiltsample.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class HiltMainActivity : AppCompatActivity() {

    @Inject
    lateinit var analytics: AnalyticsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hilt_main)
    }
}
