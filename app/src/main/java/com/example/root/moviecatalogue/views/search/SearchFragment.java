package com.example.root.moviecatalogue.views.search;import android.net.Uri;import android.os.Bundle;import android.support.annotation.NonNull;import android.support.v4.app.Fragment;import android.view.LayoutInflater;import android.view.View;import android.view.ViewGroup;import com.example.root.moviecatalogue.R;public class SearchFragment extends Fragment {    @Override    public void onCreate(Bundle savedInstanceState) {        super.onCreate(savedInstanceState);    }    @Override    public View onCreateView(LayoutInflater inflater, ViewGroup container,                             Bundle savedInstanceState) {        // Inflate the layout for this fragment        return inflater.inflate(R.layout.fragment_search, container, false);    }    public interface OnFragmentInteractionListener {        // TODO: Update argument type and name        void onFragmentInteraction(Uri uri);    }    @Override    public void onSaveInstanceState(@NonNull Bundle outState) {        super.onSaveInstanceState(outState);    }}