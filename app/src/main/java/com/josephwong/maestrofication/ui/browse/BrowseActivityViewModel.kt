package com.josephwong.maestrofication.ui.browse

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.josephwong.maestrofication.repositories.MaestroRepository
import com.josephwong.maestrofication.ui.maestro.MaestroFragmentViewState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BrowseActivityViewModel(
    private val maestroRepository: MaestroRepository
) : ViewModel() {

    private var viewState_: MutableLiveData<BrowseActivityViewState> = MutableLiveData()
    val viewState: LiveData<BrowseActivityViewState>
        get() = viewState_


    fun fetchMaestroData(category: String? = null) {
        viewModelScope.launch(Dispatchers.IO) {
            val maestroResponse = maestroRepository.fetchCleanMaestroResponse(category)
            if (maestroResponse == null) {
                viewState_.postValue(BrowseActivityViewState.Error("ERROR: We were unable to parse MaestroResponse"))
            } else {
                viewState_.postValue(BrowseActivityViewState.Ready(maestroResponse))
            }
        }
    }
}
