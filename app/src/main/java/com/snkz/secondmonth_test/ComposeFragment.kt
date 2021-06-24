package com.snkz.secondmonth_test

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import com.snkz.secondmonth_test.databinding.FragmentComposeBinding

class ComposeFragment : Fragment() {
    private lateinit var bindingCompose : FragmentComposeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindingCompose = DataBindingUtil.inflate(inflater,R.layout.fragment_compose, container, false)
        val view : View =  bindingCompose.root
        val toolbar : Toolbar = bindingCompose.toolbarCompose

        setHasOptionsMenu(true)
        (activity as AppCompatActivity).setSupportActionBar(toolbar)
        (activity as AppCompatActivity).setTitle(R.string.app_name_2)
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        (activity as AppCompatActivity).supportActionBar?.setDisplayShowHomeEnabled(true)

        return view
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_mainactivity, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }
}