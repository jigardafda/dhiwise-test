package com.application.app.modules.explore.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class ExploreModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtCategory: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
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
  public var txtLoremIpsumIs: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recommended_for)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etSerachBoxValue: String? = null
)
