package com.josephwong.maestrofication.ui.epoxyexamples

import android.util.Log
import android.view.View
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
                .clickListener { _ ->
                    Log.e("JOEJOE", "click!")
                }
                .headerTitle(flyer.flyerTitle)
                .headerSubtitle(flyer.flyerSubtitle)
                .thumbnailUrl(flyer.thumbnailUrl)
                .footerTitle(flyer.merchantName)
                .addTo(this)
        }
    }
}
