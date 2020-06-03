package com.grace.covid_19kenya.ui.prevention;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PreventionViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PreventionViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is prevention fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}