package com.josephwong.maestrofication.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.josephwong.maestrofication.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Setting a fragment, nothing fancy.
        val ft: FragmentTransaction = supportFragmentManager.beginTransaction()
        ft.add(R.id.container, MainFragment.newInstance())
        ft.commit()
    }
}
