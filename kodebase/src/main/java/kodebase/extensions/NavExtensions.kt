package kodebase.extensions

import androidx.navigation.NavController
import kodebase.event.NavigationEvent

fun NavController.navigate(navEvent: NavigationEvent) {
    if (navEvent.resId != null) {
        navigate(navEvent.resId!!, navEvent.navArgs, navEvent.navOptions, navEvent.navExtras)
    } else if (navEvent.navDirections != null) {
        if (navEvent.navExtras != null){
            navigate(navEvent.navDirections!!, navEvent.navExtras!!)
        } else {
            navigate(navEvent.navDirections!!, navEvent.navOptions)
        }
    }
}