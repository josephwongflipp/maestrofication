package com.josephwong.maestrofication.models

import java.util.*

data class FlyerModel(
    val id: String,
    val merchantName: String?,
    val flyerTitle: String?,
    val flyerSubtitle: String?,
    val thumbnailUrl: String?,
    val category: String?
) {
    companion object {
        /**
         * Generates a random flyer for test purposes
         */
        fun createRandomFlyer(id: String?): FlyerModel {
            val merchantNames = listOf(
                "Loblaws",
                "Fortinos",
                "T & T Supermarkets",
                "FreshCo",
                "Sobeyes",
                "Food Basics",
                "Adonis",
                "Metro"
            )
            val flyerTitles = listOf(
                "Dollarday Savings",
                "Crazy 88",
                "Father's day specials",
                "Long weekend madness",
                "Happy Thanksgiving!"
            )
            val flyerSubtitles = listOf(
                "Deals like never before!",
                "Surprise mom this weekend!",
                "80%+ off storewide!",
                "SICK DEALS MAN"
            )
            val thumbnailUrl = listOf(
                "https://placekitten.com/600/600",
                "https://placekitten.com/550/600",
                "https://placekitten.com/500/600",
                "https://placekitten.com/450/600",
                "https://placekitten.com/600/550",
                "https://placekitten.com/550/550",
                "https://placekitten.com/500/550",
                "https://placekitten.com/450/550"
            )

            val categories = listOf(
                "groceries",
                "hardware",
                "electronics"
            )

            return FlyerModel(
                id?: UUID.randomUUID().toString(),
                merchantNames.random(),
                flyerTitles.random(),
                flyerSubtitles.random(),
                thumbnailUrl.random(),
                categories.random()
            )
        }
    }
}