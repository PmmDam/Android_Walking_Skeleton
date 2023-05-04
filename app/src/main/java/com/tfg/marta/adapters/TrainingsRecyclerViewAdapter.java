package com.tfg.marta.adapters;

import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.tfg.marta.R;
import com.tfg.marta.databinding.AdapterTrainingRecyclerViewBinding;


import com.tfg.marta.models.TrainingModel;


import java.io.InputStream;
import java.net.URL;
import java.util.List;


public class TrainingsRecyclerViewAdapter extends RecyclerView.Adapter<TrainingsRecyclerViewAdapter.ViewHolder> {

    private final List<TrainingModel> trainings;

    public TrainingsRecyclerViewAdapter(List<TrainingModel> trainings) {
        this.trainings = trainings;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                return new  ViewHolder(AdapterTrainingRecyclerViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = trainings.get(position);
        holder.trainingIdLbl.setText(holder.mItem.getId());
        holder.trainingNameLbl.setText(holder.mItem.getName());
        Glide.with(holder.trainingIdLbl.getContext())
                .load(holder.mItem.getImageUrl())
                .centerCrop()
                .placeholder(R.drawable.ic_placeholder_24)
                .into(holder.trainingImageUrlImageView);
    }

    @Override
    public int getItemCount() {
        return trainings.size();
    }




    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView trainingIdLbl;
        public final TextView trainingNameLbl;
        public ImageView trainingImageUrlImageView;
        public TrainingModel mItem;


        public ViewHolder(AdapterTrainingRecyclerViewBinding binding) {
            super(binding.getRoot());
            trainingIdLbl = binding.trainingId;
            trainingNameLbl = binding.trainingName;
            trainingImageUrlImageView = (ImageView)binding.trainingImageUrl;

        }

        @Override
        public String toString() {
            return super.toString() + " '" + trainingNameLbl.getText() + "'";
        }
    }
}