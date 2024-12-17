package com.hajera.projectmobile.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hajera.projectmobile.Model.Library;
import com.hajera.projectmobile.R;

import java.util.ArrayList;

public class ListLibraryAdapter extends RecyclerView.Adapter<ListLibraryAdapter.listViewHolder> {
    private Context context;
    private ArrayList<Library> listLibrary;

    public ArrayList<Library> getListLibrary(){
        return listLibrary;
    }

    public void setListLibrary(ArrayList<Library> listLibrary){
        this.listLibrary = listLibrary;
    }

    public ListLibraryAdapter (ArrayList<Library> list){
        this.listLibrary = list;
    }
    @NonNull
    @Override
    public ListLibraryAdapter.listViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_cinema, viewGroup, false);
        return new listViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListLibraryAdapter.listViewHolder holder, int position) {
        Library library = listLibrary.get(position);


        holder.imgPhoto.setImageResource(library.getPhoto());

        holder.tvName.setText(library.getName());
        holder.tvDeskripsi.setText(library.getDeskripsi());


    }

    @Override
    public int getItemCount() {
        return listLibrary.size();
    }

    class listViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imgPhoto;
        TextView tvName, tvDeskripsi;
        public listViewHolder(View view) {
            super(view);
            imgPhoto = view.findViewById(R.id.img_item_library);
            tvName = view.findViewById(R.id.tv_item_library_name);
            tvDeskripsi = view.findViewById(R.id.tv_item_library_deskripsi);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Library library = getListLibrary().get(position);
            library.setName(library.getName());
            library.setPhoto(library.getPhoto());
            library.setDeskripsi(library.getDeskripsi());

        }
    }
}
