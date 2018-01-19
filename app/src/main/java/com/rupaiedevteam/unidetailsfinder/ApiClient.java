package com.rupaiedevteam.unidetailsfinder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Sarker Rabi on 19-01-18.
 */

public class ApiClient {

    public static final String BASE_URL = "";
    private static Retrofit retrofit =null;

    public static Retrofit getRetrofit(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit;
    }
}
