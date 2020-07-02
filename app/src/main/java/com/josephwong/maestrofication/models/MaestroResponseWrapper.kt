package com.josephwong.maestrofication.models

data class MaestroResponseWrapper(
    val id: String,
    val data: ArrayList<OrganicCollectionWrapper>? = null
)