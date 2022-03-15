package com.dsrise.dagger2application.viper

import com.dsrise.dagger2application.model.Joke
import javax.inject.Inject

class HomePresenter @Inject constructor(
    router: HomeContract.Router,
    interacter: HomeContract.Interacter
) : HomeContract.Presenter {
    override fun bindView(homeView: HomeContract.View) {
    }

    override fun unBindView() {
    }

    override fun onViewCreated() {
    }

    override fun onItemClicked(joke: Joke) {
    }
}