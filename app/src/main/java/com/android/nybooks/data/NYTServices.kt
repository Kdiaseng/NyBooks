package com.android.nybooks.data


import com.android.nybooks.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface NYTServices {
    @GET("lists.json")
    fun getBooks(
        @Query("api-key") apiKey: String = "I0MpBaIPksEZFQRXRbxFm7h8IpniaYux",
        @Query("list") list: String = "hardcover-fiction"
    ): Call<BookBodyResponse>
}