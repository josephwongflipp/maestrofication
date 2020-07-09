package com.josephwong.maestrofication.ui.common.models

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.bumptech.glide.Glide
import com.josephwong.maestrofication.R

@EpoxyModelClass(layout = R.layout.vh_sticky_tab)
abstract class StickyViewPagerTabModel : EpoxyModelWithHolder<StickyViewPagerTabModel.Holder>() {

    @EpoxyAttribute
    lateinit var listener: () -> Unit

    @EpoxyAttribute
    var imageUrl: String? = null

    @EpoxyAttribute
    var tabTitle: String? = null

    @EpoxyAttribute
    var selected: Boolean = false

    override fun bind(holder: Holder) {
        holder.tabTitle?.text = tabTitle
        holder.thumbnail?.let { view ->
            if (!imageUrl.isNullOrEmpty()) {
                Glide.with(view)
                    .asBitmap()
                    .load(imageUrl)
                    .fitCenter()
                    .into(view)
                holder.thumbnail?.visibility = View.VISIBLE
                holder.tabTitle?.visibility = View.GONE
            }
        }

        holder.thumbnail?.setOnClickListener { listener() }

        holder.selected?.let { selectedView ->
            selectedView.visibility = if (selected) View.VISIBLE else View.GONE
        }
    }

    class Holder : EpoxyHolder() {
        var tabTitle: TextView? = null
        var thumbnail: ImageView? = null
        var selected: View? = null

        override fun bindView(itemView: View) {
            tabTitle = itemView.findViewById(R.id.tabTitle)
            thumbnail = itemView.findViewById(R.id.thumbnail)
            selected = itemView.findViewById(R.id.selected)
        }
    }
}