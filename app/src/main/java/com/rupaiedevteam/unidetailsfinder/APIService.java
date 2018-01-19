package com.rupaiedevteam.unidetailsfinder;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Sarker Rabi on 19-01-18.
 */

public interface APIService {

    @GET("json_bangla")
    Call<List<University>> getUserData();
}
