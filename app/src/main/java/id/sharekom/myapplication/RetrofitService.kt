package id.sharekom.myapplication

import retrofit2.Retrofit
import retrofit2.converter.simplexml.SimpleXmlConverterFactory

object RetrofitService {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://data.bmkg.go.id/")
        .addConverterFactory(SimpleXmlConverterFactory.create())
        .build()

    val api = retrofit.create(RetrofitApi::class.java)
}