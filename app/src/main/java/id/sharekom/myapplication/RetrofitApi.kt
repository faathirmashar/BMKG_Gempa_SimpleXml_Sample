package id.sharekom.myapplication

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitApi {
    @GET("autogempa.xml")
    fun getInfoGempa(): Call<Infogempa>
}