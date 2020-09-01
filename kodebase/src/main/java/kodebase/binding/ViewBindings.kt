package kodebase.binding

import android.content.Intent
import android.net.Uri
import android.util.Log
import android.view.View
import androidx.databinding.BindingAdapter

/**
 * Handcrafted by Stepan Sonsky
 * Apache 2.0 License
 * https://github.com/kodebase-android
 */

@BindingAdapter("backgroundResource")
fun setBackgroundResource(view: View, resId: Int) {
    if (resId != 0) {
        view.setBackgroundResource(resId)
    } else {
        view.background = null
    }
}

@BindingAdapter("visibleOrGone")
fun setVisibleOrGone(view: View, visible: Boolean) {
    view.visibility = if (visible) View.VISIBLE else View.GONE
}

@BindingAdapter("visibleOrInvisible")
fun setVisibleOrInvisible(view: View, visible: Boolean) {
    view.visibility = if (visible) View.VISIBLE else View.INVISIBLE
}

@BindingAdapter("onClickUrl")
fun setOnclickUrl(view: View, url: String?) {
    view.setOnClickListener {
        try {
            view.context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        } catch (t : Throwable){
            Log.d("View.onClickUrl", t.message ?: t.toString())
        }
    }
}
