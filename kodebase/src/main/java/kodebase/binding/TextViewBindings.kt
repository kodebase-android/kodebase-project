package kodebase.binding

import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter

/**
 * Handcrafted by Stepan Sonsky
 * Apache 2.0 License
 * https://github.com/kodebase-android
 */

@BindingAdapter("textColorResource")
fun setTextColor(editText: TextView, resId: Int?) {
    if (resId != null && resId != 0) {
        editText.setTextColor(ContextCompat.getColor(editText.context, resId))
    }
}

@BindingAdapter("textResource")
fun setTextResource(editText: TextView, resId: Int?) {
    if (resId != null) {
        editText.setText(resId)
    } else {
        editText.text = null
    }
}