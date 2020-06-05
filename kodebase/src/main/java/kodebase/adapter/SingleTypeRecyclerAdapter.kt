package kodebase.adapter

import androidx.annotation.LayoutRes
import androidx.databinding.ObservableArrayList

import kodebase.viewmodel.KodebaseViewModel

class SingleTypeRecyclerAdapter<T> : KodebaseRecyclerAdapter<T> {

    @LayoutRes
    private var layoutId: Int = 0

    constructor(items: ObservableArrayList<T>, viewModel: KodebaseViewModel?, itemLaoyutId: Int) : super(items, viewModel) {
        this.layoutId = itemLaoyutId
    }

    constructor(items: ObservableArrayList<T>, itemLaoyutId: Int) : super(items) {
        this.layoutId = itemLaoyutId
    }

    override fun getLayoutId(itemType: Int): Int {
        return layoutId
    }
}
