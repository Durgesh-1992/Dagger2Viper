package com.dsrise.dagger2application.viper

import android.util.Log
import com.dsrise.dagger2application.model.Joke
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class HomeRepository @Inject constructor() : HomeContract.Repository {
    override fun getJokes(): Single<List<Joke>> {
        Log.d("VIPER_2", "getJokes: ")
        val list = ArrayList<Joke>()
        return list as Single<List<Joke>>
    }
}