package app.di

import app.ui.MainActivityVM
import app.ui.main.MainVM
import app.ui.sandbox.SandboxVM
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainActivityVM() }
    viewModel { MainVM() }
    viewModel { SandboxVM() }
}

val repositoryModule = module {
    // Place your repositories here
}

val allModules = listOf(
    viewModelModule,
    repositoryModule
)