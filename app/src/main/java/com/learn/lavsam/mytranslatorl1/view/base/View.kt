package com.learn.lavsam.mytranslatorl1.view.base

import com.learn.lavsam.mytranslatorl1.model.data.AppState

interface View {

    fun renderData(appState: AppState)
}