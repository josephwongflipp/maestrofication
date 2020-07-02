package com.josephwong.maestrofication.repositories

import com.josephwong.maestrofication.models.FlyerModel
import com.josephwong.maestrofication.models.MaestroResponseWrapper
import com.josephwong.maestrofication.models.OrganicCollectionWrapper

class MaestroRepository {
    private val flyerCache = HashMap<String, FlyerModel>()

    fun fetchFlyers() : ArrayList<FlyerModel> {
        flyerCache.clear()
        val response = ArrayList<FlyerModel>()
        for (i in 0 .. 10) {
            FlyerModel.createRandomFlyer("$i").let {model ->
                flyerCache[model.id] = model
                response.add(model)
            }
        }
        return response
    }

    fun fetchAlphabeticalFlyers() : MaestroResponseWrapper {
        val collection1 = OrganicCollectionWrapper("A", FlyerModel.createListOfRandomFlyers(5))
        val collection2 = OrganicCollectionWrapper("B", FlyerModel.createListOfRandomFlyers(5))
        val collection3 = OrganicCollectionWrapper("K", FlyerModel.createListOfRandomFlyers(5))
        val collection4 = OrganicCollectionWrapper("Z", FlyerModel.createListOfRandomFlyers(5))

        val collectionOfCollections: ArrayList<OrganicCollectionWrapper> = ArrayList()
        collectionOfCollections.add(collection1)
        collectionOfCollections.add(collection2)
        collectionOfCollections.add(collection3)
        collectionOfCollections.add(collection4)

        return MaestroResponseWrapper("alphabetical", collectionOfCollections)
    }
}
