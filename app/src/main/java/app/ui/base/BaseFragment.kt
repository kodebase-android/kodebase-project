package app.ui.base

import androidx.databinding.ViewDataBinding
import app.ui.MainActivityVM
import kodebase.view.KodebaseFragment
import org.koin.androidx.viewmodel.ext.android.sharedViewModel
import kotlin.reflect.KClass

open class BaseFragment<B : ViewDataBinding, VM : BaseVM>(layoutId: Int, viewModelClass: KClass<VM>) : KodebaseFragment<B,VM>(layoutId, viewModelClass) {
    val activityViewModel : MainActivityVM by sharedViewModel()
}