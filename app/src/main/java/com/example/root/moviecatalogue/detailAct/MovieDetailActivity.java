package com.example.root.moviecatalogue.detailAct;import android.support.v7.app.AppCompatActivity;import android.os.Bundle;import com.example.root.moviecatalogue.R;public class MovieDetailActivity extends AppCompatActivity {    public static final String MOVIE_INTENT = "movie_intent";    @Override    protected void onCreate(Bundle savedInstanceState) {        super.onCreate(savedInstanceState);        setContentView(R.layout.activity_movie_detail);    }}