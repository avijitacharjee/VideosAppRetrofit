package com.panacea.videosappretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by DELL on 11/10/2019.
 */

public interface ApiInterface {
    @GET("user")
    Call<List<User>> getUsers();
}
