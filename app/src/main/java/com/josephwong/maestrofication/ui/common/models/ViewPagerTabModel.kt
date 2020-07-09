package com.josephwong.maestrofication.ui.common.models

import android.view.View
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.josephwong.maestrofication.R

@EpoxyModelClass(layout = R.layout.vh_tab)
abstract class ViewPagerTabModel : EpoxyModelWithHolder<ViewPagerTabModel.Holder>() {

    @EpoxyAttribute
    open var tabTitle: String? = null

    @EpoxyAttribute(EpoxyAttribute.Option.DoNotHash)
    open var onClickListener: View.OnClickListener? = null

    @EpoxyAttribute
    var selected: Boolean = false

    override fun bind(holder: Holder) {
        super.bind(holder)


        holder.tabTitle?.let { titleView ->
            val context = titleView.context
            val unselectedColor = context.resources.getColor(R.color.default3, null)
            val selectedColor = context.resources.getColor(R.color.brand3, null)
            titleView.text = tabTitle
            titleView.setOnClickListener(onClickListener)
            titleView.setTextColor(if (selected) selectedColor else unselectedColor)
        }

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
