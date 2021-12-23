package com.application.app.modules.intereststopics.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowInterestsTopics1Binding
import com.application.app.modules.intereststopics.`data`.model.InterestsTopics1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerTopicListAdapter(
  public var list: List<InterestsTopics1RowModel>
) : RecyclerView.Adapter<RecyclerTopicListAdapter.RowInterestsTopics1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<InterestsTopics1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowInterestsTopics1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_interests_topics1,parent,false)
    return RowInterestsTopics1VH(view)
  }

  public override fun onBindViewHolder(holder: RowInterestsTopics1VH, position: Int): Unit {
    val interestsTopics1RowModel = InterestsTopics1RowModel()
    // TODO uncomment following line after integration with data source
    // val interestsTopics1RowModel = list[position]
    holder.binding.interestsTopics1RowModel = interestsTopics1RowModel
  }

  public override fun getItemCount(): Int = 9
  // TODO uncomment following line after integration with data source
  // return list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: InterestsTopics1RowModel
    ): Unit {
    }
  }

  public inner class RowInterestsTopics1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowInterestsTopics1Binding = RowInterestsTopics1Binding.bind(itemView)
  }
}
