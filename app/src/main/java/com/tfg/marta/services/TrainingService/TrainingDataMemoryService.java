package com.tfg.marta.services.TrainingService;

import com.tfg.marta.data.DataMemory;
import com.tfg.marta.models.TrainingModel;
import com.tfg.marta.models.UserModel;

import java.util.List;

public class TrainingDataMemoryService implements ITrainingService{

    DataMemory data = new DataMemory();


    @Override
    public List<TrainingModel> getTrainings() {
        return data.trainings;
    }

    @Override
    public TrainingModel getTrainingById(String id) {
        TrainingModel selectedTraining = null;
        for (TrainingModel training : data.trainings) {
            if(training.getId().equals(id)){
                selectedTraining = training;
            }
        }
        return selectedTraining;
    }
}
