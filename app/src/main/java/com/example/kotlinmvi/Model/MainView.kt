package com.example.kotlinmvi.Model

import com.example.kotlinmvi.View.MainViewState
import com.hannesdorfmann.mosby3.mvp.MvpView
import io.reactivex.Observable
import java.util.*

interface MainView:MvpView{
    val imageIntent: Observable<Int>
    fun render(viewState: MainViewState)
}