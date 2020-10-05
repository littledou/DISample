[概览](https://developer.android.com/training/dependency-injection)

### 什么是依赖注入

#### 什么是依赖
类通常需要引用其他类
#### 依赖注入

#### 优点

-重用代码
-易于重构
-易于测试
 
### 手动依赖注入
-构造函数注入
-字段注入
### 自动依赖注入

#### Dagger
Dagger使用@Component注释一个接口，然后在该接口中定义容器、注入对象
#####依赖
```groovy
//kotlin
apply plugin: 'kotlin-kapt'
dependencies {
    implementation 'com.google.dagger:dagger:2.x'
    kapt 'com.google.dagger:dagger-compiler:2.x'
}
//java
dependencies {
    implementation 'com.google.dagger:dagger:2.x'
    annotationProcessor 'com.google.dagger:dagger-compiler:2.x'
}
```
##### 关键字
-`@Inject`：告知Dagger如何创建该类，其依赖项必须也增加该注释

-`@Singleton`：此类单例实例化，对应的图接口也必须增加该注释

-`@Component`：定义该接口为一个依赖关系图，会让Dagger生成一个容器，其中包含满足其提供的类型的所需所以依赖项

-`@Binds`：告知 Dagger 接口应采用哪种实现

-`@Provides`：告知 Dagger 如何提供您的项目所不具备的类

-`@ApplicationScope`：

-`@LoggedUserScope`：

-`@ActivityScope`：

-`@DisableInstallInCheck`：... is missing an @InstallIn annotation. If this was intentional,see [this page](https://dagger.dev/hilt/compiler-options#disable-install-in-check) for how to disable this check

##### 定义图的功能
```kotlin
@Singleton
@Component
interface ApplicationComponet {
    //1. 提供一个函数图返回内容容器
    fun repository(): UserRepository
    //2. 提供一个函数，让该函数将请求注入的对象作为参数，图需要满足LoginActivity请求的字段的所有依赖项
    fun inject(activity: LoginActivity)
}

//使用
class LoginActivity : AppCompatActivity() {
    @Inject
    lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //图提供容器
        val userRepository1 = (application as MyApplication).applicationComponet.repository()
        val userRepository2 = (application as MyApplication).applicationComponet.repository()
        DLog.d("userRepository1==userRepository2: ${userRepository1 == userRepository2}")

        //注入activity到图，将会实例化activity中被@Inject的变量，其依赖项会按照图的规定依次实例化
        (application as MyApplication).applicationComponet.inject(this)
    }
}
```
##### 模块
##### 作用域
##### 子模块
新组件必须是包含共享资源的组件的子组件，子组件是继承并扩展父组件的对象图的组件


#### Hilt