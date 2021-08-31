package com.learn.lavsam.mytranslatorl1.presenter

import com.learn.lavsam.mytranslatorl1.model.data.AppState
import com.learn.lavsam.mytranslatorl1.view.base.View

interface Presenter<T : AppState, V : View> {

    fun attachView(view: V)

    fun detachView(view: V)

    fun getData(word: String, isOnline: Boolean)
}