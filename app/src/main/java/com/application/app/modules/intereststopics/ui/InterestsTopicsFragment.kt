package com.application.app.modules.intereststopics.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseFragment
import com.application.app.databinding.FragmentInterestsTopicsBinding
import com.application.app.modules.intereststopics.`data`.model.InterestsTopics1RowModel
import com.application.app.modules.intereststopics.`data`.viewmodel.InterestsTopicsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class InterestsTopicsFragment :
    BaseFragment<FragmentInterestsTopicsBinding>(R.layout.fragment_interests_topics) {
  private val viewModel: InterestsTopicsVM by viewModels<InterestsTopicsVM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerTopicList(
    view: View,
    position: Int,
    item: InterestsTopics1RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public override fun onInitialized(): Unit {
    val recyclerTopicListAdapter =
                    RecyclerTopicListAdapter(viewModel.recyclerTopicListList.value?:mutableListOf())
    binding.recyclerTopicList.adapter = recyclerTopicListAdapter
    recyclerTopicListAdapter.setOnItemClickListener(
            object : RecyclerTopicListAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item : InterestsTopics1RowModel) {
                    onClickRecyclerTopicList(view, position, item)
                }
            }
            )
    viewModel.recyclerTopicListList.observe(requireActivity()) {
                recyclerTopicListAdapter.updateData(it)
            }
    binding.interestsTopicsVM = viewModel
  }

  public companion object {
    public const val TAG: String = "INTERESTS_TOPICS_FRAGMENT"
  }
}
