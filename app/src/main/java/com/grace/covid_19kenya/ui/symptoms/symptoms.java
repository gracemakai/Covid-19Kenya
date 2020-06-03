package com.grace.covid_19kenya.ui.symptoms;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.grace.covid_19kenya.R;

public class symptoms extends Fragment {

    private SymptomsViewModel symptomsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        symptomsViewModel =
                ViewModelProviders.of(this).get(SymptomsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_symptoms, container, false);

        return root;
    }
}