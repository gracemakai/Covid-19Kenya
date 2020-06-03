package com.grace.covid_19kenya.ui.cases;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CasesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CasesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is cases fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}