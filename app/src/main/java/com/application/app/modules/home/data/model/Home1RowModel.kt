package com.application.app.modules.home.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Home1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoremIpsumIs: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)

)
