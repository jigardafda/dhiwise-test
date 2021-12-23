package com.application.app.modules.explore.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityExploreBinding
import com.application.app.modules.blog.ui.BlogActivity
import com.application.app.modules.explore.`data`.model.Explore1RowModel
import com.application.app.modules.explore.`data`.viewmodel.ExploreVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ExploreActivity : BaseActivity<ActivityExploreBinding>(R.layout.activity_explore) {
  private val viewModel: ExploreVM by viewModels<ExploreVM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerArticleList(
    view: View,
    position: Int,
    item: Explore1RowModel
  ): Unit {
    when(view.id) {
    R.id.linearGroup44 -> {
    val destIntent = BlogActivity.getIntent(this, null)
    startActivity(destIntent)
    }


    }
  }

  public override fun onInitialized(): Unit {
    val recyclerArticleListAdapter =
                       
            RecyclerArticleListAdapter(viewModel.recyclerArticleListList.value?:mutableListOf())
    binding.recyclerArticleList.adapter = recyclerArticleListAdapter
    recyclerArticleListAdapter.setOnItemClickListener(
                object : RecyclerArticleListAdapter.OnItemClickListener {
                    override fun onItemClick(view:View, position:Int, item : Explore1RowModel) {
                        onClickRecyclerArticleList(view, position, item)
                    }
                }
                )
    viewModel.recyclerArticleListList.observe(this) {
                    recyclerArticleListAdapter.updateData(it)
                }
    binding.exploreVM = viewModel
  }

  public companion object {
    public const val TAG: String = "EXPLORE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ExploreActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
