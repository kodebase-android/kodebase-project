package app.ui.sample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import app.ui.base.BaseFragment
import app.R
import app.databinding.FragmentSampleBinding
import app.ui.sample.event.SampleAlertDialogEvent

class SampleFragment : BaseFragment<FragmentSampleBinding, SampleVM>(R.layout.fragment_sample, SampleVM::class) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        subscribe(SampleAlertDialogEvent::class){
            AlertDialog.Builder(requireContext())
                .setTitle("Alert Dialog")
                .setMessage("This is, how alert dialog look like with your theme.")
                .setPositiveButton("It's ok") { dialog, button ->
                    Toast.makeText(requireContext(), "Good", Toast.LENGTH_LONG).show()}
                .setNegativeButton("Not ok")  { dialog, button ->
                    Toast.makeText(requireContext(), "Let's edit your theme", Toast.LENGTH_LONG).show()}
                .show()
        }
    }
}
