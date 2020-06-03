package com.grace.covid_19kenya.Model;

import com.google.gson.annotations.SerializedName;

public class WorldCases {

    //@SerializedName("TotalConfirmed")
    private String TotalConfirmed;
    private String TotalDeaths;
    private String TotalRecovered;

    public String getTotalDeaths() {
        return TotalDeaths;
    }

    public String getTotalRecovered() {
        return TotalRecovered;
    }

    public String getTotalConfirmed() {
        return TotalConfirmed;
    }
}
