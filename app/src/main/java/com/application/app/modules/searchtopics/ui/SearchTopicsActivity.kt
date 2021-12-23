package com.application.app.modules.searchtopics.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySearchTopicsBinding
import com.application.app.modules.searchtopics.`data`.viewmodel.SearchTopicsVM
import kotlin.String
import kotlin.Unit

public class SearchTopicsActivity :
    BaseActivity<ActivitySearchTopicsBinding>(R.layout.activity_search_topics) {
  private val viewModel: SearchTopicsVM by viewModels<SearchTopicsVM>()

  public override fun setUpClicks(): Unit {
  }

  public override fun onInitialized(): Unit {
    binding.searchTopicsVM = viewModel
  }

  public companion object {
    public const val TAG: String = "SEARCH_TOPICS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SearchTopicsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
