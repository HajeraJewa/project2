package com.hajera.projectmobile.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hajera.projectmobile.Model.Library;
import com.hajera.projectmobile.Data.LibraryData;
import com.hajera.projectmobile.Adapter.ListLibraryAdapter;
import com.hajera.projectmobile.R;

import java.util.ArrayList;

public class LibraryFragment extends Fragment {
    private RecyclerView rvLibrary;
    private ArrayList<Library> list = new ArrayList<>();


    public LibraryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_library, container, false);
        rvLibrary = view.findViewById(R.id.libraryFragment);
        rvLibrary.setHasFixedSize(true);

        list.addAll(LibraryData.getListData());
        showRecyclerList();

        return view;
    }

    private void showRecyclerList(){
        rvLibrary.setLayoutManager(new LinearLayoutManager(this.getContext()));
        ListLibraryAdapter listLibraryAdapter = new ListLibraryAdapter(list);
        listLibraryAdapter.setListLibrary(list);
        rvLibrary.setAdapter(listLibraryAdapter);

    }
}