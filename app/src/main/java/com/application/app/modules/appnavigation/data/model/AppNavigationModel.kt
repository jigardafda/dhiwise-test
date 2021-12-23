package com.application.app.modules.appnavigation.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtExplore: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBlog: String? = MyApp.getInstance().resources.getString(R.string.lbl_blog)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtInterests: String? = MyApp.getInstance().resources.getString(R.string.lbl_interests)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSearchTopics: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_search_topics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtInterestsTopics: String? =
      MyApp.getInstance().resources.getString(R.string.msg_interests_topic)

)
