package com.josephwong.maestrofication.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.airbnb.epoxy.EpoxyRecyclerView
import com.josephwong.maestrofication.R
import com.josephwong.maestrofication.ui.launcher.LauncherActivity

class MainFragment : Fragment() {

    private lateinit var recyclerView: EpoxyRecyclerView

    companion object {
        fun newInstance(): MainFragment {
            return MainFragment()
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
        recyclerView.setController(MainNavItemController(object : NavigationOnClickListener {
            override fun onBrowseDemoClicked() {
                startActivity(Intent(activity, LauncherActivity::class.java))
            }
        }))

        MainNavItemController(object : NavigationOnClickListener {
            override fun onBrowseDemoClicked() {
                startActivity(Intent(activity, LauncherActivity::class.java))
            }
        })
    }


    interface NavigationOnClickListener {
        fun onBrowseDemoClicked()
    }
}