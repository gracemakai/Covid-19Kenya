package com.grace.covid_19kenya.ui.prevention;

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

public class prevention extends Fragment {

    private PreventionViewModel preventionViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        preventionViewModel = ViewModelProviders.of(this).get(PreventionViewModel.class);
        View root = inflater.inflate(R.layout.fragment_prevention, container, false);

        return root;
    }
}