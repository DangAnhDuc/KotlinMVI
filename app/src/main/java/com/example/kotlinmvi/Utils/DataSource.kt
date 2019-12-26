package com.example.kotlinmvi.Utils

import io.reactivex.Observable


class DataSource(internal var imageList:List<String>) {

    fun getImageLinkFromList(index:Int): Observable<String> {
        return Observable.just(imageList[index])
    }
}