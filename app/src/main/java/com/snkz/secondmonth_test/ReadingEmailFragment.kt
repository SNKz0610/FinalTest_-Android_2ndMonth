package com.snkz.secondmonth_test

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.app.NavUtils
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentManager
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.navArgs
import androidx.navigation.ui.setupActionBarWithNavController
import com.snkz.secondmonth_test.databinding.ActivityReadingEmailBinding
import com.snkz.secondmonth_test.databinding.FragmentListEmailBinding
import com.snkz.secondmonth_test.databinding.FragmentReadingEmailBinding

class ReadingEmailFragment : Fragment() {
    private lateinit var bindingReading: FragmentReadingEmailBinding
    private val args by navArgs<ReadingEmailFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindingReading = DataBindingUtil.inflate(inflater, R.layout.fragment_reading_email, container, false)
        val view : View = bindingReading.root
        val toolbar : Toolbar = bindingReading.toolbarFragmentreadingemail


        setHasOptionsMenu(true)
        (activity as AppCompatActivity).setSupportActionBar(toolbar)
        (activity as AppCompatActivity).setTitle(R.string.app_name_3)
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        (activity as AppCompatActivity).supportActionBar?.setDisplayShowHomeEnabled(true)

        bindingReading.imageReadingemailFarvorite.setImageResource(args.mailInformation.farvoriteStatus)
        bindingReading.imageReadingemailAvatar.setImageResource(args.mailInformation.avatar)
        bindingReading.textReadingemailHeader.text = args.mailInformation.des
        bindingReading.textReadingemailSender.text = args.mailInformation.name
        bindingReading.textReadingemailTime.text = args.mailInformation.time
        bindingReading.textReadingemailContentmail.text = args.mailInformation.content

        return view
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_readingemailacticvity_toolbar, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }


}