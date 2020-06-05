package kodebase.event

import android.os.Bundle
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions
import androidx.navigation.fragment.FragmentNavigator

class NavigationEvent() : LiveEvent() {

    var resId: Int? = null
    var navArgs: Bundle? = null
    var navDirections: NavDirections? = null
    var navOptions: NavOptions? = null
    var navExtras: FragmentNavigator.Extras? = null


    constructor(resId: Int, navArgs: Bundle? = null, navOptions: NavOptions? = null, navExtras : FragmentNavigator.Extras? = null) : this() {
        this.resId = resId
        this.navArgs = navArgs
        this.navOptions = navOptions
        this.navExtras = navExtras
    }

    constructor(navDirections: NavDirections, navOptions: NavOptions? = null, navExtras : FragmentNavigator.Extras? = null) : this() {
        this.navDirections = navDirections
        this.navOptions = navOptions
        this.navExtras = navExtras
    }
}