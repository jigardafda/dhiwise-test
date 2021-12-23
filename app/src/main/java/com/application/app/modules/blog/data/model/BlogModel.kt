package com.application.app.modules.blog.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class BlogModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtHome: String? =
      MyApp.getInstance().resources.getString(R.string.msg_john_doe_in_lor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_29_july)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTitle: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtImageCaption: String? =
      MyApp.getInstance().resources.getString(R.string.msg_image_credit_l)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDescription1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_duis_aute_irure)

)
