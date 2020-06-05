package kodebase.binding

import androidx.databinding.BindingAdapter
import androidx.databinding.ObservableArrayList
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.RecyclerView
import kodebase.adapter.KodebaseRecyclerAdapter
import kodebase.adapter.RecyclerLayoutStrategy
import kodebase.adapter.SingleTypeRecyclerAdapter
import kodebase.adapter.MultiTypeRecyclerAdapter
import kodebase.viewmodel.KodebaseViewModel


/**
 * Created by Stepan on 23.11.2016.
 */

@BindingAdapter(
    value = ["viewModel", "items", "layoutId", "layoutStrategy", "lifecycle", "parentItem"],
    requireAll = false
)
fun <T> bindItems(
    view: RecyclerView,
    vm: KodebaseViewModel?,
    items: ObservableArrayList<T>,
    layoutId: Int?,
    layoutStrategy: RecyclerLayoutStrategy?,
    lifecycleOwner: LifecycleOwner?,
    parentItem: Any?
) {
    if (view.adapter == null) {
        if (layoutStrategy == null) {
            if (layoutId != null) {
                view.adapter = SingleTypeRecyclerAdapter(items, vm, layoutId)
            }
        } else {
            view.adapter = MultiTypeRecyclerAdapter(items as ObservableArrayList<Any>, layoutStrategy, vm)
        }
    } else {
        (view.adapter as KodebaseRecyclerAdapter<T>).setItems(items)
    }
    (view.adapter as KodebaseRecyclerAdapter<*>).lifecycleOwner = lifecycleOwner
    (view.adapter as KodebaseRecyclerAdapter<*>).parentItem = parentItem
}
