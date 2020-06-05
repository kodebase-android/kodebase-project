package kodebase.binding

import android.net.Uri
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import java.io.File

@BindingAdapter(value = ["imageResource"], requireAll = false)
fun setImageResource(view: AppCompatImageView, resId: Int) {
    view.setImageResource(resId)
}

@BindingAdapter(value = ["url"], requireAll = false)
fun setUrl(view: ImageView, url: String?) {
    Glide.with(view.context).load(url).into(view)
}

@BindingAdapter(value = ["uri"], requireAll = false)
fun setUri(view: ImageView, uri: Uri?) {
    Glide.with(view.context).load(uri).into(view)
}

@BindingAdapter(value = ["file"], requireAll = false)
fun setFile(view: ImageView, file: File?) {
    Glide.with(view.context).load(file).into(view)
}


