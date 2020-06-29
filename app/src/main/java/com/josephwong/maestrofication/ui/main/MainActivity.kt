package com.josephwong.maestrofication.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.josephwong.maestrofication.R
import com.josephwong.maestrofication.repositories.MaestroRepository


class MainActivity : AppCompatActivity() {

    // TODO: use dependancy injection here
    private val repository: MaestroRepository = MaestroRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Setting a fragment, nothing fancy.
        val ft: FragmentTransaction = supportFragmentManager.beginTransaction()
        ft.add(R.id.container, MainFragment.newInstance())
        ft.commit()
    }

    /**
     * Example One
     *
     * Only introduce one epoxy model.
     */
//    private fun example1() {
//        val controller = MaestroController(maestroRecyclerView)
//
//        // Setting up the spacing
//        maestroRecyclerView.setItemSpacingDp(8)
//
//        // Span logic (phone, vs vert tablet vs horz tablet)
//        val spanCount = 2
//        val layoutManager = GridLayoutManager(this, spanCount)
//        controller.spanCount = spanCount
//        layoutManager.spanSizeLookup = controller.spanSizeLookup
//        maestroRecyclerView.layoutManager = layoutManager
//
//        // Tracking visibility
//        val visibilityTracker = EpoxyVisibilityTracker()
//        visibilityTracker.setOnChangedEnabled(false)
//        visibilityTracker.setPartialImpressionThresholdPercentage(50)
//        visibilityTracker.attach(maestroRecyclerView)
//
//        // Finally setting the data in
//        controller.setMaestroResponse(repository.fetchFlyers())
//
//        maestroRecyclerView.setController(controller)
//
//    }
}
