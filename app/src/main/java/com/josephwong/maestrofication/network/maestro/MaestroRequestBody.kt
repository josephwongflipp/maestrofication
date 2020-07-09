package com.josephwong.maestrofication.network.maestro

import com.squareup.moshi.Json

data class MaestroRequestBody(
    @field:Json(name = "application_version") val applicationVersion: String,
    @field:Json(name = "country_code") val countryCode: String,
    @field:Json(name = "device") val device: String?,
    @field:Json(name = "locale") val locale: String,
    @field:Json(name = "platform") val platform: String,
    @field:Json(name = "postal_code") val postalCode: String,
    @field:Json(name = "account_guid") val accountGuid: String,
    @field:Json(name = "advertising_id") val advertisingId: String,
    @field:Json(name = "schema_id") val schemaId: Int?,
    @field:Json(name = "os_version") val osVersion: String,
    @field:Json(name = "category") val category: String?
)
