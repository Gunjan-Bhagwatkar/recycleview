
package org.codeway.recyclev

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class CustomAdapter(val userlist:ArrayList<user>): RecyclerView.Adapter<CustomAdapter.viewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.useritem,parent,false)
        return viewHolder(view)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.tvMobile.text = userlist[position].mobile
        holder.tvName.text = userlist[position].name
        if (userlist[position].img==1)
        {
            holder.ivUser.setImageResource(R.drawable.boy)
        }
        else if(userlist[position].img==2)
        {
            holder.ivUser.setImageResource(R.drawable.girl)
        }
        else
        {
            holder.ivUser.setImageResource(R.drawable.businesswoman)
        }
        holder.ivUser.setOnClickListener{

            val intent = Intent(holder.tvName.context,DetailedView::class.java)
            intent.putExtra("user_name",userlist[position].name)
            intent.putExtra("mobile_number",userlist[position].mobile)
            holder.tvName.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return userlist.size
    }
    class viewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val ivUser : ImageView = itemView.findViewById(R.id.ivUser)
        val tvName: TextView = itemView.findViewById(R.id.tvName)
        val tvMobile: TextView = itemView.findViewById(R.id.tvMobile)

    }


}