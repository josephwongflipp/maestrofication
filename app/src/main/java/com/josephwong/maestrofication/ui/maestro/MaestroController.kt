package com.josephwong.maestrofication.ui.maestro

import android.util.Log
import com.airbnb.epoxy.EpoxyController
import com.josephwong.maestrofication.models.MaestroResponseWrapper
import com.josephwong.maestrofication.models.OrganicCollectionWrapper
import com.josephwong.maestrofication.ui.maestro.models.HeaderModel_
import com.josephwong.maestrofication.ui.maestro.models.PremiumFlyerModel_

class MaestroController : EpoxyController() {

    private var collections: ArrayList<OrganicCollectionWrapper>? = null

    fun setMaestroResponse(wrapper: MaestroResponseWrapper) {
        collections = wrapper.data
        requestModelBuild()
    }

    override fun buildModels() {
        collections?.forEach { organicCollection ->
            HeaderModel_()
                .id(0)
                .title(organicCollection.title)
                .addTo(this)

            organicCollection.flyers?.forEach { flyer ->
                PremiumFlyerModel_()
                    .id(flyer.id)
                    .flyerTitle(flyer.flyerTitle)
                    .flyerThumbnailUrl(flyer.thumbnailUrl)
                    .containerClickListener { _ ->
                        Log.e("JOEJOE", "click!")
                    }
                    .favouriteClickListener { _ ->
                    }
                    .addTo(this)
            }
        }
    }
}
