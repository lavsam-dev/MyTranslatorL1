package com.learn.lavsam.mytranslatorl1.model.repository

import io.reactivex.Observable

interface Repository<T> {

    fun getData(word: String): Observable<T>
}