package com.application.app.modules.intereststopics2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityInterestsTopics2Binding
import com.application.app.modules.intereststopics2.`data`.viewmodel.InterestsTopics2VM
import com.google.android.material.tabs.TabLayoutMediator
import kotlin.String
import kotlin.Unit

public class InterestsTopics2Activity :
    BaseActivity<ActivityInterestsTopics2Binding>(R.layout.activity_interests_topics2) {
  private val viewModel: InterestsTopics2VM by viewModels<InterestsTopics2VM>()

  public override fun setUpClicks(): Unit {
  }

  public override fun onInitialized(): Unit {
    binding.interestsTopics2VM = viewModel
    val adapter = InterestsTopics2ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerGroup30.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup4,binding.viewPagerGroup30) { tab, position ->
                tab.text = InterestsTopics2ActivityPagerAdapter.title[position]
                }.attach()
  }

  public companion object {
    public const val TAG: String = "INTERESTS_TOPICS2ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, InterestsTopics2Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
