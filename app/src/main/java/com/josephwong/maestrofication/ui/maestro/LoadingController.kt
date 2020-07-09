package com.josephwong.maestrofication.ui.maestro

import com.airbnb.epoxy.EpoxyController
import com.josephwong.maestrofication.services.maestro.models.LoadingFlyerModel_
import kotlin.random.Random

class LoadingController : EpoxyController() {

    init {
        requestModelBuild()
    }

    override fun buildModels() {
        for (i in 0 .. 2) {
            LoadingFlyerModel_()
                .id("loading-$i")
                .spanSizeOverride { totalSpanCount, position, itemCount ->
                    totalSpanCount
                }
                .addTo(this)
        }
    }
}
