package com.josephwong.maestrofication.ui.maestro.models

import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import com.airbnb.epoxy.*
import com.bumptech.glide.Glide
import com.josephwong.maestrofication.R
import com.josephwong.maestrofication.ui.common.AspectRatioImageView
import de.hdodenhof.circleimageview.CircleImageView

@EpoxyModelClass(layout = R.layout.vh_premium_flyer)
abstract class PremiumFlyerModel : EpoxyModelWithHolder<PremiumFlyerModel.Holder>() {

    // Declare your model properties like this
    @EpoxyAttribute
    open var flyerTitle: String? = null

    @EpoxyAttribute
    open var flyerThumbnailUrl: String? = null

    @EpoxyAttribute
    open var isFavourited: Boolean = false

    @EpoxyAttribute(EpoxyAttribute.Option.DoNotHash)
    open var containerClickListener: View.OnClickListener? = null

    @EpoxyAttribute(EpoxyAttribute.Option.DoNotHash)
    open var favouriteClickListener: View.OnClickListener? = null

    override fun bind(holder: Holder) {
        holder.flyerTitle?.text = flyerTitle
        holder.flyerThumbnail?.let { view ->
            Glide.with(view)
                .asBitmap()
                .load(flyerThumbnailUrl)
                .centerCrop()
                .into(view)
        }
        holder.merchantThumbnail?.let { view ->
            Glide.with(view)
                .asBitmap()
                .load("https://i.kym-cdn.com/entries/icons/facebook/000/012/448/tumblr_mfpwn7pBuf1rzi1ugo1_500.jpg")
                .centerCrop()
                .into(view)

        }
        holder.favourite?.let { view ->
            view.setImageDrawable(view.context.resources.getDrawable(
                if (isFavourited) R.drawable.ic_heart_selected else R.drawable.ic_heart_unselected,
                null)
            )
            view.setOnClickListener(favouriteClickListener)
        }

        holder.container?.setOnClickListener(containerClickListener)
    }

    class Holder : EpoxyHolder() {
        var container: FrameLayout? = null
        var flyerTitle: TextView? = null
        var flyerThumbnail: AspectRatioImageView? = null
        var merchantThumbnail: CircleImageView? = null
        var favourite: ImageView? = null

        override fun bindView(itemView: View) {
            container = itemView.findViewById(R.id.container)
            flyerTitle = itemView.findViewById(R.id.header_title)
            flyerThumbnail = itemView.findViewById(R.id.thumbnail)
            merchantThumbnail = itemView.findViewById(R.id.merchant_thumbnail)
            favourite = itemView.findViewById(R.id.favourite)
        }
    }
}
