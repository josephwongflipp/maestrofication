package com.josephwong.maestrofication.services.maestro

import com.josephwong.maestrofication.models.Flyer
import com.josephwong.maestrofication.models.MaestroResponseWrapper
import com.josephwong.maestrofication.services.maestro.componentModels.collections.FlyerStackCarouselComponentModelModel
import com.josephwong.maestrofication.services.maestro.componentModels.collections.OrganicCollectionComponentModel
import com.josephwong.maestrofication.services.maestro.componentModels.collections.PremiumCollectionComponentModelModel
import com.josephwong.maestrofication.services.maestro.componentModels.components.OrganicFlyerComponentModel
import com.josephwong.maestrofication.services.maestro.componentModels.components.PremiumFlyerComponentModel
import com.josephwong.maestrofication.services.maestro.componentModels.navigation.NavigationCarouselItemComponentModel
import maestro.components.*
import maestro.layouts.Browse
import maestro.response.MaestroResponse

class MaestroParser {

    fun parseMaestroResponse(maestroResponse: MaestroResponse): MaestroResponseWrapper? {
        var maestroResponseWrapper = MaestroResponseWrapper(maestroResponse.maestroId.toString())

        // Extracting FLYERS
        val flyers = parseFlyers(maestroResponse)

        // Extracting SLOTS
        val slots = (maestroResponse.getLayout() as Browse).getSlots()

        // Iterate SLOTS
        slots.forEach { slot ->
            val component = slot.getComponent()

            if (component is PremiumCollection) {
                maestroResponseWrapper.componentModels.add(
                    parsePremiumCollection(
                        component,
                        flyers
                    )
                )
            }

            if (component is OrganicCollection) {
                maestroResponseWrapper.componentModels.add(
                    parseOrganicCollection(
                        component,
                        flyers
                    )
                )
            }

            if (component is FlyerStackCarousel) {
                maestroResponseWrapper.componentModels.add(
                    parseFlyerStackCarousel(
                        component,
                        flyers
                    )
                )
            }
        }

        // Extracting Navigation Carousel Items
        maestroResponseWrapper.navigationCarouselItems = parseNavigationCarousel(maestroResponse)

        return maestroResponseWrapper
    }

    fun parseNavigationCarousel(maestroResponse: MaestroResponse): ArrayList<NavigationCarouselItemComponentModel> {
        val navigationCarousel =
            (maestroResponse.getLayout() as Browse).getHeader().getComponents()[0]!!

        val result: ArrayList<NavigationCarouselItemComponentModel> = ArrayList()

        navigationCarousel.getItems().forEach { item ->
            result.add(NavigationCarouselItemComponentModel(item))
        }

        return result
    }

    private fun parsePremiumCollection(
        collection: PremiumCollection,
        flyers: HashMap<Int, Flyer>
    ): PremiumCollectionComponentModelModel {
        val result = PremiumCollectionComponentModelModel()
        result.flyers = ArrayList()

        collection.getComponents().forEach { component ->
            if (component is PremiumFlyer) {
                result.flyers!!.add(parsePremiumFlyer(component, flyers))
            }
        }

        return result
    }

    private fun parseOrganicCollection(
        collection: OrganicCollection,
        flyers: HashMap<Int, Flyer>
    ): OrganicCollectionComponentModel {
        val result = OrganicCollectionComponentModel()
        result.flyers = ArrayList()

        collection.getComponents().forEach { component ->
            if (component is PremiumFlyer) {
                result.flyers!!.add(parsePremiumFlyer(component, flyers))
            }
            if (component is OrganicFlyer) {
                result.flyers!!.add(parseOrganicFlyer(component, flyers))
            }
        }

        return result
    }

    private fun parseFlyerStackCarousel(
        collection: FlyerStackCarousel,
        flyers: HashMap<Int, Flyer>
    ): FlyerStackCarouselComponentModelModel {
        val result = FlyerStackCarouselComponentModelModel()
        result.flyers = ArrayList()
        collection.getFlyers().forEach { component ->
            if (component is PremiumFlyer) {
                result.flyers!!.add(parsePremiumFlyer(component, flyers))
            }
            if (component is OrganicFlyer) {
                result.flyers!!.add(parseOrganicFlyer(component, flyers))
            }
        }

        return result
    }

    private fun parsePremiumFlyer(
        component: PremiumFlyer,
        flyers: HashMap<Int, Flyer>
    ): PremiumFlyerComponentModel {
        return PremiumFlyerComponentModel(
            component,
            flyers[component.flyerId]
        )
    }

    private fun parseOrganicFlyer(
        component: OrganicFlyer,
        flyers: HashMap<Int, Flyer>
    ): OrganicFlyerComponentModel {
        return OrganicFlyerComponentModel(
            component,
            flyers[component.flyerId]
        )
    }

    fun parseFlyers(maestroResponse: MaestroResponse): HashMap<Int, com.josephwong.maestrofication.models.Flyer> {
        val result: HashMap<Int, com.josephwong.maestrofication.models.Flyer> = HashMap()

        val flyersMap = maestroResponse.getFlyers()

        flyersMap.forEach { (_, value) ->
            val flyer = com.josephwong.maestrofication.models.Flyer(
                value.getId(),
                value.isStoreSelect,
                value.flyerRunId,
                value.flyerTypeId,
                value.getMerchant().toString(),
                value.merchantId,
                value.merchantLogo.toString(),
                value.getName().toString(),
                value.publicationType,
                value.stockPremiumThumbnailUrl?.toString(),
                value.storefrontCarouselOrganicThumbnailUrl?.toString(),
                value.storefrontCarouselPremiumThumbnailUrl?.toString(),
                value.storefrontLogoUrl?.toString(),
                value.storefrontPremiumThumbnailUrl?.toString(),
                value.storefrontSaleStory.toString(),
                value.availableFrom,
                value.availableTo,
                value.validFrom,
                value.validTo
            )
            result[flyer.id] = flyer
        }

        return result
    }
}
