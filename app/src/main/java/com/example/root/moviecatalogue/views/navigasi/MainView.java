package com.example.root.moviecatalogue.views.navigasi;import com.example.root.moviecatalogue.baseMVP.BaseView;import com.example.root.moviecatalogue.model.MovieModel;import java.util.List;public interface MainView extends BaseView{    void showLoading(boolean isShowLoading);    void displayMovies(List<MovieModel> movieModels);}