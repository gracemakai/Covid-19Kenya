package com.grace.covid_19kenya;

import com.grace.covid_19kenya.Model.WorldCases;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface WorldJSONPlaceHolderAPI {

    @GET("general-stats")
    Call<List<WorldCases>> getWorldCases();
}
