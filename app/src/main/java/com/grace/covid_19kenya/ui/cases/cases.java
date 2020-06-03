package com.grace.covid_19kenya.ui.cases;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.grace.covid_19kenya.JSONPlaceHolderAPI;
import com.grace.covid_19kenya.Model.Cases;
import com.grace.covid_19kenya.Model.WorldCases;
import com.grace.covid_19kenya.R;

import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class cases extends Fragment {

    private TextView KReported, KRecovered, KDeaths;
    private TextView WReported, WRecovered, WDeaths;
    private Button Refresh;
    private OkHttpClient.Builder builder = new OkHttpClient.Builder();

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_cases, container, false);

        KReported = root.findViewById(R.id.kenya_reported);
        KRecovered = root.findViewById(R.id.kenya_recovered);
        KDeaths = root.findViewById(R.id.kenya_deaths);
        WReported = root.findViewById(R.id.world_reported);
        WRecovered = root.findViewById(R.id.world_recovered);
        WDeaths = root.findViewById(R.id.world_death);
        Refresh = root.findViewById(R.id.Refresh);

        ReadDatabase();
        ReadDatabaseWorld();

        Refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ReadDatabase();
                ReadDatabaseWorld();
            }
        });
        return root;
    }

    private JSONPlaceHolderAPI ReadJSON(String Url){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Url)
                .addConverterFactory(GsonConverterFactory.create())
                .client(builder.build())
                .build();
        return retrofit.create(JSONPlaceHolderAPI.class);
    }

    private void ReadDatabase(){
        String URL = "https://api.covid19api.com/";
        Call<List<Cases>> listCall = ReadJSON(URL).getKenyaCases();

        listCall.enqueue(new Callback<List<Cases>>() {
            @Override
            public void onResponse(Call<List<Cases>> call, Response<List<Cases>> response) {
                if (!response.isSuccessful()){
                    Toast.makeText(getContext(), "Something is not right. Try again" + response.code(), Toast.LENGTH_SHORT).show();
                }

                List<Cases> casesList = response.body();

                for (Cases cases : casesList){
                    KReported.setText(cases.getConfirmed());
                    KRecovered.setText(cases.getRecovered());
                    KDeaths.setText(cases.getDeaths());
                    //Active.setText(cases.getActive());
                }
            }

            @Override
            public void onFailure(Call<List<Cases>> call, Throwable t) {

            }
        });
    }

    private void ReadDatabaseWorld() {

        String URl = "https://api.covid19api.com/";
        Call<WorldCases> listCall = ReadJSON(URl).getWorldCases();

        listCall.enqueue(new Callback<WorldCases>() {
            @Override
            public void onResponse(Call<WorldCases> call, Response<WorldCases> response) {
                if (!response.isSuccessful()){
                    Toast.makeText(getContext(), "Response was not successful", Toast.LENGTH_SHORT).show();
                }

                WorldCases casesList = response.body();

                    WReported.setText(casesList.getTotalConfirmed());
                    WRecovered.setText(casesList.getTotalRecovered());
                    WDeaths.setText(casesList.getTotalDeaths());
                    //Active.setText(cases.getActive());

            }

            @Override
            public void onFailure(Call<WorldCases> call, Throwable t) {
                Log.w("On Failure", t);
            }
        });

    }
}