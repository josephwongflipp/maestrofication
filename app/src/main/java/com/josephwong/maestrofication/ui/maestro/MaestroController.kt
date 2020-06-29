package com.josephwong.maestrofication.ui.maestro

import android.util.Log
import androidx.recyclerview.widget.RecyclerView.SCROLL_STATE_IDLE
import com.airbnb.epoxy.CarouselModel_
import com.airbnb.epoxy.EpoxyController
import com.airbnb.epoxy.EpoxyRecyclerView
import com.airbnb.epoxy.VisibilityState.PARTIAL_IMPRESSION_VISIBLE
import com.josephwong.maestrofication.models.FlyerModel
import com.josephwong.maestrofication.services.ImpressionManager
import com.josephwong.maestrofication.ui.maestro.models.BestDealFlyerModel_
import com.josephwong.maestrofication.ui.maestro.models.HeaderModel_
import com.josephwong.maestrofication.ui.maestro.models.PremiumFlyerModel_

class MaestroController(val rv: EpoxyRecyclerView): EpoxyController() {

    val impressionManager: ImpressionManager = ImpressionManager()
    var i: Int = 100

    private var flyers: ArrayList<FlyerModel>? = null
    private val organicCarousel: ArrayList<PremiumFlyerModel_> = ArrayList()

    fun setMaestroResponse(flyers: ArrayList<FlyerModel>) {
        this.flyers = flyers
        requestModelBuild()
    }

    override fun buildModels() {
        HeaderModel_()
            .id(0)
            .spanSizeOverride { totalSpanCount, position, itemCount ->
                totalSpanCount
            }
            .title("Flyers")
            .addTo(this)

        flyers?.forEach { flyer ->
            organicCarousel.add(PremiumFlyerModel_()
                .id(i++)
                .headerTitle(flyer.flyerTitle)
                .headerSubtitle(flyer.flyerSubtitle)
                .thumbnailUrl(flyer.thumbnailUrl)
                .footerTitle(flyer.merchantName)
                .onVisibilityStateChanged { model, view, visibilityState ->
                    if (visibilityState == PARTIAL_IMPRESSION_VISIBLE) {
                        if (rv.scrollState == SCROLL_STATE_IDLE) {
                            impressionManager.impress(flyer.id)
                        }
                    }
                })


            PremiumFlyerModel_()
                .id(i++)
                .headerTitle(flyer.flyerTitle)
                .headerSubtitle(flyer.flyerSubtitle)
                .thumbnailUrl(flyer.thumbnailUrl)
                .footerTitle(flyer.merchantName)
                .onVisibilityStateChanged { model, view, visibilityState ->
                    Log.e("JOEJOEJOE", "tracked ${flyer.id}")

                    // Introduce business logic where we KNOW 50% of the view is visible, but we need to check OTHER conditions to fit our business needs
                }
                .addTo(this)



        }

        HeaderModel_()
            .id(0)
            .spanSizeOverride { totalSpanCount, position, itemCount ->
                totalSpanCount
            }
            .title("Carousel of Organics")
            .addTo(this)


        CarouselModel_()
            .id(1337)
            .models(organicCarousel)
            .numViewsToShowOnScreen(1.9F)
            .addTo(this)



        HeaderModel_()
            .id(0)
            .spanSizeOverride { totalSpanCount, position, itemCount ->
                totalSpanCount
            }
            .title("Best Deal")
            .addTo(this)

        BestDealFlyerModel_()
            .id(1000)
            .headerTitle("BEST DEAL")
            .headerSubtitle("BEST DEAL SUBTITLE")
            .thumbnailUrl("https://placekitten.com/600/500")
            .footerTitle("FOOTER WOW")
            .spanSizeOverride { totalSpanCount, position, itemCount ->
                totalSpanCount
            }
            .addTo(this)
    }

    private fun createCarouselData() {
        flyers?.forEach { flyer ->
            organicCarousel.add(PremiumFlyerModel_()
                .id(i++)
                .headerTitle(flyer.flyerTitle)
                .headerSubtitle(flyer.flyerSubtitle)
                .thumbnailUrl(flyer.thumbnailUrl)
                .footerTitle(flyer.merchantName)
                .onVisibilityStateChanged { model, view, visibilityState ->
                    if (visibilityState == PARTIAL_IMPRESSION_VISIBLE) {
                        if (rv.scrollState == SCROLL_STATE_IDLE) {
                            impressionManager.impress(flyer.id)
                        }
                    }
                })
            PremiumFlyerModel_()
                .id(i++)
                .headerTitle(flyer.flyerTitle)
                .headerSubtitle(flyer.flyerSubtitle)
                .thumbnailUrl(flyer.thumbnailUrl)
                .footerTitle(flyer.merchantName)
                .onVisibilityStateChanged { model, view, visibilityState ->
                    if (visibilityState == PARTIAL_IMPRESSION_VISIBLE) {
                        impressionManager.impress(flyer.id)
                    }
                }
                .addTo(this)
        }
    }
}
