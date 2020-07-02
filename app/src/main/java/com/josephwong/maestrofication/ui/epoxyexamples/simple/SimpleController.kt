package com.josephwong.maestrofication.ui.epoxyexamples.simple

import android.util.Log
import com.airbnb.epoxy.EpoxyController
import com.josephwong.maestrofication.models.FlyerModel
import com.josephwong.maestrofication.ui.maestro.models.PremiumFlyerModel_

class SimpleController : EpoxyController() {

    private var flyers: ArrayList<FlyerModel>? = null

    fun setPremiumFlyers(flyers: ArrayList<FlyerModel>) {
        this.flyers = flyers
        requestModelBuild()
    }

    override fun buildModels() {
        flyers?.forEach { flyer ->
            PremiumFlyerModel_()
                .id(flyer.id)
                .containerClickListener() { _ ->
                    Log.e("JOEJOE", "click!")
                }
                .flyerTitle(flyer.flyerTitle)
                .flyerThumbnailUrl(flyer.thumbnailUrl)
                .addTo(this)
        }
    }
}
