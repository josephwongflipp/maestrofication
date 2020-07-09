package com.josephwong.maestrofication.ui.launcher

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.facebook.shimmer.ShimmerFrameLayout
import com.josephwong.maestrofication.R
import com.josephwong.maestrofication.ui.browse.BrowseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LauncherActivity : AppCompatActivity() {
    private val viewModel: LauncherActivityViewModel by viewModels()

    private lateinit var shimmer: ShimmerFrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_launcher)

        shimmer = findViewById(R.id.shimmer)
        shimmer.startShimmer()

        viewModel.fetchExploreMaestroForNavigationTabs()

        viewModel.viewState.observe(
            this,
            Observer { viewState ->
                when (viewState) {
                    LauncherActivityViewState.Loading -> {
                        // TODO: Show a loading spinner woo
                    }
                    is LauncherActivityViewState.Ready -> {
                        Toast.makeText(this, "success", Toast.LENGTH_SHORT).show()

                        startActivity(Intent(this, BrowseActivity::class.java))
                    }
                    is LauncherActivityViewState.Error -> {
                        Toast.makeText(this, "fail", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        )

    }

}
