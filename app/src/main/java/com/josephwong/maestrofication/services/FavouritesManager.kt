package com.josephwong.maestrofication.services

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.josephwong.maestrofication.models.FlyerModel
import com.josephwong.maestrofication.models.FavouriteDataWrapper
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FavouritesManager @Inject constructor() {
    private val _readFlyersLiveData: MutableLiveData<HashMap<String, FlyerModel?>> = MutableLiveData()
    val readFlyerLiveData: LiveData<HashMap<String, FlyerModel?>> get() = _readFlyersLiveData

    private val cache: HashMap<String, FlyerModel?> = HashMap()

    fun addFavourite(wrapper: FavouriteDataWrapper) {
        cache[wrapper.flyerId] = null
        _readFlyersLiveData.value = cache
    }

    fun isFlyerFavourited(id: String): Boolean {
        return cache.containsKey(id)
    }
}
