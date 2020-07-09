package com.josephwong.maestrofication.models

import com.josephwong.maestrofication.services.maestro.componentModels.IComponentModel
import com.josephwong.maestrofication.services.maestro.componentModels.navigation.NavigationCarouselItemComponentModel

data class MaestroResponseWrapper(
    val id: String,
    var navigationCarouselItems: ArrayList<NavigationCarouselItemComponentModel> = ArrayList(),
    var componentModels: ArrayList<IComponentModel> = ArrayList()
)
