package cn.readsense.koinsample.intro

class HelloServiceImpl(private val helloMessageData: HelloMessageData) : HelloService {
    override fun hello() = "Hey, ${helloMessageData.message}"
}