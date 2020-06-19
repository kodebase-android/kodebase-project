package app.ui

import android.os.Bundle
import androidx.navigation.ui.setupWithNavController
import app.ui.base.BaseActivity
import app.R
import app.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<ActivityMainBinding, MainActivityVM>(R.layout.activity_main, MainActivityVM::class) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSupportActionBar(toolbar)
        toolbar.setupWithNavController(navController())
    }
}
