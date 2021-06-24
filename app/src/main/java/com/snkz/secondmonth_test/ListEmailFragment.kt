package com.snkz.secondmonth_test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.snkz.secondmonth_test.databinding.FragmentListEmailBinding

class ListEmailFragment : Fragment() {
    private lateinit var listBinding : FragmentListEmailBinding
    private var arrMail : ArrayList<Mail> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        listBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_list_email, container, false)
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        (activity as AppCompatActivity).supportActionBar?.setDisplayShowHomeEnabled(true)
        val view : View = listBinding.root

        createListMails()
        listBinding.revListemailMail.adapter = MailAdapter(arrMail)
        listBinding.revListemailMail.layoutManager = LinearLayoutManager(context)

        listBinding.fabListemailWritingemail.setOnClickListener {
            val action = ListEmailFragmentDirections.actionListEmailFragmentToComposeFragment()
            findNavController().navigate(action)
        }

        return view
    }

    private fun createListMails() : ArrayList<Mail>{
        arrMail.add(Mail(R.drawable.avatar1, "Nguyen Manh Duy", "Deadline ngay mai", "Lmao lam bai tap chua", "June 23", R.drawable.ic_baseline_star_border_24))
        arrMail.add(Mail(R.drawable.avatar2, "Nguyen Hong Son", "Deadline PTTK", "Game la de~", "June 22",R.drawable.ic_baseline_star_border_24))
        arrMail.add(Mail(R.drawable.avatar3, "Pham Thanh Binh", "Go pro ko?", "Chieu mai ban onlan k?", "June 18",R.drawable.ic_baseline_star_border_24))
        arrMail.add(Mail(R.drawable.avatar4, "Le Viet Linh", "Tuyen pro go major", "Thieu 1 slot stack 5 kia`", "June 5",R.drawable.ic_baseline_star_border_24))
        arrMail.add(Mail(R.drawable.avatar5, "Thay Que", "Het han deadline", "O. Ka", "June 2",R.drawable.ic_baseline_star_border_24))
        return arrMail
    }

}