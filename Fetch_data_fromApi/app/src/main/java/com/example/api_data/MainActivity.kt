package com.example.api_data

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

const val BASE_URL = "https://run.mocky.io/"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getMyData()

    }

    private fun getMyData() {
        val res = ApiService.instance.getUserData()
        res.enqueue(object : Callback<MyData> {
            override fun onResponse(call: Call<MyData>, response: Response<MyData>) {
                val results = response.body()
                if (results != null) {
                    Log.d("message", results.toString())
                }

            }

            override fun onFailure(call: Call<MyData>, t: Throwable) {
                Log.d("message", "Error in Fetching Data")

            }
        })


    }


}