package com.josephwong.maestrofication.ui.maestro.models

import android.content.Context
import android.content.DialogInterface
import android.graphics.Rect
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.view.marginLeft
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.epoxy.*
import com.bumptech.glide.Glide
import com.josephwong.maestrofication.R
import com.josephwong.maestrofication.ui.common.AspectRatioImageView

@EpoxyModelClass(layout = R.layout.vh_premium_flyer)
abstract class PremiumFlyerModel : EpoxyModelWithHolder<PremiumFlyerModel.Holder>() {

    // Declare your model properties like this
    @EpoxyAttribute
    var headerTitle: String? = null

    @EpoxyAttribute
    var headerSubtitle: String? = null

    @EpoxyAttribute
    var thumbnailUrl: String? = null

    @EpoxyAttribute
    var footerTitle: String? = null

    @EpoxyAttribute(EpoxyAttribute.Option.DoNotHash)
    var clickListener: View.OnClickListener? = null

    @EpoxyAttribute
    var padding: Rect? = null

    override fun bind(holder: Holder) {
        padding?.let { rect ->
            holder.container?.setPadding(rect.left, rect.top, rect.right, rect.bottom)
        }
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
        holder.thumbnail?.setOnClickListener(clickListener)
    }

    class Holder : EpoxyHolder() {
        var container: FrameLayout? = null
        var headerTitle: TextView? = null
        var headerSubtitle: TextView? = null
        var thumbnail: AspectRatioImageView? = null
        var footerTitle: TextView? = null

        override fun bindView(itemView: View) {
            container = itemView.findViewById(R.id.container)
            headerTitle = itemView.findViewById(R.id.header_title)
            headerSubtitle = itemView.findViewById(R.id.header_subtitle)
            thumbnail = itemView.findViewById(R.id.thumbnail)
            footerTitle = itemView.findViewById(R.id.footer_title)
        }
    }
}
