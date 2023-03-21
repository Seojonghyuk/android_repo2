package com.example.recyclerkt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.NonDisposableHandle.parent
import kotlinx.coroutines.newCoroutineContext

class ProfileAdapter(val profileList: ArrayList<profiles>) : RecyclerView.Adapter<ProfileAdapter.CustomViewHolder>()
{




    override fun onBindViewHolder(holder: ProfileAdapter.CustomViewHolder, position: Int) {
        holder.gender.setImageResource(profileList.get(position).gender)
        holder.name.text = profileList.get(position).name
        holder.age.text = profileList.get(position).age.toString()
        holder.job.text = profileList.get(position).job

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return CustomViewHolder(view).apply {
            itemView.setOnClickListener {
                val curPos : Int = adapterPosition
                val profile: profiles = profileList.get(curPos)
                Toast.makeText(parent.context, "이름 : ${profile.name} 나이 : ${profile.age} 직업 : ${profile.job}", Toast.LENGTH_SHORT).show()
            }
        }
    }


    override fun getItemCount(): Int {
        return profileList.size
    }


    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val gender = itemView.findViewById<ImageView>(R.id.ivprofile)
        val name = itemView.findViewById<TextView>(R.id.tvname)
        val age = itemView.findViewById<TextView>(R.id.tvage)
        val job = itemView.findViewById<TextView>(R.id.tvjob)

    }


}
