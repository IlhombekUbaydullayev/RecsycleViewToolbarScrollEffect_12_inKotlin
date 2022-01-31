package com.example.recsycleviewtoolbarscrolleffect_12_injava.activity

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.example.recsycleviewtoolbarscrolleffect_12_injava.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.recsycleviewtoolbarscrolleffect_12_injava.adapter.CustomAdapter
import com.example.recsycleviewtoolbarscrolleffect_12_injava.model.Member
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private var context: Context? = null
    private var recyclerView: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        val members = prepareMemberList()
        refreshAdapter(members)
    }

    private fun initView() {
        context = this
        recyclerView = findViewById(R.id.recycleView)
        recyclerView!!.layoutManager = GridLayoutManager(context, 1)
    }

    private fun refreshAdapter(members: List<Member>) {
        val adapter = CustomAdapter(this, members)
        recyclerView!!.adapter = adapter
    }

    private fun prepareMemberList(): List<Member> {
        val members = ArrayList<Member>()
        for (i in 0..29) {
            members.add(Member("Ilhombek$i", "Ubaydullayev$i"))
        }
        return members
    }
}