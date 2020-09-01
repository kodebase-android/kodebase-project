package kodebase.viewmodel

import android.os.Bundle
import androidx.annotation.IdRes
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions
import androidx.navigation.fragment.FragmentNavigator
import kodebase.event.LiveEvent
import kodebase.event.LiveEventMap
import kodebase.event.NavigationEvent
import kotlin.reflect.KClass

/**
 * Handcrafted by Stepan Sonsky
 * Apache 2.0 License
 * https://github.com/kodebase-android
 */

abstract class KodebaseViewModel : ViewModel(), LifecycleObserver {

    private val liveEventMap = LiveEventMap()

    fun <T : LiveEvent> subscribe(
        lifecycleOwner: LifecycleOwner,
        eventClass: KClass<T>,
        eventObserver: Observer<T>
    ) {
        liveEventMap.subscribe(lifecycleOwner, eventClass, eventObserver)
    }

    fun <T : LiveEvent> publish(event: T) {
        liveEventMap.publish(event)
    }

    protected fun navigate(@IdRes resId: Int, args: Bundle? = null, navOptions: NavOptions? = null) {
        publish(NavigationEvent(resId, args, navOptions))
    }

    protected fun navigate(directions: NavDirections, navOptions: NavOptions? = null, navExtras : FragmentNavigator.Extras? = null) {
        publish(NavigationEvent(navDirections = directions, navOptions = navOptions, navExtras = navExtras))
    }
}
