package com.application.app.modules.blog.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.blog.`data`.model.BlogModel

public class BlogVM : ViewModel() {
  public val blogModel: MutableLiveData<BlogModel> = MutableLiveData(BlogModel())
}
