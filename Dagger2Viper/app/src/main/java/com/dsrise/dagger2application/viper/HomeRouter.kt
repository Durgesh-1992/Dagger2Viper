package com.dsrise.dagger2application.viper

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import com.dsrise.dagger2application.model.Joke
import javax.inject.Inject

class HomeRouter @Inject constructor(private val activity: Activity) : HomeContract.Router {
    override fun finish() {
    }

    override fun openJokeDetail(joke: Joke) {
    }
}