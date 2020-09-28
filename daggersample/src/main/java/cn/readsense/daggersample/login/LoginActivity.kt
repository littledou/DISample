package cn.readsense.daggersample.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cn.readsense.daggersample.DLog
import cn.readsense.daggersample.MyApplication
import cn.readsense.daggersample.R
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {
    @Inject
    lateinit var loginViewModel: LoginViewModel

    lateinit var loginComponent: LoginComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //图提供容器
//        val userRepository1 = (application as MyApplication).applicationComponet.repository()
//        val userRepository2 = (application as MyApplication).applicationComponet.repository()
//        DLog.d("userRepository1==userRepository2: ${userRepository1 == userRepository2}")

        //注入activity到图，将会实例化activity中被@Inject的变量，其依赖项会按照图的规定依次实例化
//        (application as MyApplication).applicationComponet.inject(this)

        //使用子组件
        loginComponent = (application as MyApplication).applicationComponet.loginComponent().create()
        loginComponent.inject(this)
    }
}
