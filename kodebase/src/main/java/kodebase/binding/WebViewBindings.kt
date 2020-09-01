package kodebase.binding

import android.webkit.WebView
import androidx.databinding.BindingAdapter

/**
 * Handcrafted by Stepan Sonsky
 * Apache 2.0 License
 * https://github.com/kodebase-android
 */

@BindingAdapter("url")
fun setUrl(view: WebView, url: String?) {
    view.loadUrl(url)
}

@BindingAdapter("javaScriptEnabled")
fun setJavaScriptEnabled(view: WebView, enabled: Boolean) {
    view.settings.javaScriptEnabled = enabled
}