package com.josephwong.maestrofication.ui.epoxyexamples.sticky.models

import android.view.View
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.josephwong.maestrofication.R

@EpoxyModelClass(layout = R.layout.vh_sticky_tab)
abstract class StickyViewPagerTabModel : EpoxyModelWithHolder<StickyViewPagerTabModel.Holder>() {

    @EpoxyAttribute
    lateinit var listener: () -> Unit

    @EpoxyAttribute
    lateinit var tabTitle: String

    @EpoxyAttribute
    var selected: Boolean = false

    override fun bind(holder: Holder) {
        holder.tabTitle?.text = tabTitle
        holder.tabTitle?.setOnClickListener { listener() }

        holder.selected?.let { selectedView ->
            selectedView.visibility = if (selected) View.VISIBLE else View.GONE
        }
    }

    class Holder : EpoxyHolder() {
        var tabTitle: TextView? = null
        var selected: View? = null

        override fun bindView(itemView: View) {
            tabTitle = itemView.findViewById(R.id.tabTitle)
            selected = itemView.findViewById(R.id.selected)
        }
    }
}