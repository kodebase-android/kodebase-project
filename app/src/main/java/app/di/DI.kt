package app.di

import app.ui.MainVM
import app.ui.sample.SampleVM
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainVM() }
    viewModel { SampleVM() }
}

val repositoryModule = module {
    // Place your repositories here
}

val allModules = listOf(
    viewModelModule,
    repositoryModule
)