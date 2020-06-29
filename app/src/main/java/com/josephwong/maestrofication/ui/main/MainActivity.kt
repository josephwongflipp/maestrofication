package com.josephwong.maestrofication.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.airbnb.epoxy.EpoxyRecyclerView
import com.airbnb.epoxy.EpoxyVisibilityTracker
import com.josephwong.maestrofication.R
import com.josephwong.maestrofication.repositories.MaestroRepository
import com.josephwong.maestrofication.ui.maestro.MaestroController


class MainActivity : AppCompatActivity() {

    private lateinit var maestroRecyclerView: EpoxyRecyclerView

    // TODO: use Hilt here
    private val repository: MaestroRepository = MaestroRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        maestroRecyclerView = findViewById(R.id.list)

        val controller = MaestroController(maestroRecyclerView)

        // Setting up the spacing
        maestroRecyclerView.setItemSpacingDp(8)

        // Span logic (phone, vs vert tablet vs horz tablet)
        val spanCount = 2
        val layoutManager = GridLayoutManager(this, spanCount)
        controller.spanCount = spanCount
        layoutManager.spanSizeLookup = controller.spanSizeLookup
        maestroRecyclerView.layoutManager = layoutManager

        // Tracking visibility
        val visibilityTracker = EpoxyVisibilityTracker()
        visibilityTracker.setOnChangedEnabled(false)
        visibilityTracker.setPartialImpressionThresholdPercentage(50)
        visibilityTracker.attach(maestroRecyclerView)

        // Finally setting the data in
        controller.setMaestroResponse(repository.fetchFlyers())

        maestroRecyclerView.setController(controller)
    }
}
