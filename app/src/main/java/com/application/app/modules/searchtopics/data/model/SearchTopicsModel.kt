package com.application.app.modules.searchtopics.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class SearchTopicsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtExploreTopics: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_explore_topics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBooks: String? = MyApp.getInstance().resources.getString(R.string.lbl_books)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFiction: String? = MyApp.getInstance().resources.getString(R.string.lbl_fiction)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtComics: String? = MyApp.getInstance().resources.getString(R.string.lbl_comics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtArt: String? = MyApp.getInstance().resources.getString(R.string.lbl_art)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtVisualDesign: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_visual_design)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTechnology: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_technology)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtScience: String? = MyApp.getInstance().resources.getString(R.string.lbl_science)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBusiness: String? = MyApp.getInstance().resources.getString(R.string.lbl_business)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPsychology: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_psychology)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCreativity: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_creativity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEducation: String? = MyApp.getInstance().resources.getString(R.string.lbl_education)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFeminism: String? = MyApp.getInstance().resources.getString(R.string.lbl_feminism)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtArtificialInte: String? =
      MyApp.getInstance().resources.getString(R.string.msg_artificial_inte)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHealth: String? = MyApp.getInstance().resources.getString(R.string.lbl_health)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDesign: String? = MyApp.getInstance().resources.getString(R.string.lbl_design)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etSearchBarValue: String? = null
)
