package kodebase.adapter

import androidx.annotation.LayoutRes
import androidx.databinding.ObservableArrayList

import kodebase.viewmodel.KodebaseViewModel

/**
 * Handcrafted by Stepan Sonsky
 * Apache 2.0 License
 * https://github.com/kodebase-android
 */


class SingleTypeRecyclerAdapter<T> : KodebaseRecyclerAdapter<T> {

    @LayoutRes
    private var layoutId: Int = 0

    constructor(items: ObservableArrayList<T>, viewModel: KodebaseViewModel?, itemLaoyutId: Int) : super(items, viewModel) {
        this.layoutId = itemLaoyutId
    }

    constructor(items: ObservableArrayList<T>, itemLayoutId: Int) : super(items) {
        this.layoutId = itemLayoutId
    }

    override fun getLayoutId(itemType: Int): Int {
        return layoutId
    }
}
