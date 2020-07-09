package com.josephwong.maestrofication.ui.maestro

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.josephwong.maestrofication.models.MaestroResponseWrapper
import com.josephwong.maestrofication.repositories.MaestroRepository
import com.josephwong.maestrofication.services.maestro.componentModels.components.PremiumFlyerComponentModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MaestroFragmentViewModel(
    private val maestroRepository: MaestroRepository
) : ViewModel() {

    private var viewState_: MutableLiveData<MaestroFragmentViewState> = MutableLiveData()
    val viewState: LiveData<MaestroFragmentViewState>
        get() = viewState_


    fun fetchMaestroData(category: String? = null) {

//        if (category == "favorite") {
//            loadFavourites()
//            return
//        }

        viewModelScope.launch(Dispatchers.IO) {
            val maestroResponse = maestroRepository.fetchCleanMaestroResponse(category)
            if (maestroResponse == null) {
                viewState_.postValue(MaestroFragmentViewState.Error("ERROR: We were unable to parse MaestroResponse"))
            } else {
                viewState_.postValue(MaestroFragmentViewState.Ready(maestroResponse))
            }
        }
    }

    fun loadFavourites() {
//        // fetch all favourited merchants and their flyers here
//        val dbResponse: List<Flyers>
//
//        val maestroResponseWrapper = MaestroResponseWrapper("foo")
//
//        for each dbResponse item:
//            val flyer: PremiumFlyerComponentModel = PremiumFlyerComponentModel(flyer.id, flyer.imageUrl, flyer.whatever) // we know this extends IComponentModel
//            maestroResponseWrapper.componentModels.add(flyer)
//
//        return maestroResponseWrapper
    }
}
