package com.application.app.modules.interestspeople.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseFragment
import com.application.app.databinding.FragmentInterestsPeopleBinding
import com.application.app.modules.interestspeople.`data`.model.InterestsPeople1RowModel
import com.application.app.modules.interestspeople.`data`.viewmodel.InterestsPeopleVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class InterestsPeopleFragment :
    BaseFragment<FragmentInterestsPeopleBinding>(R.layout.fragment_interests_people) {
  private val viewModel: InterestsPeopleVM by viewModels<InterestsPeopleVM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerPeopleList(
    view: View,
    position: Int,
    item: InterestsPeople1RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public override fun onInitialized(): Unit {
    val recyclerPeopleListAdapter =
                   
        RecyclerPeopleListAdapter(viewModel.recyclerPeopleListList.value?:mutableListOf())
    binding.recyclerPeopleList.adapter = recyclerPeopleListAdapter
    recyclerPeopleListAdapter.setOnItemClickListener(
            object : RecyclerPeopleListAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item : InterestsPeople1RowModel) {
                    onClickRecyclerPeopleList(view, position, item)
                }
            }
            )
    viewModel.recyclerPeopleListList.observe(requireActivity()) {
                recyclerPeopleListAdapter.updateData(it)
            }
    binding.interestsPeopleVM = viewModel
  }

  public companion object {
    public const val TAG: String = "INTERESTS_PEOPLE_FRAGMENT"
  }
}
