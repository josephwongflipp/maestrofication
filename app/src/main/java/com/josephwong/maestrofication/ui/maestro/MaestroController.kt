package com.josephwong.maestrofication.ui.maestro

import android.util.Log
import com.airbnb.epoxy.Carousel
import com.airbnb.epoxy.EpoxyController
import com.airbnb.epoxy.EpoxyModel
import com.josephwong.maestrofication.models.MaestroResponseWrapper
import com.josephwong.maestrofication.services.maestro.componentModels.IComponentModel
import com.josephwong.maestrofication.services.maestro.componentModels.collections.FlyerStackCarouselComponentModelModel
import com.josephwong.maestrofication.services.maestro.componentModels.collections.OrganicCollectionComponentModel
import com.josephwong.maestrofication.services.maestro.componentModels.collections.PremiumCollectionComponentModelModel
import com.josephwong.maestrofication.services.maestro.componentModels.components.OrganicFlyerComponentModel
import com.josephwong.maestrofication.services.maestro.componentModels.components.PremiumFlyerComponentModel
import com.josephwong.maestrofication.services.maestro.models.HeaderModel_
import com.josephwong.maestrofication.services.maestro.models.MaestroCarouselModel_
import com.josephwong.maestrofication.services.maestro.models.OrganicFlyerModel_
import com.josephwong.maestrofication.services.maestro.models.PremiumFlyerModel_
import java.util.*
import kotlin.collections.ArrayList

class MaestroController : EpoxyController() {

    // The number of items shown at anytime for our carousels
    private var CAROUSEL_NUM_ITEMS = 2.3F

    private var maestroResponseWrapper: MaestroResponseWrapper? = null

    fun setMaestroResponseWrapper(wrapper: MaestroResponseWrapper) {
        maestroResponseWrapper = wrapper
        requestModelBuild()
    }

    private fun buildHeader(title: String) {
        HeaderModel_()
            .id(UUID.randomUUID().toString())
            .spanSizeOverride { totalSpanCount, position, itemCount ->
                totalSpanCount
            }
            .title(title)
            .addTo(this)
    }

    override fun buildModels() {
        maestroResponseWrapper?.componentModels?.forEach { component ->

            // PREMIUM COLLECTION
            if (component is PremiumCollectionComponentModelModel) {

                buildHeader("PREMIUM COLLECTION HEADER")

                component.flyers?.forEach { premiumFlyer ->
                    premiumFlyer.flyerData?.let { flyerData ->
                        PremiumFlyerModel_()
                            .id(premiumFlyer.flyer.flyerId)
                            .flyerTitle(flyerData.merchant)
                            .spanSizeOverride { totalSpanCount, position, itemCount ->
                                totalSpanCount
                            }
                            .merchantThumbnailUrl(flyerData.merchantLogoUrl)
                            .flyerThumbnailUrl(flyerData.stock_premium_thumbnail_url)
                            .containerClickListener { _ ->
                                Log.e("JOEJOE", "click!")
                            }
                            .favouriteClickListener { _ ->
                            }
                            .addTo(this)
                    }
                }
            }

            // ORGANIC COLLECTION
            if (component is OrganicCollectionComponentModel) {
                buildHeader("ORGANIC COLLECTION HEADER")

                component.flyers?.forEach { flyer ->

                    if (flyer is OrganicFlyerComponentModel) {
                        flyer.flyerData?.let { flyerData ->
                            OrganicFlyerModel_()
                                .id(flyerData.id)
                                .flyerTitle(flyerData.merchant)
                                .spanSizeOverride { totalSpanCount, position, itemCount ->
                                    totalSpanCount / 2
                                }
                                .merchantThumbnailUrl(flyerData.merchantLogoUrl)
                                .flyerThumbnailUrl(flyerData.stock_premium_thumbnail_url)
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

            // FLYER STACK CAROUSEL
            if (component is FlyerStackCarouselComponentModelModel) {
                buildHeader("FLYER STACK CAROUSEL")

                MaestroCarouselModel_()
                    .id("idk")
                    .padding(Carousel.Padding(0, 6))
                    .models(generateCarouselData(component.flyers!!))
                    .numViewsToShowOnScreen(CAROUSEL_NUM_ITEMS)
                    .addTo(this)
            }
        }
    }

    private fun generateCarouselData(flyers: ArrayList<IComponentModel>): ArrayList<EpoxyModel<*>> {
        val result: ArrayList<EpoxyModel<*>> = ArrayList()
        flyers.forEach { flyer ->

            if (flyer is PremiumFlyerComponentModel) {
                flyer.flyerData?.let { flyerData ->
                    result.add(
                        PremiumFlyerModel_()
                            .id(flyerData.id)
                            .flyerTitle(flyerData.merchant)
                            .merchantThumbnailUrl(flyerData.merchantLogoUrl)
                            .flyerThumbnailUrl(flyerData.stock_premium_thumbnail_url))
                }
            }

            if (flyer is OrganicFlyerComponentModel) {
                flyer.flyerData?.let { flyerData ->
                    result.add(
                        OrganicFlyerModel_()
                            .id(flyerData.id)
                            .flyerTitle(flyerData.merchant)
                            .merchantThumbnailUrl(flyerData.merchantLogoUrl)
                            .flyerThumbnailUrl(flyerData.stock_premium_thumbnail_url))
                }
            }
        }

        return result

    }
}
