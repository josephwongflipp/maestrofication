package com.josephwong.maestrofication.ui.maestro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.airbnb.epoxy.EpoxyRecyclerView
import com.josephwong.maestrofication.R
import com.josephwong.maestrofication.models.MaestroResponseWrapper
import com.josephwong.maestrofication.repositories.MaestroRepository
import dagger.hilt.android.AndroidEntryPoint
import jp.wasabeef.recyclerview.animators.LandingAnimator
import javax.inject.Inject


@AndroidEntryPoint
class MaestroFragment : Fragment() {

    companion object {

        const val BUNDLE_CATEGORY = "BUNDLE_CATEGORY"

        fun newInstance(category: String? = "explore"): MaestroFragment {
            val args = Bundle()
            args.putSerializable(BUNDLE_CATEGORY, category)
            val fragment = MaestroFragment()
            fragment.arguments = args
            return fragment
        }
    }

    @Inject
    lateinit var maestroRepository: MaestroRepository

    private lateinit var viewModel: MaestroFragmentViewModel
    private lateinit var recyclerView: EpoxyRecyclerView
    private var maestroController: MaestroController? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val category = arguments?.getString(BUNDLE_CATEGORY)

        viewModel = ViewModelProvider(this, MaestroViewModelFactory(maestroRepository)).get(
            MaestroFragmentViewModel::class.java
        )

        viewModel.fetchMaestroData(category)
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

        setupObs()

        recyclerView = view.findViewById(R.id.epoxyRecyclerView)
        recyclerView.layoutManager =  GridLayoutManager(context, 2)

        val loadingController = LoadingController()
        loadingController.spanCount = 2

        recyclerView.setController(loadingController)

        maestroController = MaestroController()
        maestroController!!.spanCount = 2
    }

    private fun setupTabAndBrowse(maestroResponseWrapper: MaestroResponseWrapper) {
        maestroController?.setMaestroResponseWrapper(maestroResponseWrapper)
        recyclerView.itemAnimator = LandingAnimator()
        recyclerView.itemAnimator?.apply {
            addDuration = 200
        }
        recyclerView.setController(maestroController!!)
    }

    private fun setupObs() {
        viewModel.viewState.observe(
            viewLifecycleOwner,
            Observer { viewState ->
                when (viewState) {
                    MaestroFragmentViewState.Loading -> {
                        // TODO: Show a loading spinner woo
                    }
                    is MaestroFragmentViewState.Ready -> {
                        Toast.makeText(activity, "success", Toast.LENGTH_SHORT).show()
                        viewState.maestroResponseWrapper?.let { maestroResponseWrapper ->
                            setupTabAndBrowse(maestroResponseWrapper)
                        }
                    }
                    is MaestroFragmentViewState.Error -> {
                        Toast.makeText(activity, "fail", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        )
    }
}
