package com.example.root.moviecatalogue.views.search;import com.example.root.moviecatalogue.baseMVP.BaseInteractor;import com.example.root.moviecatalogue.model.MovieModel;import com.example.root.moviecatalogue.network.MovieService;import java.util.List;import io.reactivex.Observable;public interface SearchInteractor extends BaseInteractor<MovieService>{    Observable<List<MovieModel>> fetchSearchMovies(String movieName);}