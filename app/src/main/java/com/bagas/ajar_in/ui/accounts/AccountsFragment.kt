package com.bagas.ajar_in.ui.accounts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.bagas.ajar_in.PencapaianFragment
import com.bagas.ajar_in.R
import com.google.android.material.tabs.TabItem
import com.google.android.material.tabs.TabLayout


class AccountsFragment : Fragment() {

    private lateinit var accountsViewModel: AccountsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        accountsViewModel =
                ViewModelProviders.of(this).get(AccountsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_accounts, container, false)
        return root
//        val view: View = inflater.inflate(R.layout.fragment_pencapaian, null)
//        val tabLayout = view?.findViewById(R.id.tablayout) as TabLayout
//        val pencapaian = view?.findViewById(R.id.pencapaian) as TabItem
//        if(tabLayout == pencapaian){
//
//        }
    }

    fun getItem(position: Int): Fragment? {

        return when (position) {
            0 -> PencapaianFragment()
            1 -> PencapaianFragment()
            else -> null
        }
    }
}