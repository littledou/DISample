package cn.readsense.disample.abs.factory

interface Factory<T> {
    fun create(): T
}