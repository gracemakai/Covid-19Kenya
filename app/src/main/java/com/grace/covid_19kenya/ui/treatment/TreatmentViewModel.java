package com.grace.covid_19kenya.ui.treatment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TreatmentViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TreatmentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is share fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}