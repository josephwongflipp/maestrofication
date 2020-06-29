package com.josephwong.maestrofication.ui.maestro.models.bestdeal

import android.view.View
import android.widget.TextView
import com.airbnb.epoxy.*
import com.bumptech.glide.Glide
import com.josephwong.maestrofication.R
import com.josephwong.maestrofication.ui.common.AspectRatioImageView
import com.josephwong.maestrofication.ui.maestro.models.BestDealFlyerModel

@EpoxyModelClass(layout = R.layout.vh_best_deal_item)
abstract class BestDealModel : EpoxyModelWithHolder<BestDealModel.Holder>() {

    // Declare your model properties like this
    @EpoxyAttribute
    var title: String? = null

    @EpoxyAttribute
    var thumbnailUrl: String? = null

    override fun bind(holder: Holder) {
        holder.title?.text = title
        holder.thumbnail?.let { view ->
            Glide.with(view)
                .asBitmap()
                .load(thumbnailUrl)
                .centerCrop()
                .into(view)
        }
    }

    class Holder : EpoxyHolder() {
        var title: TextView? = null
        var thumbnail: AspectRatioImageView? = null

        override fun bindView(itemView: View) {
            title = itemView.findViewById(R.id.title)
            thumbnail = itemView.findViewById(R.id.thumbnail)
        }
    }
}
