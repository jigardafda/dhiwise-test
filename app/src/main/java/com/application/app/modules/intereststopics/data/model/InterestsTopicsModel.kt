package com.application.app.modules.intereststopics.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class InterestsTopicsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtArtEntertain: String? =
      MyApp.getInstance().resources.getString(R.string.msg_arts_entertai)

)
