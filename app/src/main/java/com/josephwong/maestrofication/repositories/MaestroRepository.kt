package com.josephwong.maestrofication.repositories

import com.josephwong.maestrofication.models.FlyerModel

class MaestroRepository {
    private val flyerCache = HashMap<String, FlyerModel>()

    fun fetchFlyers() : ArrayList<FlyerModel> {
        flyerCache.clear()
        val response = ArrayList<FlyerModel>()
        for (i in 0 .. 10) {
            FlyerModel.createRandomFlyer().let {model ->
                flyerCache.put(model.id, model)
                response.add(model)
            }
        }
        return response
    }
}
