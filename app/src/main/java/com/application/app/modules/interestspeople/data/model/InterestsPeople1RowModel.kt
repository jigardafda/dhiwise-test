package com.application.app.modules.interestspeople.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class InterestsPeople1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_john_doe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_is)

)
