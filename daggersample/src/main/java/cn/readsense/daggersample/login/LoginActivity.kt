package cn.readsense.daggersample.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cn.readsense.daggersample.DLog
import cn.readsense.daggersample.MyApplication
import cn.readsense.daggersample.R
import cn.readsense.daggersample.datasource.DaggerApplicationComponet
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {


//    @Inject
//    lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userRepository1 = (application as MyApplication).applicationComponet.repository()
        val userRepository2 = (application as MyApplication).applicationComponet.repository()

        DLog.d("userRepository1==userRepository2: ${userRepository1 == userRepository2}")


    }
}
