package com.example.sixpackdiet.ui.utils

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.android.material.internal.FlowLayout
import com.xiaofeng.flowlayoutmanager.FlowLayoutManager
import de.hdodenhof.circleimageview.CircleImageView

/**
 * Created by: Arun PM
 * Creation Date: 18,June,2019
 * Description : <Add here>
 */

@BindingAdapter("horizontalRecyclerViewAdapter")
fun setHorizontalRecyclerViewAdapter(view: RecyclerView, adapter: Any) {

    var recyclerViewAdapter = adapter as RecyclerView.Adapter<RecyclerView.ViewHolder>
    /* val decor = DividerItemDecoration(view.context, DividerItemDecoration.HORIZONTAL)
     view.addItemDecoration(decor)*/

    if (view.adapter == null) {
        view.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL, false)
        view.adapter = recyclerViewAdapter
    } else {
        view.adapter = recyclerViewAdapter
        //adapter.transactions = historyAdapter?.transactions
        view.adapter?.notifyDataSetChanged()
    }

}



@BindingAdapter("verticalRecyclerViewAdapter")
fun setVerticalRecyclerViewAdapter(view: RecyclerView, adapter: Any) {

    var recyclerViewAdapter = adapter as RecyclerView.Adapter<RecyclerView.ViewHolder>
    /* val decor = DividerItemDecoration(view.context, DividerItemDecoration.HORIZONTAL)
     view.addItemDecoration(decor)*/

    if (view.adapter == null) {
        view.layoutManager = LinearLayoutManager(view.context)
        view.adapter = recyclerViewAdapter
    } else {
        view.adapter = recyclerViewAdapter
        //adapter.transactions = historyAdapter?.transactions
        view.adapter?.notifyDataSetChanged()
    }

}



@BindingAdapter("flowRecyclerViewAdapter")
fun setFlowRecyclerViewAdapter(view: RecyclerView, adapter: Any) {

    var recyclerViewAdapter = adapter as RecyclerView.Adapter<RecyclerView.ViewHolder>
    /* val decor = DividerItemDecoration(view.context, DividerItemDecoration.HORIZONTAL)
     view.addItemDecoration(decor)*/

    if (view.adapter == null) {
        var flowLayout= FlowLayoutManager()
        flowLayout.isAutoMeasureEnabled = true
        view.layoutManager = flowLayout
        view.adapter = recyclerViewAdapter
    } else {
        view.adapter = recyclerViewAdapter
        //adapter.transactions = historyAdapter?.transactions
        view.adapter?.notifyDataSetChanged()
    }

}
