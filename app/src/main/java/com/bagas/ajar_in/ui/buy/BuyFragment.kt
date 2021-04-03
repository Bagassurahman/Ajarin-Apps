package com.bagas.ajar_in.ui.buy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.bagas.ajar_in.R

class BuyFragment : Fragment() {

    private lateinit var dashboardViewModel: BuyViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
                ViewModelProviders.of(this).get(BuyViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_buy, container, false)
        return root
    }
}