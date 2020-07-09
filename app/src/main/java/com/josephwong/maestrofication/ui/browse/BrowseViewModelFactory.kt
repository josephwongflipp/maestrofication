package com.josephwong.maestrofication.ui.browse

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.josephwong.maestrofication.repositories.MaestroRepository

class BrowseViewModelFactory(
    private val maestroRepository: MaestroRepository
) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return BrowseActivityViewModel(maestroRepository) as T
    }
}