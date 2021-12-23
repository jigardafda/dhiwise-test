package com.application.app.modules.home.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.home.`data`.model.Home1RowModel
import com.application.app.modules.home.`data`.model.Home2RowModel
import com.application.app.modules.home.`data`.model.HomeModel
import com.application.app.modules.itemdrawermenu.`data`.model.DrawerItemDrawerMenuModel
import kotlin.collections.MutableList

public class HomeVM : ViewModel() {
  public val homeModel: MutableLiveData<HomeModel> = MutableLiveData(HomeModel())

  public var includedModel: MutableLiveData<DrawerItemDrawerMenuModel> =
      MutableLiveData(DrawerItemDrawerMenuModel())

  public val recyclerPeopleListList: MutableLiveData<MutableList<Home1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerStoryListList: MutableLiveData<MutableList<Home2RowModel>> =
      MutableLiveData(mutableListOf())
}
