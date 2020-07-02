package com.josephwong.maestrofication.ui.epoxyexamples

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.airbnb.epoxy.Carousel
import com.airbnb.epoxy.CarouselModel_
import com.airbnb.epoxy.EpoxyController
import com.josephwong.maestrofication.models.FlyerModel
import com.josephwong.maestrofication.services.FavouritesManager
import com.josephwong.maestrofication.ui.maestro.models.BestDealFlyerModel_
import com.josephwong.maestrofication.ui.maestro.models.PremiumFlyerModel_


class CarouselController(private val favouritesManager: FavouritesManager) : EpoxyController() {

    private var flyers: ArrayList<FlyerModel>? = null
    private val carousel: ArrayList<PremiumFlyerModel_> = ArrayList()

    var clickFavouriteFlyerLiveData: MutableLiveData<FavouriteDataWrapper> = MutableLiveData()


    fun setPremiumFlyers(flyers: ArrayList<FlyerModel>) {
        this.flyers = flyers
        requestModelBuild()
    }

    fun update() {
        requestModelBuild()
    }

    override fun buildModels() {

        flyers?.forEach { flyer ->
            val isFavourited = favouritesManager.isFlyerFavourited(flyer.id)

            PremiumFlyerModel_()
                .id(flyer.id)
                .containerClickListener { _ ->
                    Log.e("JOEJOE", "click!")
                }
                .favouriteClickListener { _ ->
                    favouritesManager.addFavourite(FavouriteDataWrapper(flyer.id, true))
                    clickFavouriteFlyerLiveData.value = FavouriteDataWrapper(flyer.id, true)
                }
                .flyerTitle(flyer.flyerTitle)
                .flyerThumbnailUrl(flyer.thumbnailUrl)
                .isFavourited(isFavourited)
                .addTo(this)
        }

        CarouselModel_()
            .id(1337)
            .padding(Carousel.Padding(0, 6))
            .hasFixedSize(true)
            .models(generateCarouselData())
            .numViewsToShowOnScreen(1.5F)
            .addTo(this)

//        BestDealFlyerModel_()
//            .id(0)
//            .footerTitle("FOOT")
//            .headerTitle("HEAD")
//            .headerSubtitle("YO")
//            .addTo(this)
    }

    private fun generateCarouselData() : ArrayList<PremiumFlyerModel_> {
        val result : ArrayList<PremiumFlyerModel_> = ArrayList()
        flyers?.forEach { flyer ->
            val isFavourited = favouritesManager.isFlyerFavourited(flyer.id)
            result.add(
                PremiumFlyerModel_()
                    .id(flyer.id)
                    .flyerTitle(flyer.flyerTitle)
                    .flyerThumbnailUrl(flyer.thumbnailUrl)
                    .containerClickListener { _ ->
                        Log.e("JOEJOE", "click!")
                    }
                    .favouriteClickListener { _ ->
                        favouritesManager.addFavourite(FavouriteDataWrapper(flyer.id, true))
                        clickFavouriteFlyerLiveData.value = FavouriteDataWrapper(flyer.id, true)
                    }
                    .isFavourited(isFavourited)
            )
        }

        return result
    }
}
