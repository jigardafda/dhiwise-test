package com.application.app.modules.interestspeople.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.interestspeople.`data`.model.InterestsPeople1RowModel
import com.application.app.modules.interestspeople.`data`.model.InterestsPeopleModel
import kotlin.collections.MutableList

public class InterestsPeopleVM : ViewModel() {
  public val interestsPeopleModel: MutableLiveData<InterestsPeopleModel> =
      MutableLiveData(InterestsPeopleModel())

  public val recyclerPeopleListList: MutableLiveData<MutableList<InterestsPeople1RowModel>> =
      MutableLiveData(mutableListOf())
}
