package kodebase.viewmodel

/**
 * Handcrafted by Stepan Sonsky
 * Apache 2.0 License
 * https://github.com/kodebase-android
 */

open class KodebaseDialogViewModel : KodebaseViewModel() {
    var title: String? = null
    var message: String? = null
    var positiveButton: String? = null
    var negativeButton: String? = null
    var neutralButton: String? = null
}
