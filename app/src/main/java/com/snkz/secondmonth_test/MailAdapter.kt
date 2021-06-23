package com.snkz.secondmonth_test

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.snkz.secondmonth_test.databinding.ItemListemailMailBinding

class MailAdapter(val arrMails: ArrayList<Mail>) : RecyclerView.Adapter<MailAdapter.Viewholder>() {
    private var statusFarvorite = 1;

    class Viewholder(val binding: ItemListemailMailBinding) : RecyclerView.ViewHolder(binding.root) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MailAdapter.Viewholder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemListemailMailBinding.inflate(layoutInflater, parent, false)
        return Viewholder(binding)
    }

    override fun onBindViewHolder(holder: MailAdapter.Viewholder, position: Int) {
        val mail: Mail = arrMails.get(position)
        if (mail != null) {
            holder.binding.imageItemListemailAvatar.setImageResource(mail.avatar)
            holder.binding.textItemListemailName.text = mail.name
            holder.binding.textItemListemailDes.text = mail.des
            holder.binding.textItemListemailContent.text = mail.content
            holder.binding.textItemListemailDate.text = mail.time
            holder.binding.imagaeListemailFarvorite.setOnClickListener {
                statusFarvorite += 1
                if (statusFarvorite % 2 == 0) {
                    holder.binding.imagaeListemailFarvorite.setImageResource(R.drawable.ic_baseline_star_ticked_24)
                } else {
                    holder.binding.imagaeListemailFarvorite.setImageResource(R.drawable.ic_baseline_star_border_24)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        if (arrMails != null) {
            return arrMails.size
        }
        return 0
    }
}