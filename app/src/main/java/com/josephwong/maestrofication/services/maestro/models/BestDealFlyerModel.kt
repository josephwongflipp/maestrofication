package com.josephwong.maestrofication.services.maestro.models

import android.view.View
import android.widget.TextView
import com.airbnb.epoxy.*
import com.bumptech.glide.Glide
import com.josephwong.maestrofication.R
import com.josephwong.maestrofication.ui.common.AspectRatioImageView
import com.josephwong.maestrofication.services.maestro.models.bestdeal.BestDealController

@EpoxyModelClass(layout = R.layout.vh_best_deal_flyer)
abstract class BestDealFlyerModel : EpoxyModelWithHolder<BestDealFlyerModel.Holder>() {

    // Declare your model properties like this
    @EpoxyAttribute
    var headerTitle: String? = null

    @EpoxyAttribute
    var headerSubtitle: String? = null

    @EpoxyAttribute
    var thumbnailUrl: String? = null

    @EpoxyAttribute
    var footerTitle: String? = null

    override fun bind(holder: Holder) {
        holder.headerTitle?.text = headerTitle
        holder.headerSubtitle?.text = headerSubtitle
        holder.footerTitle?.text = footerTitle
        holder.thumbnail?.let { view ->
            Glide.with(view)
                .asBitmap()
                .load(thumbnailUrl)
                .centerCrop()
                .into(view)
        }


        holder.bestDealList?.setItemSpacingDp(8)

        val controller = BestDealController()
        holder.bestDealList?.setController(controller)
    }

    class Holder : EpoxyHolder() {
        var headerTitle: TextView? = null
        var headerSubtitle: TextView? = null
        var thumbnail: AspectRatioImageView? = null
        var footerTitle: TextView? = null
        var bestDealList: EpoxyRecyclerView? = null

        override fun bindView(itemView: View) {
            headerTitle = itemView.findViewById(R.id.header_title)
            headerSubtitle = itemView.findViewById(R.id.header_subtitle)
            thumbnail = itemView.findViewById(R.id.thumbnail)
            footerTitle = itemView.findViewById(R.id.footer_title)
            bestDealList = itemView.findViewById(R.id.bestDealList)
        }
    }
}
