package com.josephwong.maestrofication.ui.epoxyexamples.carousel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.airbnb.epoxy.EpoxyRecyclerView
import com.josephwong.maestrofication.R
import com.josephwong.maestrofication.repositories.MaestroRepository
import com.josephwong.maestrofication.services.FavouritesManager
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class CarouselExampleActivity : AppCompatActivity() {

    private lateinit var epoxyRecyclerView: EpoxyRecyclerView

    @Inject
    lateinit var favouritesManager: FavouritesManager

    private lateinit var carouselController: CarouselController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_list)

        carouselController =
            CarouselController(
                favouritesManager
            )

        // Observe changes to favourite flyers, update the adapter
        favouritesManager.readFlyerLiveData.observe(this, Observer { cache ->
            carouselController.update()
        })

        epoxyRecyclerView = findViewById(R.id.epoxyRecyclerView)
        epoxyRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        epoxyRecyclerView.setItemSpacingDp(2)

        carouselController.clickFavouriteFlyerLiveData.observe(
            this,
            Observer { wrapper ->
                favouritesManager.addFavourite(wrapper)
            }
        )

        carouselController.let { controller ->
            controller.setPremiumFlyers(MaestroRepository().fetchFlyers())
            epoxyRecyclerView.setController(controller)
        }
    }
}