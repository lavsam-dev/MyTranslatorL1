package com.learn.lavsam.mytranslatorl1.view.main

import com.learn.lavsam.mytranslatorl1.model.data.AppState
import com.learn.lavsam.mytranslatorl1.model.data.DataModel
import com.learn.lavsam.mytranslatorl1.model.repository.Repository
import com.learn.lavsam.mytranslatorl1.presenter.Interactor
import io.reactivex.Observable

class MainInteractor(
    private val remoteRepository: Repository<List<DataModel>>,
    private val localRepository: Repository<List<DataModel>>
) : Interactor<AppState> {

    override fun getData(word: String, fromRemoteSource: Boolean): Observable<AppState> {
        return if (fromRemoteSource) {
            remoteRepository.getData(word).map { AppState.Success(it) }
        } else {
            localRepository.getData(word).map { AppState.Success(it) }
        }
    }
}