package com.application.app.modules.intereststopics2.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.intereststopics2.`data`.model.InterestsTopics2Model

public class InterestsTopics2VM : ViewModel() {
  public val interestsTopics2Model: MutableLiveData<InterestsTopics2Model> =
      MutableLiveData(InterestsTopics2Model())
}
