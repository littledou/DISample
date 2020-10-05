package cn.readsense.koinsample.intro

import org.koin.core.KoinComponent
import org.koin.core.inject

class HelloApplication : KoinComponent {
    val helloService by inject<HelloService>()

    fun sayHello() = println(helloService.hello())

}