package kodebase.adapter

interface RecyclerLayoutStrategy {
    fun getLayoutId(item: Any): Int
}