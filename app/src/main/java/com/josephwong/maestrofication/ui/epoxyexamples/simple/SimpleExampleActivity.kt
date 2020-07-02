package com.josephwong.maestrofication.ui.epoxyexamples.simple

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.epoxy.EpoxyRecyclerView
import com.josephwong.maestrofication.R
import com.josephwong.maestrofication.repositories.MaestroRepository

class SimpleExampleActivity : AppCompatActivity() {

    private lateinit var epoxyRecyclerView: EpoxyRecyclerView
    private var simpleController: SimpleController =
        SimpleController()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_list)

        epoxyRecyclerView = findViewById(R.id.epoxyRecyclerView)

        simpleController.let { controller ->
            controller.setPremiumFlyers(MaestroRepository().fetchFlyers())
            epoxyRecyclerView.setController(controller)
        }
    }
}