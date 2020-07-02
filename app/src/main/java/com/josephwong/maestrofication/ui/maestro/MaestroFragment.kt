package com.josephwong.maestrofication.ui.maestro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.airbnb.epoxy.EpoxyRecyclerView
import com.josephwong.maestrofication.R
import com.josephwong.maestrofication.repositories.MaestroRepository

class MaestroFragment : Fragment() {

    private lateinit var recyclerView: EpoxyRecyclerView
    private var maestroController: MaestroController? = null

    companion object {
        fun newInstance(): MaestroFragment {
            return MaestroFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_maestro, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.epoxyRecyclerView)

        maestroController = MaestroController()
        maestroController!!.setMaestroResponse(MaestroRepository().fetchAlphabeticalFlyers())

        recyclerView.setController(maestroController!!)

    }

}
