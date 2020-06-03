package com.grace.covid_19kenya.ui.symptoms;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SymptomsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SymptomsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is tools fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}