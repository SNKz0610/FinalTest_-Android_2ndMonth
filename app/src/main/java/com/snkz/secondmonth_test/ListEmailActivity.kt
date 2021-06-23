package com.snkz.secondmonth_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.snkz.secondmonth_test.databinding.ActivityListEmailBinding
import com.snkz.secondmonth_test.databinding.ActivityMainBinding

class ListEmailActivity : AppCompatActivity() {
    private lateinit var listEmailBinding: ActivityListEmailBinding
    private var arrMail : ArrayList<Mail> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        listEmailBinding = DataBindingUtil.setContentView(this, R.layout.activity_list_email)
        createListMails()

        listEmailBinding.revListemailMail.adapter = MailAdapter(arrMail)
        listEmailBinding.revListemailMail.layoutManager = LinearLayoutManager(this)
    }

    private fun createListMails() : ArrayList<Mail>{
        arrMail.add(Mail(R.drawable.avatar1, "Nguyen Manh Duy", "Deadline ngay mai", "Lmao lam bai tap chua", "June 23"))
        arrMail.add(Mail(R.drawable.avatar2, "Nguyen Hong Son", "Deadline PTTK", "Game la de~", "June 22"))
        arrMail.add(Mail(R.drawable.avatar3, "Pham Thanh Binh", "Go pro ko?", "Chieu mai ban onlan k?", "June 18"))
        arrMail.add(Mail(R.drawable.avatar4, "Le Viet Linh", "Tuyen pro go major", "Thieu 1 slot stack 5 kia`", "June 5"))
        arrMail.add(Mail(R.drawable.avatar5, "Thay Que", "Het han deadline", "O. Ka", "June 2"))
        return arrMail
    }
}