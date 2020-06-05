package app.ui.sample

import app.ui.base.BaseVM
import app.ui.sample.event.SampleAlertDialogEvent
import kodebase.event.LiveEvent

class SampleVM : BaseVM() {

    fun showAlertDialog(){
        publish(SampleAlertDialogEvent())
    }

}
