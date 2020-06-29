package com.josephwong.maestrofication.ui.main.models

import android.view.View
import android.widget.TextView
import com.airbnb.epoxy.*
import com.josephwong.maestrofication.R

@EpoxyModelClass(layout = R.layout.vh_main_nav_item)
abstract class MainNavigationModel : EpoxyModelWithHolder<MainNavigationModel.Holder>() {

    @EpoxyAttribute
    var title: String? = null

    @EpoxyAttribute(EpoxyAttribute.Option.DoNotHash)
    var clickListener: View.OnClickListener? = null

    override fun bind(holder: Holder) {
        holder.titleView?.text = title
        holder.titleView?.setOnClickListener(clickListener)
    }

    class Holder : EpoxyHolder() {
        var titleView: TextView? = null

        override fun bindView(itemView: View) {
            titleView = itemView.findViewById(R.id.title)
        }
    }
}
