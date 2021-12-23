package com.application.app.modules.intereststopics.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.intereststopics.`data`.model.InterestsTopics1RowModel
import com.application.app.modules.intereststopics.`data`.model.InterestsTopicsModel
import kotlin.collections.MutableList

public class InterestsTopicsVM : ViewModel() {
  public val interestsTopicsModel: MutableLiveData<InterestsTopicsModel> =
      MutableLiveData(InterestsTopicsModel())

  public val recyclerTopicListList: MutableLiveData<MutableList<InterestsTopics1RowModel>> =
      MutableLiveData(mutableListOf())
}
