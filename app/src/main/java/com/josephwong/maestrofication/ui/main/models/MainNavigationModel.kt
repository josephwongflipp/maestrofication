package com.josephwong.maestrofication.ui.main.models

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.airbnb.epoxy.*
import com.bumptech.glide.Glide
import com.josephwong.maestrofication.R

@EpoxyModelClass(layout = R.layout.vh_main_nav_item)
abstract class MainNavigationModel : EpoxyModelWithHolder<MainNavigationModel.Holder>() {

    @EpoxyAttribute
    var title: String? = null

    @EpoxyAttribute
    var imageUrl: String? = null

    @EpoxyAttribute(EpoxyAttribute.Option.DoNotHash)
    var clickListener: View.OnClickListener? = null

    override fun bind(holder: Holder) {
        holder.titleView?.text = title
        holder.thumbnail?.let { view ->
            if (!imageUrl.isNullOrEmpty()) {
                Glide.with(view)
                    .asBitmap()
                    .load(imageUrl)
                    .centerCrop()
                    .into(view)
                holder.titleView?.visibility = View.GONE
            }

        }
        holder.titleView?.setOnClickListener(clickListener)
    }

    class Holder : EpoxyHolder() {
        var titleView: TextView? = null
        var thumbnail: ImageView? = null

        override fun bindView(itemView: View) {
            titleView = itemView.findViewById(R.id.title)
            thumbnail = itemView.findViewById(R.id.thumbnail)
        }
    }
}
