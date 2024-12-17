package com.hajera.projectmobile.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hajera.projectmobile.Adapter.CardViewMovieAdapter;
import com.hajera.projectmobile.Model.Movie;
import com.hajera.projectmobile.Data.MoviewData;
import com.hajera.projectmobile.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.

 */
public class HomeFragment extends Fragment {

    private RecyclerView rvMovie;
    private ArrayList<Movie> list = new ArrayList<>();

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        rvMovie = view.findViewById(R.id.homefragment);
        rvMovie.setHasFixedSize(true);

        list.addAll(MoviewData.getListData());
        showRecylerMoviel();

        return view;
    }

    private void showRecylerMoviel() {
        rvMovie.setLayoutManager(new GridLayoutManager(this.getContext(), 2));
        CardViewMovieAdapter cardViewViewHolder = new CardViewMovieAdapter(this.getContext());
        cardViewViewHolder.setListMovie(list);
        rvMovie.setAdapter(cardViewViewHolder);


    }

}