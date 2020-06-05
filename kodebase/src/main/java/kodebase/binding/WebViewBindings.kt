package kodebase.binding

import android.webkit.WebView
import androidx.databinding.BindingAdapter

@BindingAdapter("url")
fun setUrl(view: WebView, url: String?) {
    view.loadUrl(url)
}

@BindingAdapter("javaScriptEnabled")
fun setJavaScriptEnabled(view: WebView, enabled: Boolean) {
    view.settings.javaScriptEnabled = enabled
}