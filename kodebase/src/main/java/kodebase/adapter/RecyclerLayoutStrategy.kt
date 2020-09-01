package kodebase.adapter

/**
 * Handcrafted by Stepan Sonsky
 * Apache 2.0 License
 * https://github.com/kodebase-android
 */


interface RecyclerLayoutStrategy {
    fun getLayoutId(item: Any): Int
}