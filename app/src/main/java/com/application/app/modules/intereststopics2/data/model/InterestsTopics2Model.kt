package com.application.app.modules.intereststopics2.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class InterestsTopics2Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtCategory: String? = MyApp.getInstance().resources.getString(R.string.lbl_interests)

)
