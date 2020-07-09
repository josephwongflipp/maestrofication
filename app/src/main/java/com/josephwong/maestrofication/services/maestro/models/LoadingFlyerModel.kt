package com.josephwong.maestrofication.services.maestro.models

import android.view.View
import android.widget.FrameLayout
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.facebook.shimmer.ShimmerFrameLayout
import com.josephwong.maestrofication.R


@EpoxyModelClass(layout = R.layout.vh_loading_flyer)
abstract class LoadingFlyerModel : EpoxyModelWithHolder<LoadingFlyerModel.Holder>() {

    // Declare your model properties like this

    @EpoxyAttribute(EpoxyAttribute.Option.DoNotHash)
    open var containerClickListener: View.OnClickListener? = null

    override fun bind(holder: Holder) {
        holder.shimmerLayout?.startShimmer()
    }

    class Holder : EpoxyHolder() {
        var container: FrameLayout? = null
        var shimmerLayout: ShimmerFrameLayout? = null

        override fun bindView(itemView: View) {
            container = itemView.findViewById(R.id.container)
            shimmerLayout = itemView.findViewById(R.id.shimmer)
        }
    }
}
