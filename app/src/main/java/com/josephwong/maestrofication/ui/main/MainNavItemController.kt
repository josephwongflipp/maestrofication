package com.josephwong.maestrofication.ui.main

import com.airbnb.epoxy.EpoxyController
import com.josephwong.maestrofication.ui.main.models.MainNavigationModel_

class MainNavItemController(val listener: MainFragment.NavigationOnClickListener) : EpoxyController() {

    init {
        // This is equivalent to an adapter's "notifyDataSetChanged()"
        requestModelBuild()
    }

    override fun buildModels() {
        MainNavigationModel_()
            .id(0)
            .title("Simple Example with one view holder")
            .clickListener { _ ->
                listener.onSimpleExampleClicked()
            }
            .addTo(this)

        MainNavigationModel_()
            .id(0)
            .title("Carousel Example")
            .clickListener { _ ->
                listener.onCarouselClicked()
            }
            .addTo(this)

        MainNavigationModel_()
            .id(0)
            .title("Nested EpoxyRecyclerView")
            .addTo(this)

        MainNavigationModel_()
            .id(0)
            .title("Spans")
            .addTo(this)
    }

}