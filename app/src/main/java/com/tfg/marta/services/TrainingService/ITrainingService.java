package com.tfg.marta.services.TrainingService;

import com.tfg.marta.models.TrainingModel;

import java.util.List;

public interface ITrainingService {
    List<TrainingModel> getTrainings();
    TrainingModel getTrainingById(String id);

}
