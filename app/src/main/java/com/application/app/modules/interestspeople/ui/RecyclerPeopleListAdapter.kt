package com.application.app.modules.interestspeople.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowInterestsPeople1Binding
import com.application.app.modules.interestspeople.`data`.model.InterestsPeople1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerPeopleListAdapter(
  public var list: List<InterestsPeople1RowModel>
) : RecyclerView.Adapter<RecyclerPeopleListAdapter.RowInterestsPeople1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<InterestsPeople1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowInterestsPeople1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_interests_people1,parent,false)
    return RowInterestsPeople1VH(view)
  }

  public override fun onBindViewHolder(holder: RowInterestsPeople1VH, position: Int): Unit {
    val interestsPeople1RowModel = InterestsPeople1RowModel()
    // TODO uncomment following line after integration with data source
    // val interestsPeople1RowModel = list[position]
    holder.binding.interestsPeople1RowModel = interestsPeople1RowModel
  }

  public override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: InterestsPeople1RowModel
    ): Unit {
    }
  }

  public inner class RowInterestsPeople1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowInterestsPeople1Binding = RowInterestsPeople1Binding.bind(itemView)
  }
}
