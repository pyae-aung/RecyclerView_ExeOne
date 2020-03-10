package com.example.recyclerviewexeone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewexeone.adapter.PostAdapter
import com.example.recyclerviewexeone.model.Post
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var postList = ArrayList<Post>()
        postList.add(Post("Jhon", R.drawable.profile, 2, 30,500, 40, R.drawable.couple))
        postList.add(Post("Jennifer", R.drawable.profiletwo, 1, 111,550, 44, R.drawable.coupletwo))
        postList.add(Post("George", R.drawable.profilethree, 3, 111,550, 44, R.drawable.couplethree))
        var postAdapter = PostAdapter(postList)

        recyclerCouple.layoutManager = LinearLayoutManager(this)
        recyclerCouple.adapter = postAdapter


    }
}
