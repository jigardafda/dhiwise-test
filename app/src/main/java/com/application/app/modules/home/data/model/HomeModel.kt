package com.application.app.modules.home.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtCategory: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtScience: String? = MyApp.getInstance().resources.getString(R.string.lbl_science)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoremIpsum: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_lorem_ipsum)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDesign: String? = MyApp.getInstance().resources.getString(R.string.lbl_design)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTopStories: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_top_stories)

)
