package com.josephwong.maestrofication.services.maestro.componentModels.components

import com.josephwong.maestrofication.models.Flyer
import com.josephwong.maestrofication.services.maestro.componentModels.IComponentModel
import maestro.components.OrganicFlyer

class OrganicFlyerComponentModel(val flyer: OrganicFlyer, val flyerData: Flyer?) :
    IComponentModel