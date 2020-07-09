package com.josephwong.maestrofication.services.maestro.models.bestdeal

import com.airbnb.epoxy.EpoxyController

class BestDealController : EpoxyController() {

    init {
        requestModelBuild()
    }

    override fun buildModels() {


        for (i in 0..10) {
            BestDealModel_()
                .id(0)
                .thumbnailUrl("http://placekitten.com/300/300")
                .title("BEST DEAL ITEM")
                .addTo(this)
        }
    }
}
