package com.josephwong.maestrofication.ui.epoxyexamples

import android.graphics.Rect
import android.util.Log
import com.airbnb.epoxy.Carousel
import com.airbnb.epoxy.CarouselModel_
import com.airbnb.epoxy.EpoxyController
import com.josephwong.maestrofication.models.FlyerModel
import com.josephwong.maestrofication.ui.maestro.models.BestDealFlyerModel_
import com.josephwong.maestrofication.ui.maestro.models.PremiumFlyerModel_


class CarouselController : EpoxyController() {

    private var flyers: ArrayList<FlyerModel>? = null
    private val carousel: ArrayList<PremiumFlyerModel_> = ArrayList()

    fun setPremiumFlyers(flyers: ArrayList<FlyerModel>) {
        this.flyers = flyers
        setupCarouselData()
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

        CarouselModel_()
            .id(1337)
            .models(carousel)
            .numViewsToShowOnScreen(1.5F)
            .addTo(this)

        BestDealFlyerModel_()
            .id(0)
            .footerTitle("FOOT")
            .headerTitle("HEAD")
            .headerSubtitle("YO")
            .addTo(this)
    }

    private fun setupCarouselData() {
        flyers?.forEach { flyer ->
            carousel.add(
                PremiumFlyerModel_()
                    .id(0)
                    .headerTitle(flyer.flyerTitle)
                    .headerSubtitle(flyer.flyerSubtitle)
                    .thumbnailUrl(flyer.thumbnailUrl)
                    .footerTitle(flyer.merchantName)
            )
        }
    }
}
