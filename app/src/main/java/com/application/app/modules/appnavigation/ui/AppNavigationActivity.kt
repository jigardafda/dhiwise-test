package com.application.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAppNavigationBinding
import com.application.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.application.app.modules.blog.ui.BlogActivity
import com.application.app.modules.explore.ui.ExploreActivity
import com.application.app.modules.home.ui.HomeActivity
import com.application.app.modules.interests.ui.InterestsActivity
import com.application.app.modules.intereststopics2.ui.InterestsTopics2Activity
import com.application.app.modules.searchtopics.ui.SearchTopicsActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun setUpClicks(): Unit {
    binding.linearInterestsTopics.setOnClickListener {
    val destIntent = InterestsTopics2Activity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.linearInterests.setOnClickListener {
    val destIntent = InterestsActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.linearBlog.setOnClickListener {
    val destIntent = BlogActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.linearExplore.setOnClickListener {
    val destIntent = ExploreActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.linearHome.setOnClickListener {
    val destIntent = HomeActivity.getIntent(this, null)
    startActivity(destIntent)
    }
    binding.linearSearchTopics.setOnClickListener {
    val destIntent = SearchTopicsActivity.getIntent(this, null)
    startActivity(destIntent)
    }
  }

  public override fun onInitialized(): Unit {
    binding.appNavigationVM = viewModel
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
