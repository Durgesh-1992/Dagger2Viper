package com.dsrise.dagger2application.di.home

import com.dsrise.dagger2application.viper.HomeContract
import com.dsrise.dagger2application.viper.HomeInteracter
import com.dsrise.dagger2application.viper.HomePresenter
import com.dsrise.dagger2application.viper.HomeRouter
import dagger.Module
import dagger.Provides

@Module
class HomeModule {

    @Provides
    fun provideHomePresenter(
        router: HomeRouter,
        interacter: HomeInteracter
    ): HomeContract.Presenter {
        return HomePresenter(router, interacter)
    }

}