package com.josephwong.maestrofication.ui.launcher

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.josephwong.maestrofication.repositories.MaestroRepository
import com.josephwong.maestrofication.ui.maestro.MaestroFragmentViewState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LauncherActivityViewModel @ViewModelInject constructor(
    private val maestroRepository: MaestroRepository
) : ViewModel() {


    private var viewState_: MutableLiveData<LauncherActivityViewState> = MutableLiveData()
    val viewState: LiveData<LauncherActivityViewState>
        get() = viewState_


    fun fetchExploreMaestroForNavigationTabs() {
        viewModelScope.launch(Dispatchers.IO) {
            val mrWrapper = maestroRepository.fetchCleanMaestroResponse()
            if (mrWrapper == null) {
                viewState_.postValue(LauncherActivityViewState.Error("ERROR: We were unable to parse MaestroResponse"))
            } else {
                viewState_.postValue(LauncherActivityViewState.Ready(mrWrapper))
            }
        }
    }
}
