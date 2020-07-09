package com.josephwong.maestrofication.ui.browse

import com.airbnb.epoxy.EpoxyController
import com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks
import com.josephwong.maestrofication.models.MaestroResponseWrapper
import com.josephwong.maestrofication.ui.common.models.StickyViewPagerTabModel_
import com.josephwong.maestrofication.ui.common.models.ViewPagerTabModel_

class BrowseTabNavigationController() : EpoxyController(), StickyHeaderCallbacks {

    interface IBrowseTabNavigationListener {
        fun onTabClicked(index: Int)
    }

    // The selected index is what dictates the underline selected state
    private var selectedIndex: Int = 1
    private var maestroResponseWrapper: MaestroResponseWrapper? = null

    var listener: IBrowseTabNavigationListener? = null

    /**
     * Updated the selected tab and rebuilds the controller
     */
    fun selectTab(index: Int) {
        selectedIndex = index
        requestModelBuild()
    }

    /**
     * Sets the headers and rebuilds the controller
     */
    fun setData(maestroResponseWrapper: MaestroResponseWrapper) {
        this.maestroResponseWrapper = maestroResponseWrapper
        requestModelBuild()
    }

    override fun buildModels() {
        maestroResponseWrapper?.navigationCarouselItems?.forEachIndexed { index, item ->
            if (index == 0) {
                StickyViewPagerTabModel_()
                    .id(0)
                    .imageUrl(item.navigationCarouselItem.imageUrl.toString())
                    .selected(0 == selectedIndex)
                    .listener {
                        listener?.onTabClicked(0)
                    }
                    .addTo(this)
            } else {
                ViewPagerTabModel_()
                    .id(item.navigationCarouselItem.getLabel().toString())
                    .tabTitle(item.navigationCarouselItem.getLabel().toString())
                    .selected(index == selectedIndex)
                    .onClickListener { _ ->
                        listener?.onTabClicked(index)
                    }
                    .addTo(this)
            }
        }
    }

    // Feel feel to use any logic here to determine if the [position] is sticky view or not
    override fun isStickyHeader(position: Int) =
        adapter.getModelAtPosition(position) is StickyViewPagerTabModel_
}
