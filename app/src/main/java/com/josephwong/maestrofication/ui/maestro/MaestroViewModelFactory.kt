package com.josephwong.maestrofication.ui.maestro

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.josephwong.maestrofication.repositories.MaestroRepository

class MaestroViewModelFactory(
    private val maestroRepository: MaestroRepository
) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MaestroFragmentViewModel(maestroRepository) as T
    }
}
