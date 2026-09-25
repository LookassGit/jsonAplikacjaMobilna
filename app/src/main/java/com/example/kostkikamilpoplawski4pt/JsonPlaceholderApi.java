package com.example.kostkikamilpoplawski4pt;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceholderApi {
    @GET
    public Call<ArrayList<Pytanie>> getPytania();
}
