package com.josephwong.maestrofication.ui.epoxyexamples.sticky

import com.airbnb.epoxy.EpoxyController
import com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks
import com.josephwong.maestrofication.ui.epoxyexamples.sticky.models.StickyViewPagerTabModel_
import com.josephwong.maestrofication.ui.epoxyexamples.sticky.models.ViewPagerTabModel_

class StickyTabController(private val tabClickListener: StickyTablayoutActivity.TabClickListener) : EpoxyController(), StickyHeaderCallbacks {

    private var selectedIndex: Int = 0

    init {
        requestModelBuild()
    }

    fun selectTab(index: Int) {
        selectedIndex = index
        requestModelBuild()
    }

    override fun buildModels() {

        StickyViewPagerTabModel_()
            .id(0)
            .tabTitle("S2")
            .selected(0 == selectedIndex)
            .listener {
                tabClickListener.onTabClicked(0)
            }
            .addTo(this)

        for (i in 1..100) {
            var title = if (i % 3 == 0) "Small" else if (i % 3 == 1) "Medium Text" else "Amazingly Long Text"
            ViewPagerTabModel_()
                .id(i)
                .tabTitle("$title $i")
                .selected(i == selectedIndex)
                .onClickListener { _ ->
                    tabClickListener.onTabClicked(i)
                }
                .addTo(this)
        }
    }

    // Feel feel to use any logic here to determine if the [position] is sticky view or not
    override fun isStickyHeader(position: Int) =
        adapter.getModelAtPosition(position) is StickyViewPagerTabModel_
}
