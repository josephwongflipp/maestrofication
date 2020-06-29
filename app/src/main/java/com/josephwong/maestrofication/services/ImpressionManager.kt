package com.josephwong.maestrofication.services

import android.util.Log

// :clown-face: version of an impression manager
class ImpressionManager() {

    private val impressionCache = HashMap<String, Boolean>()

    fun impress(uuid: String) {
        if (impressionCache[uuid] == null) {
            Log.e("JOEJOE", "Item $uuid has been impressed")
            impressionCache[uuid] = true
        }
    }

    fun hasBeenImpressed(uuid: String): Boolean {
        return impressionCache[uuid]?: false
    }
}
