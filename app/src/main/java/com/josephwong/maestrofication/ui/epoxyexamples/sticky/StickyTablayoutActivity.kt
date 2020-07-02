package com.josephwong.maestrofication.ui.epoxyexamples.sticky

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.airbnb.epoxy.EpoxyRecyclerView
import com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager
import com.josephwong.maestrofication.R
import com.josephwong.maestrofication.ui.maestro.MaestroFragment

class StickyTablayoutActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var epoxyRecyclerView: EpoxyRecyclerView
    private lateinit var stickyTabController: StickyTabController
    private lateinit var smoothScroller: CenterSmoothScroller

    private val lm = StickyHeaderLinearLayoutManager(this, RecyclerView.HORIZONTAL)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_sticky_tablayout)

        smoothScroller = CenterSmoothScroller(this)

        stickyTabController = StickyTabController(object : TabClickListener {
            override fun onTabClicked(index: Int) {

                // CenterSmoothScroller allows us to center in on a select tab post clicking.
                // We dont both scrolling anywhere if the user selects the favourites
                if (index != 0) {
                    epoxyRecyclerView.smoothScrollToPosition(index)
                    smoothScroller.targetPosition = index
                    lm.startSmoothScroll(smoothScroller)
                }
                stickyTabController.selectTab(index)
            }
        })

        epoxyRecyclerView = findViewById(R.id.epoxyTabs)
        epoxyRecyclerView.layoutManager = lm
        epoxyRecyclerView.setController(stickyTabController)

        viewPager = findViewById(R.id.view_pager)
        viewPager.adapter = BrowsePager(this)
    }


    // TODO: Once we start reading from a real data source, update this adapter
    // TODO: Actually, it might be wiser to just replace this with Epoxy entirely.
    class BrowsePager(a: AppCompatActivity) : FragmentStateAdapter(a) {

        override fun getItemCount(): Int {
            return 10
        }

        override fun createFragment(position: Int): Fragment {
            return MaestroFragment.newInstance()
        }

    }

    interface TabClickListener {
        fun onTabClicked(index: Int)
    }
}