package com.josephwong.maestrofication.services.maestro.models

import android.view.View
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.josephwong.maestrofication.R


@EpoxyModelClass(layout = R.layout.vh_header)
abstract class HeaderModel : EpoxyModelWithHolder<HeaderModel.Holder>() {

    // Declare your model properties like this
    @EpoxyAttribute
    var title: String? = null

    @EpoxyAttribute(EpoxyAttribute.Option.DoNotHash)
    var clickListener: View.OnClickListener? = null

    override fun bind(holder: Holder) {
        // Implement this to bind the properties to the view
        holder.title?.text = title
        holder.title?.setOnClickListener(clickListener)
    }

    class Holder : EpoxyHolder() {
        var title: TextView? = null

        override fun bindView(itemView: View) {
            title = itemView.findViewById(R.id.title)
        }
    }
}