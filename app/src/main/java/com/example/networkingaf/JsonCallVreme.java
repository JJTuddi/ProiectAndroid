package com.example.networkingaf;
import androidx.annotation.NonNull;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/*class Coordonate {
    public static String lat = "44.948", lon = "23.24";

    @NonNull
    public static String getCoord() {
        return "lat=" + Coordonate.lat + "&lon=" + Coordonate.lon;
    }
}*/
public interface JsonCallVreme {
    @Headers({"x-rapidapi-key:5ffc76f849msh62784f66ee8e23bp1a8695jsn09c27faf9af3", "x-rapidapi-host:weatherbit-v1-mashape.p.rapidapi.com"})
    @GET("current?lat=44.948&lon=23.24")
    Call<Vreme> getPosts();
}
