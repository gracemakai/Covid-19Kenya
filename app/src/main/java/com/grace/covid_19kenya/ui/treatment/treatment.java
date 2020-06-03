package com.grace.covid_19kenya.ui.treatment;

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

public class treatment extends Fragment {

    private TreatmentViewModel treatmentViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        treatmentViewModel =
                ViewModelProviders.of(this).get(TreatmentViewModel.class);
        View root = inflater.inflate(R.layout.fragment_treatment, container, false);

        return root;
    }
}