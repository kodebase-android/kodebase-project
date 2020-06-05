package kodebase.binding

import androidx.databinding.BindingAdapter
import androidx.databinding.ObservableArrayList
import androidx.viewpager2.widget.ViewPager2
import kodebase.adapter.KodebaseRecyclerAdapter
import kodebase.adapter.SingleTypeRecyclerAdapter
import kodebase.viewmodel.KodebaseViewModel
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

@BindingAdapter(
    value = ["viewModel", "items", "layoutId", "tabLayout"],
    requireAll = false
)
fun <T> bindItems(
    view: ViewPager2,
    vm: KodebaseViewModel?,
    items: ObservableArrayList<T>,
    layoutId: Int?,
    tabLayout: TabLayout?
) {
    if (view.adapter == null) {
        if (layoutId != null) {
            view.adapter = SingleTypeRecyclerAdapter(items, vm, layoutId)
        }
        if (tabLayout != null) {
            // Use TabLayout as ViewPager2 indicator
            TabLayoutMediator(tabLayout, view) { _, _ -> }.attach()
        }
    } else {
        (view.adapter as KodebaseRecyclerAdapter<T>).setItems(items)
    }
}