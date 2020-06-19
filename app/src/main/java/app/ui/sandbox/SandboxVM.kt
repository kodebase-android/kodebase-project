package app.ui.sandbox

import androidx.lifecycle.MutableLiveData
import app.ui.base.BaseVM
import app.ui.sandbox.event.SampleAlertDialogEvent

class SandboxVM : BaseVM() {

    fun showAlertDialog(){
        publish(SampleAlertDialogEvent())
    }

}
