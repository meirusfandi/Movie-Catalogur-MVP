package com.example.root.moviecatalogue.views.navigasi;import android.content.Context;import com.example.root.moviecatalogue.baseMVP.InteractorClass;import com.example.root.moviecatalogue.model.MovieModel;import com.example.root.moviecatalogue.network.MovieService;import java.util.List;import io.reactivex.Observable;public class MainInteractorClass extends InteractorClass<MovieService> implements MainInteractor {    private Context context;    public MainInteractorClass(MovieService movieService){        super(movieService);    }    public MainInteractorClass(MovieService movieService, Context context){        super(movieService);        this.context = context;    }    @Override    public Observable<List<MovieModel>> fetchUpComingMovies() {        return null;    }    @Override    public Observable<List<MovieModel>> fetchNowPlayingMovies() {        return null;    }}