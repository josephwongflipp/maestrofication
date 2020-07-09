package com.josephwong.maestrofication.ui.main

import com.airbnb.epoxy.EpoxyController
import com.josephwong.maestrofication.ui.main.models.MainNavigationModel_

class MainNavItemController(val listener: MainFragment.NavigationOnClickListener) : EpoxyController() {

    init {
        requestModelBuild()
    }

    override fun buildModels() {
        MainNavigationModel_()
            .id("browse")
            .title("Browse Demo")
            .clickListener { _ ->
                listener.onBrowseDemoClicked()
            }
            .addTo(this)
    }
}
