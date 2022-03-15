package com.dsrise.dagger2application.ui

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.dsrise.dagger2application.R
import com.dsrise.dagger2application.di.home.HomeComponent
import com.dsrise.dagger2application.viper.HomeContract
import com.dsrise.dagger2application.viper.HomePresenter
import javax.inject.Inject

class HomeActivity : AppCompatActivity(), HomeContract.View {

    @Inject
    lateinit var homePresenter: HomePresenter

    //    val component = HomeComponent by lazy {
//
//    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun publishResult(result: Any) {
    }

    override fun displayMessage(message: String) {
    }
}