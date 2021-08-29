package com.learn.lavsam.mytranslatorl1.presenter

import android.view.View
import com.learn.lavsam.mytranslatorl1.model.data.AppState

interface Presenter<T : AppState, V : View> {

    fun attachView(view: V)

    fun detachView(view: V)

    fun getData(word: String, isOnline: Boolean)
}