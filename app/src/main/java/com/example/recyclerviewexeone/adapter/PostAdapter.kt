package com.example.recyclerviewexeone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexeone.R
import com.example.recyclerviewexeone.model.Post
import kotlinx.android.synthetic.main.item_post.view.*

class PostAdapter (var postList: List<Post>): RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
    inner class PostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind (post: Post) {
            itemView.txtName.text = post.name
            itemView.profileImage.setImageResource(post.profileImage)
            itemView.txtHour.text = post.postedHour.toString()
            itemView.txtLoveCount.text = post.loveCount.toString()
            itemView.txtCommentCount.text = post.commentCount.toString()
            itemView.txtShareCount.text = post.shareCount.toString()
            itemView.imgPosted.setImageResource(post.postedImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return PostViewHolder(view)
    }

    override fun getItemCount(): Int = postList.size

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.bind(postList[position])
    }

}