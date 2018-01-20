package com.rupaiedevteam.unidetailsfinder;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Sarker Rabi on 19-01-18.
 */

public interface APIService {

    @GET("displayAll.php")
    Call<University> getUserData();
}
