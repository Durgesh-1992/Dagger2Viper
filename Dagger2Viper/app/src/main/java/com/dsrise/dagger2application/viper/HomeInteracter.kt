package com.dsrise.dagger2application.viper

import com.dsrise.dagger2application.model.Joke
import javax.inject.Inject

class HomeInteracter @Inject constructor(respository: HomeContract.Repository) :
    HomeContract.Interacter {
    override fun getJokes(onSucess: (List<Joke>) -> Unit, onError: (Throwable) -> Unit) {
    }
}