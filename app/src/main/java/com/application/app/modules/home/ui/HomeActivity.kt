package com.application.app.modules.home.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.core.view.GravityCompat
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.appcomponents.di.MyApp
import com.application.app.databinding.ActivityHomeBinding
import com.application.app.extensions.alert
import com.application.app.extensions.neutralButton
import com.application.app.modules.blog.ui.BlogActivity
import com.application.app.modules.home.`data`.model.Home1RowModel
import com.application.app.modules.home.`data`.model.Home2RowModel
import com.application.app.modules.home.`data`.viewmodel.HomeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  public override fun setUpClicks(): Unit {
  }

  private fun toggleDrawer(): Unit {
    if (!binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
                    binding.drawerLayout.openDrawer(GravityCompat.START)
                }
                else {
                    binding.drawerLayout.closeDrawer(GravityCompat.START)
                }
  }

  public fun onClickRecyclerPeopleList(
    view: View,
    position: Int,
    item: Home1RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public fun onClickRecyclerStoryList(
    view: View,
    position: Int,
    item: Home2RowModel
  ): Unit {
    when(view.id) {
    R.id.linearGroup16 -> {
    val destIntent = BlogActivity.getIntent(this, null)
    startActivity(destIntent)
    }


    }
  }

  public override fun onInitialized(): Unit {
    val recyclerPeopleListAdapter =
                       
            RecyclerPeopleListAdapter(viewModel.recyclerPeopleListList.value?:mutableListOf())
    binding.recyclerPeopleList.adapter = recyclerPeopleListAdapter
    recyclerPeopleListAdapter.setOnItemClickListener(
                object : RecyclerPeopleListAdapter.OnItemClickListener {
                    override fun onItemClick(view:View, position:Int, item : Home1RowModel) {
                        onClickRecyclerPeopleList(view, position, item)
                    }
                }
                )
    viewModel.recyclerPeopleListList.observe(this) {
                    recyclerPeopleListAdapter.updateData(it)
                }
    val recyclerStoryListAdapter =
                       
        RecyclerStoryListAdapter(viewModel.recyclerStoryListList.value?:mutableListOf())
    binding.recyclerStoryList.adapter = recyclerStoryListAdapter
    recyclerStoryListAdapter.setOnItemClickListener(
                object : RecyclerStoryListAdapter.OnItemClickListener {
                    override fun onItemClick(view:View, position:Int, item : Home2RowModel) {
                        onClickRecyclerStoryList(view, position, item)
                    }
                }
                )
    viewModel.recyclerStoryListList.observe(this) {
                    recyclerStoryListAdapter.updateData(it)
                }
    binding.homeVM = viewModel

        this@HomeActivity.alert(MyApp.getInstance().getString(R.string.lbl_stes),
        MyApp.getInstance().getString(R.string.lbl_sdfsdf)){
    neutralButton{
    }
    }
  }

  public companion object {
    public const val TAG: String = "HOME_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
