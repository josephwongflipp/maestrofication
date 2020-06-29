package com.josephwong.maestrofication.ui.epoxyexamples

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.epoxy.EpoxyRecyclerView
import com.josephwong.maestrofication.R
import com.josephwong.maestrofication.repositories.MaestroRepository
import com.josephwong.maestrofication.utils.DensityUtil
import com.josephwong.maestrofication.utils.PaddingDecoration

class CarouselExampleActivity : AppCompatActivity() {

    private lateinit var epoxyRecyclerView: EpoxyRecyclerView
    private var simpleController: CarouselController = CarouselController()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_list)

        epoxyRecyclerView = findViewById(R.id.epoxyRecyclerView)
        epoxyRecyclerView.setItemSpacingDp(8)

        simpleController.let { controller ->
            controller.setPremiumFlyers(MaestroRepository().fetchFlyers())
            epoxyRecyclerView.setController(controller)
        }
    }
}