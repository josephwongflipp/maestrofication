package com.josephwong.maestrofication

import android.app.Application
import com.josephwong.maestrofication.services.FavouritesManager
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class MaestroApplication : Application() {
    @Inject
    lateinit var favouritesManager: FavouritesManager
}