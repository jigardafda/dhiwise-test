package com.application.app.modules.home.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowHome1Binding
import com.application.app.modules.home.`data`.model.Home1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerPeopleListAdapter(
  public var list: List<Home1RowModel>
) : RecyclerView.Adapter<RecyclerPeopleListAdapter.RowHome1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Home1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHome1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_home1,parent,false)
    return RowHome1VH(view)
  }

  public override fun onBindViewHolder(holder: RowHome1VH, position: Int): Unit {
    val home1RowModel = Home1RowModel()
    // TODO uncomment following line after integration with data source
    // val home1RowModel = list[position]
    holder.binding.home1RowModel = home1RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Home1RowModel
    ): Unit {
    }
  }

  public inner class RowHome1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowHome1Binding = RowHome1Binding.bind(itemView)
  }
}
