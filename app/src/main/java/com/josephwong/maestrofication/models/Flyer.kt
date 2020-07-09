package com.josephwong.maestrofication.models

data class Flyer(
    val id: Int,
    val isStoreSelect: Boolean,
    val flyerRunId: Int,
    val flyerTypeId: Int,
    val merchant: String,
    val merchantId: Int,
    val merchantLogoUrl: String? = null,
    val name: String,
    val publicationType: Int,
    val stock_premium_thumbnail_url: String? = null,
    val storefront_carousel_organic_thumbnail_url: String? = null,
    val storefront_carousel_premium_thumbnail_url: String? = null,
    val storefront_logo_url: String? = null,
    val storefront_premium_thumbnail_url: String? = null,
    val storefront_sale_story: String,
    val availableFrom: Long,
    val availableTo: Long,
    val validFrom: Long,
    val validTo: Long
)

/**
 *         string type = "maestro.payloads.Flyer";

timestamp_ms available_from;
timestamp_ms available_to;
int id;
boolean is_store_select;
int flyer_run_id;
int flyer_type_id;
float height;
string merchant;
int merchant_id;
union {null, string} merchant_logo = null;
string name;
union {null, string} path = null;
int publication_type;
array<float> resolutions;
string sfml_hashed_key;
array<int> stacks;
union {null, string} stock_premium_thumbnail_url = null;
union {null, string} storefront_carousel_organic_thumbnail_url = null;
union {null, string} storefront_carousel_premium_thumbnail_url = null;
union {null, string} storefront_logo_url = null;
union {null, string} storefront_premium_thumbnail_url = null;
string storefront_sale_story;
timestamp_ms valid_from;
timestamp_ms valid_to;
float width;


 *
 *
"type": "maestro.payloads.Flyer",
"available_from": 1579410000000,
"available_to": 1596254399000,
"id": 3240703,
"is_store_select": true,
"flyer_run_id": 541555,
"flyer_type_id": 509,
"height": 2560,
"merchant": "Big Lots",
"merchant_id": 2217,
"merchant_logo": {
"string": "http://images.wishabi.net/merchants/2217/1399408048/large"
},
"name": "2020 Lawn & Garden Catalog",
"path": {
"string": "flyers/8b535cd1-1729-4b59-a825-025b11aa381c/"
},
"publication_type": 3,
"resolutions": [
7.999232769012451,
5.329900741577148,
3.69990873336792,
2.329970359802246,
1.5499979257583618,
1
],
"sfml_hashed_key": "713dc1726b58590e73340880053fdaad7d0ba380b0af1bf5a7b791c3d30c43dc",
"stacks": [
34,
47,
90
],
"stock_premium_thumbnail_url": {
"string": "http://f.wishabi.net/flyers/3240703/stock_premium/1579717303.jpg"
},
"storefront_carousel_organic_thumbnail_url": {
"string": "http://f.wishabi.net/flyers/3240703/storefront_carousel_organic/1579717303.jpg"
},
"storefront_carousel_premium_thumbnail_url": {
"string": "http://f.wishabi.net/flyers/3240703/storefront_carousel_premium/1579717303.jpg"
},
"storefront_logo_url": {
"string": "http://images.wishabi.net/merchants/2217/1507308881/2217.jpg"
},
"storefront_premium_thumbnail_url": null,
"storefront_sale_story": "2020 Lawn & Garden Catalog",
"valid_from": 1579410000000,
"valid_to": 1596254399000,
"width": 72977,
"flyer_page_thumbnails": []
 **/