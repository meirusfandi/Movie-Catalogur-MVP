package com.example.root.moviecatalogue.views.navigasi;import android.util.Log;import com.example.root.moviecatalogue.baseMVP.PresenterClass;import com.example.root.moviecatalogue.model.MovieModel;import java.util.List;import io.reactivex.Observable;import io.reactivex.android.schedulers.AndroidSchedulers;import io.reactivex.disposables.CompositeDisposable;import io.reactivex.schedulers.Schedulers;public class MainPresenter<V extends MainView, I extends MainInteractor> extends PresenterClass<V,I> {    public MainPresenter(I interactor, CompositeDisposable compositeDisposable) {        super(interactor, compositeDisposable);    }    public void fetchMoviesFromState(List<MovieModel> movies) {        getBaseView().displayMovies(movies);    }    public void fetchMovies(int movie) {        getBaseView().showLoading(true);        Observable<List<MovieModel>> observableMovies = null;        if (movie == 0) {            observableMovies = getBaseInteractor().fetchNowPlayingMovies();        } else if (movie == 1) {            observableMovies = getBaseInteractor().fetchUpComingMovies();        }        getCompositeDisposable().add(observableMovies.                subscribeOn(Schedulers.io())                .observeOn(AndroidSchedulers.mainThread())                .subscribe(movies -> {                    getBaseView().showLoading(false);                    getBaseView().displayMovies(movies);                }, throwable -> {                    getBaseView().showLoading(false);                    getBaseView().onError(throwable.getLocalizedMessage());                    Log.e("error", throwable.getLocalizedMessage());                }));    }}