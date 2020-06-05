package app.ui.base

import androidx.databinding.ViewDataBinding
import kodebase.view.KodebaseActivity
import kotlin.reflect.KClass

open class BaseActivity<B : ViewDataBinding, VM : BaseVM>(layoutId: Int, viewModelClass: KClass<VM>) : KodebaseActivity<B,VM>(layoutId, viewModelClass) {
}