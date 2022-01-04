package com.example.landmarks;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.landmarks.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class RecyclerLandmarkAdapter extends RecyclerView.Adapter<RecyclerLandmarkAdapter.landmarkHolder> {

    ArrayList<Landmarks> landmarkArrayList;

    public RecyclerLandmarkAdapter(ArrayList<Landmarks> landmarkArrayList) {
        this.landmarkArrayList = landmarkArrayList;
    }

    @NonNull
    @Override
    public landmarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new landmarkHolder(recyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull landmarkHolder holder, int position) {
        holder.binding.recyclerViewTextView.setText(landmarkArrayList.get(position).name);
    }

    @Override
    public int getItemCount() {
        return landmarkArrayList.size();
    }

    public class landmarkHolder extends RecyclerView.ViewHolder{

        private RecyclerRowBinding binding;

        public landmarkHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
