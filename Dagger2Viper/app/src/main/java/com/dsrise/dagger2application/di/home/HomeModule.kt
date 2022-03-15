package com.dsrise.dagger2application.di.home

import android.app.Activity
import com.dsrise.dagger2application.viper.HomeContract
import com.dsrise.dagger2application.viper.HomeInteracter
import com.dsrise.dagger2application.viper.HomePresenter
import com.dsrise.dagger2application.viper.HomeRouter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class HomeModule {
    @Singleton
    @Provides
    fun provideHomePresenter(
        router: HomeRouter,
        interacter: HomeInteracter
    ): HomeContract.Presenter {
        return HomePresenter(router, interacter)
    }

    @Singleton
    @Provides
    fun provideHomeRouter(
        activity: Activity
    ): HomeContract.Router {
        return HomeRouter(activity)
    }
}