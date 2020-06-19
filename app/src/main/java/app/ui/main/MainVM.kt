package app.ui.main

import app.ui.base.BaseVM

class MainVM : BaseVM() {

    fun navigateToSandbox(){
        navigate(MainFragmentDirections.actionMainToSandbox())
    }

}
