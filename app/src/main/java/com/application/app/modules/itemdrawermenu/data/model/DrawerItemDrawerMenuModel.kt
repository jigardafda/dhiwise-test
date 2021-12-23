package com.application.app.modules.itemdrawermenu.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class DrawerItemDrawerMenuModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtJohnDoe: String? = MyApp.getInstance().resources.getString(R.string.lbl_john_doe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtViewProfile: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_view_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAudio: String? = MyApp.getInstance().resources.getString(R.string.lbl_audio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtReadingList: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_reading_list)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtInterests: String? = MyApp.getInstance().resources.getString(R.string.lbl_interests)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBecomeAMember: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_become_a_member)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNewStory: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_story)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtStats: String? = MyApp.getInstance().resources.getString(R.string.lbl_stats)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtStories: String? = MyApp.getInstance().resources.getString(R.string.lbl_stories)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSettings: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHelp: String? = MyApp.getInstance().resources.getString(R.string.lbl_help)

)
