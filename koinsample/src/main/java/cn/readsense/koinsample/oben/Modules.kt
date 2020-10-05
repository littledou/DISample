package cn.readsense.koinsample.oben

import org.koin.dsl.module


val appModule = module {
    single { SchoolCourse() }

    factory { Friend() }

    factory { Student(get(), get()) }
}