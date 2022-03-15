package com.dsrise.dagger2application.viper

import com.dsrise.dagger2application.model.Joke
import io.reactivex.rxjava3.core.Single

interface HomeContract {
    interface View {
        fun showLoading()
        fun hideLoading()
        fun publishResult(result: Any)
        fun displayMessage(message: String)
    }

    interface Presenter {
        fun bindView(homeView: HomeContract.View)
        fun unBindView()
        fun onViewCreated()
        fun onItemClicked(joke: Joke)
    }

    interface Interacter {
        fun getJokes(onSucess: (List<Joke>) -> Unit, onError: (Throwable) -> Unit)
    }

    interface Router {
        fun finish()
        fun openJokeDetail(joke: Joke)
    }

    interface Repository {
        fun getJokes(): Single<List<Joke>>
    }
}