package com.application.app.modules.interestspeople.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class InterestsPeopleModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoremIpsumIs: String? =
      MyApp.getInstance().resources.getString(R.string.msg_see_all_people)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMorePeopleTo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_more_people_to)

)
