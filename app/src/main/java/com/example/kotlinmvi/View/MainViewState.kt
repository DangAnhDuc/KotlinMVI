package com.example.kotlinmvi.View


class MainViewState (internal var isLoading:Boolean,
                     internal var isImageViewShow:Boolean,
                     internal var imageLink:String,
                    internal var error: Throwable?
)