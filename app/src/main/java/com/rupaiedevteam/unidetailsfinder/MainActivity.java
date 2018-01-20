package com.rupaiedevteam.unidetailsfinder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getUserList();
    }

    private void getUserList() {
        try {
            APIService apiService = ApiClient.getRetrofit().create(APIService.class);
            Call<University> call = apiService.getUserData();
            call.enqueue(new Callback<University>() {
                @Override
                public void onResponse(Call<University> call, Response<University> response) {
//                    Log.d("onResponse",response.message());
                    University university = response.body();
                    List<University_> universityList = university.getUniversity();

                    linearLayoutManager = new LinearLayoutManager(MainActivity.this);
                    RecyclerView recyclerView = (RecyclerView)findViewById(R.id.unilistView);
                    linearLayoutManager = new LinearLayoutManager(MainActivity.this);
                    recyclerView.setLayoutManager(linearLayoutManager);

                    RecycleViewAdapter recycleViewAdapter = new RecycleViewAdapter(universityList);
                    recyclerView.setAdapter(recycleViewAdapter);

                }

                @Override
                public void onFailure(Call<University> call, Throwable t) {

                }
            });

        }catch (Exception e){

        }
    }
}
