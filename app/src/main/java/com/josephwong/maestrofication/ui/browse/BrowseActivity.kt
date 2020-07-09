package com.josephwong.maestrofication.ui.browse

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.airbnb.epoxy.EpoxyRecyclerView
import com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager
import com.josephwong.maestrofication.R
import com.josephwong.maestrofication.models.MaestroResponseWrapper
import com.josephwong.maestrofication.repositories.MaestroRepository
import com.josephwong.maestrofication.services.maestro.componentModels.navigation.NavigationCarouselItemComponentModel
import com.josephwong.maestrofication.ui.common.CenterSmoothScroller
import com.josephwong.maestrofication.ui.maestro.MaestroFragment
import dagger.hilt.android.AndroidEntryPoint
import maestro.common.BrowseCategory
import javax.inject.Inject

@AndroidEntryPoint
class BrowseActivity : AppCompatActivity(),
    BrowseTabNavigationController.IBrowseTabNavigationListener {

    @Inject
    lateinit var maestroRepository: MaestroRepository

    private lateinit var viewModel: BrowseActivityViewModel

    private lateinit var viewPager: ViewPager2
    private var browsePager: BrowsePager? = null
    private lateinit var epoxyRecyclerView: EpoxyRecyclerView
    private lateinit var smoothScroller: CenterSmoothScroller

    private lateinit var tabController: BrowseTabNavigationController

    // This magical LLManager is what allows us to center and smooth scroll to a tab.
    private val lm = StickyHeaderLinearLayoutManager(this, RecyclerView.HORIZONTAL)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_browse)

        viewModel = ViewModelProvider(this, BrowseViewModelFactory(maestroRepository)).get(
            BrowseActivityViewModel::class.java
        )

        smoothScroller =
            CenterSmoothScroller(this)

        tabController = BrowseTabNavigationController()
        tabController.listener = this

        // RecyclerView
        epoxyRecyclerView = findViewById(R.id.epoxyTabs)
        epoxyRecyclerView.layoutManager = lm
        epoxyRecyclerView.setController(tabController)

        // ViewPager
        viewPager = findViewById(R.id.view_pager)
        viewPager.registerOnPageChangeCallback(
            object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    onTabClicked(position)
                }
            }
        )
        browsePager = BrowsePager(this)
        viewPager.adapter = browsePager


        // Observer
        viewModel.viewState.observe(
            this,
            Observer { viewState ->
                when (viewState) {
                    BrowseActivityViewState.Loading -> {
                        // TODO: Show a loading spinner woo
                    }
                    is BrowseActivityViewState.Ready -> {
                        viewState.maestroResponseWrapper?.let { maestroResponseWrapper ->
                            setupTabsAndInitialView(maestroResponseWrapper)
                        }
                    }
                    is BrowseActivityViewState.Error -> {
                        Toast.makeText(this, "fail: ${viewState.errorMsg}", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        )

        // Fetch root maestroResponse
        viewModel.fetchMaestroData()
    }

    private fun setupTabsAndInitialView(maestroResponseWrapper: MaestroResponseWrapper) {
        val pager = BrowsePager(this)
        pager.setData(maestroResponseWrapper)
        viewPager.adapter = pager
        viewPager.currentItem = 1
        tabController.setData(maestroResponseWrapper)
    }


    // TODO: Once we start reading from a real data source, update this adapter
    // TODO: Actually, it might be wiser to just replace this with Epoxy entirely.
    class BrowsePager(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

        var carouselItems : ArrayList<NavigationCarouselItemComponentModel>? = null

        fun setData(maestroResponseWrapper: MaestroResponseWrapper) {
            carouselItems = maestroResponseWrapper.navigationCarouselItems
            notifyDataSetChanged()
        }

        override fun getItemCount(): Int {
            if (carouselItems.isNullOrEmpty()) {
                return 0
            }
            return carouselItems!!.size
        }

        override fun createFragment(position: Int): Fragment {
            // TODO: Clean this up
            return MaestroFragment.newInstance((carouselItems?.get(position)?.navigationCarouselItem?.getLink() as BrowseCategory).getCategory().toString())
        }

    }

    // IBrowseTabNavigationListener
    override fun onTabClicked(index: Int) {
        // CenterSmoothScroller allows us to center in on a select tab post clicking.
        // We dont bother scrolling anywhere if the user selects the favourites
        if (index != 0) {
            epoxyRecyclerView.smoothScrollToPosition(index)
            smoothScroller.targetPosition = index
            lm.startSmoothScroll(smoothScroller)
        }
        tabController.selectTab(index)
        viewPager.currentItem = index
    }
}