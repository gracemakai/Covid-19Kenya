package com.grace.covid_19kenya;

import com.google.gson.JsonArray;
import com.grace.covid_19kenya.Model.Cases;
import com.grace.covid_19kenya.Model.WorldCases;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JSONPlaceHolderAPI {
    @GET("total/dayone/country/kenya")
    Call<List<Cases>> getKenyaCases();

    @GET("world/total")
     Call <WorldCases> getWorldCases();
}
