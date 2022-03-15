package com.dsrise.dagger2application.di.home

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import com.dsrise.dagger2application.ui.HomeActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [HomeModule::class])
interface HomeComponent {

    fun inject(homeActivity: HomeActivity)

    //    @Component.Factory
//    interface  Component{
//        fun create():HomeComponent
//    }
    @Component.Builder
    interface Builder {

        fun build(): HomeComponent

        fun activity(@BindsInstance activity: AppCompatActivity):Builder

    }
}