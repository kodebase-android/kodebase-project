package kodebase.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.IdRes
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions
import androidx.navigation.fragment.NavHostFragment
import kodebase.event.LiveEvent
import kodebase.event.NavigationEvent
import kodebase.extensions.navigate
import kodebase.viewmodel.KodebaseViewModel
import kodebase.BR
import org.koin.androidx.viewmodel.ext.android.sharedViewModel
import kotlin.reflect.KClass

/**
 * Handcrafted by Stepan Sonsky
 * Apache 2.0 License
 * https://github.com/kodebase-android
 */

abstract class KodebaseDialogFragment<B : ViewDataBinding, VM : KodebaseViewModel>(@LayoutRes val layoutId: Int, viewModelClass: KClass<VM>) :
    DialogFragment() {

    protected lateinit var binding: B
    protected val viewModel: VM by sharedViewModel(viewModelClass)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycle.addObserver(viewModel)
        subscribe(NavigationEvent::class) {
            navController().navigate(it)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, layoutId, container, false)
        binding.lifecycleOwner = this
        binding.setVariable(BR.vm, viewModel)
        return binding.root
    }

    override fun onDestroy() {
        lifecycle.removeObserver(viewModel)
        super.onDestroy()
    }

    protected fun <T : LiveEvent> subscribe(eventClass: KClass<T>, eventObserver: (T) -> Unit) {
        viewModel.subscribe(this, eventClass, Observer(eventObserver))
    }

    protected fun navController(): NavController {
        return NavHostFragment.findNavController(this)
    }

    protected fun navigate(@IdRes resId: Int, args: Bundle? = null, navOptions: NavOptions? = null) {
        navController().navigate(resId, args, navOptions)
    }

    protected fun navigate(directions: NavDirections, navOptions: NavOptions? = null) {
        navController().navigate(directions, navOptions)
    }
}