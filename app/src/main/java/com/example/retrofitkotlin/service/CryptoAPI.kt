package com.example.retrofitkotlin.service

import com.example.retrofitkotlin.model.CryptoModel
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {
    //GET,POST,UPDATE,DELETE
    @GET("prices?key=d11cfaa9137dfd2af0215b069940d4be3d3d394a")
    //fun getData():Call<List<CryptoModel>>
    fun getData():Observable<List<CryptoModel>>
}