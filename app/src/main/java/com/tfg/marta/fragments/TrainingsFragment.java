package com.tfg.marta.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tfg.marta.R;
import com.tfg.marta.adapters.TrainingsRecyclerViewAdapter;
import com.tfg.marta.models.TrainingModel;
import com.tfg.marta.services.TrainingService.ITrainingService;
import com.tfg.marta.services.TrainingService.TrainingDataMemoryService;

import java.util.ArrayList;
import java.util.List;

/**
 * A fragment representing a list of Items.
 */
public class TrainingsFragment extends Fragment {

    private RecyclerView _recyclerView;
    private List<TrainingModel> _trainings = new ArrayList<>();
    private TrainingsRecyclerViewAdapter _adapter;

    //Esto es un poco chapuzero porque lo suyo es gestionar inyección de dependencias
    ITrainingService _trainingService = new TrainingDataMemoryService();


    public TrainingsFragment() {
    }


    public static TrainingsFragment newInstance(int columnCount) {
        TrainingsFragment fragment = new TrainingsFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_training_recycler_view, container, false);

        _recyclerView = view.findViewById(R.id.training_list);
        _trainings = _trainingService.getTrainings();
        _adapter = new TrainingsRecyclerViewAdapter(_trainings);
        _recyclerView.setAdapter(_adapter);

        return view;
    }



}

